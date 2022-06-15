package ex20_4_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	private Socket socket;
	
	ReceiverThread(Socket socket){
	 this.socket = socket;
	}
	
	public void run() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));

			while (!socket.isClosed()) {
				
				String str = reader.readLine();

				 //������ ������ �������� null�� �����մϴ�.
				if(str == null)
				break;//���� ���� ��� return�� �ᵵ ��������� �ݺ����� ��� ���� ������ ������ �ִٸ� ��� �ǳʶٰԵ�	
				// ���ŵ� �޽����� ����ͷ� ����մϴ�.
				System.out.println(str);
			}
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		} finally {
			try {
				if (reader !=null)
					reader.close();//socket.getOutputStream() ���� ������.
			}
			catch(Exception e ) {
				System.out.println(e.getStackTrace());
			}
		   //reader  close()
		}
	}
}
