//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ��� �θ������ �ۼ�
//FileNotFoundException-> IOException
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �� ���� catch���� �����Ѵ�.
package ex12_1_Exception;

import java.io.*;


public class ExceptionExample9 {
	public static void main(String[] args) {
		// ������ �о�鿩��
		FileReader reader = null;// >>some.txt������ ã�´�.
		try {
			reader = new FileReader("some.txt");// ��ü�� ����� �����Ǿ�߸� �ּҰ��� ���Ե� ������ ���� ���� �ȵ�
		} catch (IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		} finally {

			try {
				if (reader != null)
					reader.close();

			} catch (IOException e) {
				System.err.println("���� �ݴ� �� ���� �߻�");
			} // �ڿ��� ������ �ݳ��Ѵ�. ���߿� ������ ���� ������� ����
				// �ݵ�� ����ǵ��� finally�� �־��ش�.
		}
	}
}
