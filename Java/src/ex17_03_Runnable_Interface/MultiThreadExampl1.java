package ex17_03_Runnable_Interface;
//Runnable �������̽��� �̿��� ��Ƽ ������ ���α׷�
public class MultiThreadExampl1 {

	public static void main(String[] args) {
//Runnable �������̽��� �����ϴ� Ŭ������ ��ü�� �����ؼ� Thread �������� �Ķ���ͷ� ����Ѵ�.
		SmallLetters small = new SmallLetters();
		Thread thread = new Thread(small);///������ ����
		thread.start();
		
		char arr[] = {'��','��','��','��','��','��','��',
					'��','��','��','��','��','��','��'};
		
		for(char ch: arr)
			System.out.print(ch);
	}
}
