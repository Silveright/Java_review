package ex20_3_server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	private Socket socket;
	
	ReceiverThread(Socket socket){
	 this.socket = socket;
	}
	
//	��� : Ŭ���̾�Ʈ�κ��� �޽����� ����(reader.readLine())�ؼ� ����ͷ� ����մϴ�.
//    ������ ������ �������� ���ŵ� ���ڿ��� null�Դϴ�.
//    null�̸� �ݺ����� ����ϴ�.      
//    ��¹�)System.out.println("����>" + str);
	public void run() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));

			while (!socket.isClosed()) {
				
				String str = reader.readLine();

				 //������ ������ �������� null�� �����մϴ�.
				if(str == null)
				break;//���� ���� ��� return�� �ᵵ ��������� �ݺ����� ��� ���� ������ ������ ���� ��� return���� �����Ե��� �� ��� �ǳʶٰԵ� ���� break������ ó���ϴ� ���� �ùٸ���.
				// ���ŵ� �޽����� ����ͷ� ����մϴ�.
				System.out.println("����>" + str);
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
