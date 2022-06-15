package ex20_4_server;
//�� Ŭ���̾�Ʈ ���ӿ� ���� �ϳ��� �۵��ϴ� ������ Ŭ����
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread{
	//ArrayList��ü�� ���� �����尡 ���ÿ� ����ϰԵǸ� ������ �߻��� �� �־�
	//�����ϰ� ������ �� �ִ� ����ȭ�� ����Ʈ�� �����.
	//����ȭ�� ����Ʈ�� ����� ���� java.util.Collections Ŭ������
	//synchronizedList�޼��带 �̿��Ѵ�.
	
	private static List<PrintWriter> list//�����͸� �������� ��½�Ʈ�� PrintWriter
					= Collections.synchronizedList(new ArrayList<PrintWriter>());
					//Collections�� synchronizedList �޼��带 ���� ����ȭ����Ʈ�� �����.
	private Socket socket;
	private PrintWriter writer;
	
	PerClientThread(Socket socket){
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);//����Ʈ�� ������ ��� ��Ʈ���� ����Ѵ�.
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
//	���) ���ŵ� ù��° ���ڿ��� ��ȭ������ ����մϴ�.
//    ����� ��� Ŭ���̾�Ʈ���� "#" + name + "���� �����̽��ϴ�" �����ϴ�.
//    ���ŵ� �޽��� �տ� ��ȭ���� �ٿ� ��� Ŭ���̾�Ʈ�� �۽��մϴ�.       
//    ���ŵ� �޽����� null�̸� ���ѹݺ� ����ϴ�.
//    Ŭ���̾�Ʈ��  ä�� ������ ���       "#" + name + "���� �����̽��ϴ�" �޽��� �����ϴ�.
	
	public void run() {//������ Ŭ���̾�Ʈ ���ӽ� �����
        String name = null;
        BufferedReader reader = null;
        try {
             reader = new BufferedReader(
            		 	new InputStreamReader(socket.getInputStream()));
             			//socket�� ����: ��ȭ ����� ����            
             /*
              * SenderThread.java���� 
              * writer.println(name);
              * writer.flush();
              * 		�� ���� name�� �Ʒ��� ���忡�� �о�´�.
              * 
              */
            //���ŵ� ù��° ���ڿ��� ��ȭ������ ����ϱ� ���� �����մϴ�.
            name = reader.readLine();           
            sendAll("#" + name + "���� �����̽��ϴ�");
            
            while (!socket.isClosed()) {
            	String str = reader.readLine();
            	
            	//������ ������ �������� null�� �����մϴ�.
            	if (str == null)
            		break;
            	
            	//���ŵ� �޽��� �տ� ��ȭ���� �ٿ��� ��� Ŭ���̾�Ʈ�� �۽��մϴ�.
            	sendAll(name + ">" + str);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            list.remove(writer);
            
            //����ڰ� ä���� �����ߴٴ� �޽����� ��� Ŭ���̾�Ʈ�� �����ϴ�.
            sendAll("#"+ name + "���� �����̽��ϴ�");
           
            try {
                reader.close();
            }catch (Exception ignored) {
            	System.out.println("���� �ݴ� �߿� ���� �߻��߽��ϴ�.");
            }
        }
     }//run end
   
	//������ ����� ��� Ŭ���̾�Ʈ�� �Ȱ��� �޽����� ������.
     synchronized private void sendAll(String str){//����� �� ��ĥ���� lock
    	 for(PrintWriter writer : list) {
    		 writer.println(str);
    		 writer.flush();
    		 //socket�� ���� ��������. (����������� ������>>�ݺ���)
    	 }
	}
}
