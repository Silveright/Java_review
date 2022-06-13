package ex18_1_FileReader;
import java.io.*;
//FileReader ������, read method ���� ó��
public class FileReaderExample1 {

	public static void main(String[] args) {
		/*1.������ ����
		 * ������ ���ڰ����� ������ ��ġ�� ����
		 * �������: ����ο� ������
		 * 1)��� ���:������Ʈ ��θ� �������� ���ʴ�� ������ ��ġ�� ������
		 * 2)���� ���:����̺����� ���ʴ�� ������ ��ġ�� ����
		 * 	��) D:/�۾�����/������Ʈ/poem.txt �ǹ�
		 * 
		 */
		
		try {
			FileReader reader;
			reader = new FileReader("poem.txt");
			//���� ��� ����
			//FileReader reader = 
			//new FileReader("D:/workspace_java/java/poem.txt");
			
			//2.������ �о ó���Ѵ�.
			while(true) {
				//read():���Ͽ� �ִ� ���� �ϳ��� �о� �����ϴ� �޼���
				int data = reader.read();//��ȯ���� ����
				if(data == -1)//�� �̻� ���� �����Ͱ� ���� ���
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			//3.������ �ݴ´�.
			reader.close();//���� read() �޼��忡�� ������ �߻��ϸ�
			//close()�޼��尡 ���� ���� ���� ä ���α׷��� ������.>>finally ���� �־���� ��.
		} 
		catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch (IOException e) {
			System.out.println("���� ���� �� ����.");
		}
	}
}
