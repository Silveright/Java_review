package ex20_4_server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample4 {

	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.");
		ServerSocket serverSocket = null;
		
		try {
			//이 문장을 while문에 넣지 않도록 주의한다. 서버 소켓은 하나를 만들어 사용함
			serverSocket = new ServerSocket(9002);// 서버 소켓 생성
			
			while(true) {
				//연결 요청이 오면 소켓을 생성한다.
				//accept메서드: 서버 소켓으로 연결 요청이 들어오면 연결을 맺고
				//클라이언트 소켓을 생성해서 리턴하는 메서드
				Socket socket = serverSocket.accept();
				
				//요청이 올 때마다 스레드 생성
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}
