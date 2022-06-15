package ex20_3_server;

import java.net.Socket;
public class ClientExample3 {

	public static void main(String[] args) {
		System.out.println("여기는 클라이언트 입니다.");
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 9001);
			//socket = new Socket("192.168.10.100",9000);

			Thread thread2 = new ReceiverThread(socket);
			Thread thread1 = new SenderThread(socket);
			
			//두 스레드를 시작함
			thread1.start();
			thread2.start();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}//socket 닫으면 안된다.
	}
}
