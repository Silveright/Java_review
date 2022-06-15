package ex20_3_server;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerExample3 {

	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.");
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);// ���� ���� ����
			socket = serverSocket.accept();
			
			System.out.println("==============��������==============");
			System.out.println(socket.getInetAddress().getHostAddress()+
					"���� �����Ͽ����ϴ�.");
			//getInetAddress().getHostAddress()- ������ ����Ǿ� �ִ� ip�ּҸ� ��ȯ
			System.out.println("=================================");
			
			//�� �����带 ����
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//�� �����带 ������
			thread1.start();
			thread2.start();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
		} 
		finally {
			/*
			 * SenderThread, ReceiverThread���� ����ϴ� socket�� �ݾ��ָ� �ȵȴ�
			 */
//			try {
//				socket.close();//������ �ݴ´�.
//			} catch(Exception ignored) {
//				System.out.println("���� �ݴ� �� �����Դϴ�.");
//			}
			try {
				serverSocket.close();//���� ������ �ݴ´�.
			} catch(Exception ignored) {
				System.out.println("���� ���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
