package ex20_4_server;

import java.net.Socket;

public class ClientExample4 {

	public static void main(String[] args) {
		//args 파라미터로 대화명을 입력 받는다.
		if(args.length != 1) {
			System.out.println("대화명을 입력하세요");
			return;
		}
		
		try {
			//서버와 연결은 맺는다.
			Socket socket = new Socket("127.0.0.1", 9002);
			//socket = new Socket("192.168.10.100",9000);
			
			//메시지 송신 스레드 생성
			Thread thread1 = new SenderThread(socket,args[0]);
			
			//메시지 수신 스레드 생성
			Thread thread2 = new ReceiverThread(socket);
			
			//두 스레드를 시작함
			thread1.start();
			thread2.start();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}//socket 닫으면 안된다.
	}
}
