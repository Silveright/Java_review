package ex18_1_FileReader;
import java.io.*;
public class FileReaderExample2_1 {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("poem2.txt");
			//
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
		} finally {
			try {
				if(reader !=null)//null�� �ƴ� ��츸 �޵��� ��
				reader.close();
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
