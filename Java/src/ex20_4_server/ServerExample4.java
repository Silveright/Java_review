package ex20_4_server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample4 {

	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.");
		ServerSocket serverSocket = null;
		
		try {
			//�� ������ while���� ���� �ʵ��� �����Ѵ�. ���� ������ �ϳ��� ����� �����
			serverSocket = new ServerSocket(9002);// ���� ���� ����
			
			while(true) {
				//���� ��û�� ���� ������ �����Ѵ�.
				//accept�޼���: ���� �������� ���� ��û�� ������ ������ �ΰ�
				//Ŭ���̾�Ʈ ������ �����ؼ� �����ϴ� �޼���
				Socket socket = serverSocket.accept();
				
				//��û�� �� ������ ������ ����
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}
