package ex20_1_server;

import java.net.Socket;
import java.io.*;
public class ClientExample1 {

	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ �Դϴ�.");
		Socket socket = null;
		try {
			//�����ڸ� ȣ���ϸ� �� ������ �ȿ��� ���� ���α׷����� �����û�� ���۵ǰ�
			//�� ��� Ŭ���̾�Ʈ ���α׷��� ���� ���α׷��� ������ �ξ����� �ȴ�.
			//������ �����Ѵ�.
			socket = new Socket("127.0.0.1", 9000);
			//socket = new Socket("192.168.10.100",9000);
			//������ ���ſ� ����� �Է� ��Ʈ�� ��ü�� �����ϴ� �޼���
			InputStream in = socket.getInputStream();
			
			//������ �۽ſ� ����� ��� ��Ʈ�� ��ü�� �����ϴ� �޼���
			OutputStream out = socket.getOutputStream();
			
			String str = "Hello, Server";
			//getBytes �޼���� ���ڿ��� ����Ʈ �迭�� ����� �޼����̴�.
			//���ڷ� �Ѱ��� �����͸� �۽��Ѵ�.
			out.write(str.getBytes());
			
			byte arr[] = new byte[128];
			in.read(arr);//�����͸� �����Ѵ�.
			System.out.println(new String(arr));//���ŵ� ������ ���
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();//������ �ݴ´�.
			} catch(Exception ignored) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
			
		}
	}
}
