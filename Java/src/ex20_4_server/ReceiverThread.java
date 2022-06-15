package ex20_4_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	private Socket socket;
	
	ReceiverThread(Socket socket){
	 this.socket = socket;
	}
	
	public void run() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));

			while (!socket.isClosed()) {
				
				String str = reader.readLine();

				 //소켓의 연결이 끊어지면 null을 리턴합니다.
				if(str == null)
				break;//지금 같은 경우 return을 써도 상관없지만 반복문을 벗어나 다음 수행할 문장이 있다면 모두 건너뛰게됨	
				// 수신된 메시지를 모니터로 출력합니다.
				System.out.println(str);
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
