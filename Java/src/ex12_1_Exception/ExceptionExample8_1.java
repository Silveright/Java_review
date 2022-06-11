//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ��� �θ������ �ۼ�
//FileNotFoundException-> IOException
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �� ���� catch���� �����Ѵ�.
package ex12_1_Exception;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample8_1 {

	public static void main(String[] args) {
		//������ �о�鿩��
		try {
			FileReader reader = new FileReader("some.txt");//>>some.txt������ ã�´�.
			reader.close();
		} catch(IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�."); //in,out,err
		} 
		//���� �߻��� ������ FileNotFoundException
		//�̹� �θ� IOException���� �ڽ� FileNotFoundException �� ó���� �� �־� �� �κ��� �ʿ��������.
		//�ڹ��� ������ ������ �߻��� ����(�θ�� �ڽ��� ǰ�´�.)>> exception�� ��Ӱ��谡 �ִ�.
		//Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
		
		
//		catch(FileNotFoundException e) {//�ڽĺ��� �´�.
//			System.out.println("������ ã�� �� �����ϴ�.");
//		}
		
	}

}
