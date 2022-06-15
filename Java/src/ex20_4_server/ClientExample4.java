package ex20_4_server;

import java.net.Socket;

public class ClientExample4 {

	public static void main(String[] args) {
		//args �Ķ���ͷ� ��ȭ���� �Է� �޴´�.
		if(args.length != 1) {
			System.out.println("��ȭ���� �Է��ϼ���");
			return;
		}
		
		try {
			//������ ������ �δ´�.
			Socket socket = new Socket("127.0.0.1", 9002);
			//socket = new Socket("192.168.10.100",9000);
			
			//�޽��� �۽� ������ ����
			Thread thread1 = new SenderThread(socket,args[0]);
			
			//�޽��� ���� ������ ����
			Thread thread2 = new ReceiverThread(socket);
			
			//�� �����带 ������
			thread1.start();
			thread2.start();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}//socket ������ �ȵȴ�.
	}
}
