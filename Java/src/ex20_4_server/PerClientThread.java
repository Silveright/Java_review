package ex20_4_server;
//각 클라이언트 접속에 대해 하나씩 작동하는 스레드 클래스
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread{
	//ArrayList객체를 여러 스레드가 동시에 사용하게되면 문제가 발생할 수 있어
	//안전하게 공유할 수 있는 동기화된 리스트로 만든다.
	//동기화된 리스트로 만들기 위해 java.util.Collections 클래스의
	//synchronizedList메서드를 이용한다.
	
	private static List<PrintWriter> list//데이터를 내보내는 출력스트림 PrintWriter
					= Collections.synchronizedList(new ArrayList<PrintWriter>());
					//Collections의 synchronizedList 메서드를 통해 동기화리스트로 만든다.
	private Socket socket;
	private PrintWriter writer;
	
	PerClientThread(Socket socket){
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);//리스트에 소켓의 출력 스트림을 등록한다.
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
//	기능) 수신된 첫번째 문자열을 대화명으로 사용합니다.
//    연결된 모든 클라이언트에게 "#" + name + "님이 들어오셨습니다" 보냅니다.
//    수신된 메시지 앞에 대화명을 붙여 모든 클라이언트로 송신합니다.       
//    수신된 메시지가 null이면 무한반복 벗어납니다.
//    클라이언트가  채팅 종료한 경우       "#" + name + "님이 나가셨습니다" 메시지 보냅니다.
	
	public void run() {//서버에 클라이언트 접속시 실행됨
        String name = null;
        BufferedReader reader = null;
        try {
             reader = new BufferedReader(
            		 	new InputStreamReader(socket.getInputStream()));
             			//socket의 생성: 대화 통로의 생성            
             /*
              * SenderThread.java에서 
              * writer.println(name);
              * writer.flush();
              * 		로 보낸 name을 아래의 문장에서 읽어온다.
              * 
              */
            //수신된 첫번째 문자열을 대화명으로 사용하기 위해 저장합니다.
            name = reader.readLine();           
            sendAll("#" + name + "님이 들어오셨습니다");
            
            while (!socket.isClosed()) {
            	String str = reader.readLine();
            	
            	//소켓의 연결이 끊어지면 null을 리턴합니다.
            	if (str == null)
            		break;
            	
            	//수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신합니다.
            	sendAll(name + ">" + str);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            list.remove(writer);
            
            //사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보냅니다.
            sendAll("#"+ name + "님이 나가셨습니다");
           
            try {
                reader.close();
            }catch (Exception ignored) {
            	System.out.println("소켓 닫는 중에 에러 발생했습니다.");
            }
        }
     }//run end
   
	//서버에 연결된 모든 클라이언트로 똑같은 메시지를 보낸다.
     synchronized private void sendAll(String str){//기능을 다 마칠동안 lock
    	 for(PrintWriter writer : list) {
    		 writer.println(str);
    		 writer.flush();
    		 //socket을 통해 내보낸다. (여러사람에게 보낸다>>반복문)
    	 }
	}
}
