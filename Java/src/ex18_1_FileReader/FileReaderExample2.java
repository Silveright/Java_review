package ex18_1_FileReader;
import java.io.*;
public class FileReaderExample2 {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("poem2.txt");
			//FileReader reader = new FileReader("D:/eclipse-workspace/Java/poem.txt");
			//FileReader reader = new FileReader("D:\\eclipse-workspace\\Java\\poem.txt");
			while(true) {
				int data = reader.read();//��ȯ�� ����
				if(data == -1)//�� �̻� ���� �����Ͱ� ���� ���
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("���� ���� �� ����.");
		} finally {//������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally��Ͽ��� ����Ѵ�.
			try {
				reader.close();//������ �ݴ� ��ɹ�
				//���� ������ �������� �ʴ� ������ ��� ��ü�� �������� �ʾ� null���� ���� >>nullpointexception�� �߻��� >>ó�� �ʿ�
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
