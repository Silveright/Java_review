package ex20_3_server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
	private Socket socket;
	
	SenderThread(Socket socket){
		this.socket = socket;
	}
//	키보드로 부터 문자열을 입력받습니다.
//    "bye"를 입력하면 반복문을 빠져나갑니다.
//     키보드로 부터 입력받은 문자열을 클라이언트로 전송합니다.
	public void run() {
		PrintWriter writer=null;
    	BufferedReader reader=null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            writer = new PrintWriter(socket.getOutputStream());
            
            while (!socket.isClosed()) {
            	//키보드로부터 문자열을 입력받는다.
                String str = reader.readLine();
            	
                //사용자가 "bye"라고 입력하면 반복문을 빠져나갑니다.
                if (str.equals("bye"))
                   break;
                
                //입력된 문자열을 송신합니다.
    			writer.println(str);
                writer.flush();
            }
        }
        catch (Exception e) {        	
            System.out.println(e.getMessage());
        }   
        finally {
            try {
                writer.close();
            	// writer-close();
            }
            catch (Exception e) {
            	e.printStackTrace();
            }
            try {
            	reader.close();
                //reader-close();
            }//보조기반 스트림이 닫힌다면 같이 닫힌다. new InputStreamReader(System.in), socket.getOutputStream()
            catch (Exception e) {
            	e.printStackTrace();
            }
        }
	}
}
