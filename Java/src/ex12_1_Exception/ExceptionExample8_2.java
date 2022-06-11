//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ��� �θ������ �ۼ�
//FileNotFoundException-> IOException
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �� ���� catch���� �����Ѵ�.
package ex12_1_Exception;

import java.io.FileReader;

public class ExceptionExample8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �о�鿩��
		try {
			FileReader reader = new FileReader("some.txt");//>>some.txt������ ã�´�.
			reader.close();
		} catch(Exception e) {
			System.err.println("����� ������ �߻��߽��ϴ�.2"); //in,out,err
		} //>>�θ�� ���൵ ����ش�.
		//���� �߻��� ������ FileNotFoundException
		//�̹� �θ� IOException���� �ڽ� FileNotFoundException �� ó���� �� �־� �� �κ��� �ʿ��������.
		//�ڹ��� ������ ������ �߻��� ����(�θ�� �ڽ��� ǰ�´�.)>> exception�� ��Ӱ��谡 �ִ�.
		//Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
		
		
//		catch(FileNotFoundException e) {//�ڽĺ��� �´�.
//			System.out.println("������ ã�� �� �����ϴ�.");
//		}
		
	}

}
