package ex20_2_server;

import java.net.Socket;
import java.io.*;
public class ClientExample2 {

	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ �Դϴ�.");
		Socket socket = null;
		try {
			//�����ڸ� ȣ���ϸ� �� ������ �ȿ��� ���� ���α׷����� �����û�� ���۵ǰ�
			//�� ��� Ŭ���̾�Ʈ ���α׷��� ���� ���α׷��� ������ �ξ����� �ȴ�.
			//������ �����Ѵ�.
			socket = new Socket("127.0.0.1", 9001);
			//socket = new Socket("192.168.10.100",9000);

			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			
			
			//�����͸� �۽��Ѵ�.
			//prinln�޼��� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �� ������ ������ٰ� �Ѳ����� �۽ŵȴ�.
			//�׷��� ������ prinln�޼��带 ȣ���� ���� �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ��� flush�޼��带 ȣ���ؾ� �Ѵ�.
			writer.println("Hello, Server2");
			writer.flush();
			
			String str = reader.readLine();
			System.out.println(str);

		
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
