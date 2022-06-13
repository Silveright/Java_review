package ex18_2_FileWriter;

import java.io.*;

public class FileReaderExample_gugudan {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("src/ex18_2_FileWriter/gugudan.txt");
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
				reader.close();
			} catch (Exception e) {//close �޼��尡 �߻��ϴ� ���� ó��
									//IOexception�� NullPointerExceptionó�� ����
				System.out.println("Exception");
			}
		}
	}
}
