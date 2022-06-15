package ex20_3_server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
	private Socket socket;
	
	SenderThread(Socket socket){
		this.socket = socket;
	}
//	Ű����� ���� ���ڿ��� �Է¹޽��ϴ�.
//    "bye"�� �Է��ϸ� �ݺ����� ���������ϴ�.
//     Ű����� ���� �Է¹��� ���ڿ��� Ŭ���̾�Ʈ�� �����մϴ�.
	public void run() {
		PrintWriter writer=null;
    	BufferedReader reader=null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            writer = new PrintWriter(socket.getOutputStream());
            
            while (!socket.isClosed()) {
            	//Ű����κ��� ���ڿ��� �Է¹޴´�.
                String str = reader.readLine();
            	
                //����ڰ� "bye"��� �Է��ϸ� �ݺ����� ���������ϴ�.
                if (str.equals("bye"))
                   break;
                
                //�Էµ� ���ڿ��� �۽��մϴ�.
    			writer.println(str);
                writer.flush();
            }
        }
        catch (Exception e) {        	
            System.out.println(e.getMessage());
        }   
        finally {
            try {
                writer.close();
            	// writer-close();
            }
            catch (Exception e) {
            	e.printStackTrace();
            }
            try {
            	reader.close();
                //reader-close();
            }//������� ��Ʈ���� �����ٸ� ���� ������. new InputStreamReader(System.in), socket.getOutputStream()
            catch (Exception e) {
            	e.printStackTrace();
            }
        }
	}
}
