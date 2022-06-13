package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			//�������� �Ű������� �� ������ �̸��� �ǹ��Ѵ�.
			//output.txt������ ���� ��� ���� ���� �� ������ ������.
			//�̸��� �ִ� ��� ���� ������ ������ ��������.
			writer = new FileWriter("output.txt");
			//public FileWriters(String fileName)throws IOException
			//FileWriter �����ڴ� IOException������ �߻��ϱ� ������
			//IOException ó������ �־�� �Ѵ�.
			char arr[] = {'��','��','��',' ','��',' ','��','��',' ','��','��',' ',
					'��','��',' ','��','��',' ','��'};
			//���Ͽ� �ݺ��ؼ� ���ڵ��� ����.
			for(int cnt =0; cnt<arr.length; cnt++)
				writer.write(arr[cnt]);
			//�� �� ����� ���� �ǹ�
			//writer.write(arr);
		}
		catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
