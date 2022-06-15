package ex20_3_server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	private Socket socket;
	
	ReceiverThread(Socket socket){
	 this.socket = socket;
	}
	
//	기능 : 클라이언트로부터 메시지를 수신(reader.readLine())해서 모니터로 출력합니다.
//    소켓의 연결이 끊어지면 수신된 문자열은 null입니다.
//    null이면 반복문을 벗어납니다.      
//    출력문)System.out.println("수신>" + str);
	public void run() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));

			while (!socket.isClosed()) {
				
				String str = reader.readLine();

				 //소켓의 연결이 끊어지면 null을 리턴합니다.
				if(str == null)
				break;//지금 같은 경우 return을 써도 상관없지만 반복문을 벗어나 다음 수행할 문장이 있을 경우 return문을 만나게됐을 때 모두 건너뛰게됨 따라서 break문으로 처리하는 것이 올바르다.
				// 수신된 메시지를 모니터로 출력합니다.
				System.out.println("수신>" + str);
			}
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		} finally {
			try {
				if (reader !=null)
					reader.close();//socket.getOutputStream() 같이 닫힌다.
			}
			catch(Exception e ) {
				System.out.println(e.getStackTrace());
			}
		   //reader  close()
		}
	}
}
