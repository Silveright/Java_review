package ex18_1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample3_2 {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("������ ��.txt");
			//
			while(true) {
				//Returns: The number of characters read
				int num = reader.read();//��ȯ�� ����
				if(num == -1)//�� �̻� ���� �����Ͱ� ���� ��� -1 ���� 
					break;
				char ch =(char) num;
				System.out.print(ch);
			}//while end
		}//try end 
		catch (FileNotFoundException fnfe) {
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
