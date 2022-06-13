package ex18_4_Buffered;
import java.io.*;
public class BufferedWriterExample1_write {

	public static void main(String[] args) {
		String message = "�����Դϴ�.\n���õ� ȭ����";
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("src/ex18_4_Buffered/output2.dat"));
			writer.write(message);
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}catch (IOException ioe) {//Exception - IOException
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {//���� �ݴ� ��ɹ��� ������ ������� ó��
			try {
				writer.close();//���� �ݴ� ��ɹ�
			}catch(Exception e) {//close�޼��尡 �߻��ϴ� ���� ó��
				System.out.println("�ݴ� �� �����Դϴ�.");
			}
		}
	}
}
