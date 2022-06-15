package ex20_2_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {

	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//���� ������ ���� ��û�� ��ٸ��ٰ�
			//���� ��û�� ���� ������ �ΰ� �� �ٸ� ������ �����Ѵ�.
			serverSocket = new ServerSocket(9001);// ���� ���� ����
			
			//accept() �޼���: ���� �������� �����û�� ������ ������ �ΰ�
			//Ŭ���̾�Ʈ ������ ������ �����ϴ� �޼���
			socket = serverSocket.accept();

			/*
			 * InputStreamReader Ŭ����:
			 * 	����Ʈ ��Ʈ���� ���� ��Ʈ������ �ٲپ��ִ� Ŭ����
			 *  �� Ŭ������ �����ڿ� �������κ��� ���� InputStream��ü�� �Ѱ��ָ�
			 *  ��Ʈ��ũ�� ���ŵ� �����͸� ���� ��Ʈ�� ���·� ���� �� �ִ�
			 * InputStreamReader ��ü�� �����ȴ�.
			 */
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			/*
			 * PrintWriter Ŭ������ �̿��Ͽ� ���� ��Ʈ���� ����Ʈ ��Ʈ������ �ٲپ 
			 * ����ϱ����ؼ��� �� Ŭ������ �����ڿ� OutputStream Ÿ���� ��ü�� �Ķ���ͷ� �Ѱ��־�� �Ѵ�.
			 */
			
			PrintWriter writer = 
					new PrintWriter(socket.getOutputStream());
			
			//�����͸� �����Ѵ�.
			String str = reader.readLine();
			
			//�����͸� ȭ�鿡 ����Ѵ�.
			System.out.println(str);
			
			//�����͸� �۽��Ѵ�.
			writer.println("Hello, Client2");
			/*
			 * PrintWriter Ŭ������ println()�޼���� ���ڿ��� ����ϸ� �� ���ڿ���
			 * �޼��� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ°��� �ƴ϶� ���۰� �� �� ������ ������ٰ� 
			 * �Ѳ����� �۽ŵȴ�.
			 * �׷��� println()�޼��带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ���
			 * flush�޼��带 ȣ���ؾ� �Ѵ�.
			 */
			writer.flush();
			
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
