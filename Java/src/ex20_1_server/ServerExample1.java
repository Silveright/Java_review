package ex20_1_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample1 {

	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//���� ������ ���� ��û�� ��ٸ��ٰ�
			//���� ��û�� ���� ������ �ΰ� �� �ٸ� ������ �����Ѵ�.
			serverSocket = new ServerSocket(9000);// ���� ���� ����
			
			//accept() �޼���: ���� �������� �����û�� ������ ������ �ΰ�
			//Ŭ���̾�Ʈ ������ ������ �����ϴ� �޼���
			socket = serverSocket.accept();

			//������ ���ſ� ����� �Է� ��Ʈ�� ��ü�� �����ϴ� �޼���
			InputStream in = socket.getInputStream();
			
			//������ �۽ſ� ����� ��� ��Ʈ�� ��ü�� �����ϴ� �޼���
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[128];
			in.read(arr);//�����͸� �����Ѵ�.
			//���ŵ� �����͸� ����Ѵ�.
			System.out.println(new String(arr));//�˾ƺ� �� �ִ� ���ڿ��� �ٲ� �� �ֵ��� String ��ü ����
			
			String str = "Hello, Client";//����Ʈ�� �������� ��
			//getBytes() �޼���� ���ڿ��� ����Ʈ �迭�� ����� �޼���
			out.write(str.getBytes());//�����͸� �۽��Ѵ�.
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();//������ �ݴ´�.
			} catch(Exception ignored) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
			try {
				serverSocket.close();//���� ������ �ݴ´�.
			} catch(Exception ignored) {
				System.out.println("���� ���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
