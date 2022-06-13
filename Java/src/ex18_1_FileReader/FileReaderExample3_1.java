package ex18_1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample3_1 {

	public static void main(String[] args) {
		FileReader reader = null;
		char arr[] = new char[64];//���Ͽ� �ִ� ���ڸ� ���� char�迭
		try {
			reader = new FileReader("������ ��.txt");
			//
			while(true) {
				//Returns: The number of characters read
				//arr�� �迭 ũ�⸸ŭ ���ڸ� �о� arr�� ���� �� ���� ���� ��ȯ
				int num = reader.read(arr);//��ȯ�� ����
				if(num == -1)//�� �̻� ���� �����Ͱ� ���� ��� -1 ���� 
					break;
				System.out.println(new String(arr,0,num));
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
