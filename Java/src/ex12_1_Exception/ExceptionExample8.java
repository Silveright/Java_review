//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ��� �θ������ �ۼ�
//FileNotFoundException-> IOException
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �� ���� catch���� �����Ѵ�.
package ex12_1_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �о�鿩��
		try {
			FileReader reader = new FileReader("some.txt");//>>some.txt������ ã�´�.
			reader.close();//�ڿ��� ������ �ݳ��Ѵ�. ���߿� ������ ���� ������� ����
			//�ݵ�� ����ǵ��� finally�� �־��ش�.
		} catch(FileNotFoundException e) {//�ڽĺ��� �´�.
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
		
	}

}
