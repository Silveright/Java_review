package ex18_6_Buffered_flush;
import java.io.*;
public class BufferedWriterExample3 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("src/ex18_6_Buffered_flush/output.txt");
			//�ι�° ���ڴ� ���� ����� �ǹ��Ѵ�. - ���ۿ� 5���� ���ڸ� ������ �� �ִ�.
			bw = new BufferedWriter(fw,5);//������Ʈ��, �ӵ��� ����Ų��.
			
			char arr[] = {'��','��','��','1','��',
						  '2','��','��','3','��',
						  '��','4','��','��','5',
						  '��','��','6','��'};
			//���Ͽ� �ݺ��ؼ� ���ڵ��� ����.
			for(int cnt =0; cnt<arr.length; cnt++)
				bw.write(arr[cnt]);
			
		}catch (IOException ioe) {//Exception - IOException
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {//���� �ݴ� ��ɹ��� ������ ������� ó��
			try {
				bw.close();
				//������� ��Ʈ���� ���������� ���� ��
				//�ڵ����� flush() �޼��带 ȣ���Ѵ�.
				//fw ����, �ڵ����� ������.
			}
			catch(Exception e) {//close�޼��尡 �߻��ϴ� ���� ó��
				System.out.println(e.getMessage());
			}
		}
	}
}
