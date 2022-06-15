package ex20_3_server;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerExample3 {

	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.");
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);// 서버 소켓 생성
			socket = serverSocket.accept();
			
			System.out.println("==============접속정보==============");
			System.out.println(socket.getInetAddress().getHostAddress()+
					"에서 접속하였습니다.");
			//getInetAddress().getHostAddress()- 소켓이 연결되어 있는 ip주소를 반환
			System.out.println("=================================");
			
			//두 스레드를 생성
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//두 스레드를 시작함
			thread1.start();
			thread2.start();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
		} 
		finally {
			/*
			 * SenderThread, ReceiverThread에서 사용하는 socket을 닫아주면 안된다
			 */
//			try {
//				socket.close();//소켓을 닫는다.
//			} catch(Exception ignored) {
//				System.out.println("소켓 닫는 중 에러입니다.");
//			}
			try {
				serverSocket.close();//서버 소켓을 닫는다.
			} catch(Exception ignored) {
				System.out.println("서버 소켓 닫는 중 에러입니다.");
			}
		}
	}
}
