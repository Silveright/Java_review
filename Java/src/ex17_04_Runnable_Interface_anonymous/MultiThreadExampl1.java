package ex17_04_Runnable_Interface_anonymous;
//Runnable �������̽��� �̿��� ��Ƽ ������ ���α׷�
public class MultiThreadExampl1 {
//�͸� Ŭ����- Ŭ���� �̸��� ������ �ʰ� �ʿ��� ��ɸ��� �����ϴ� Ŭ���� ��ü ����
	public static void main(String[] args) {
//Runnable �������̽��� �����ϴ� Ŭ������ ��ü�� �����ؼ� Thread �������� �Ķ���ͷ� ����Ѵ�.
		
		//SmallLetters small = new SmallLetters();
		//Thread thread = new Thread(small);//������ ����
		//Ŭ���� �̸� ���� ��ü �����ϱ�
		Thread thread  = new Thread(new Runnable(){

		    public void run() {
		            for (char ch = 'a'; ch <= 'z'; ch++)
		               System.out.print(ch);
		    }
		   });
		
		thread.start();
		
		char arr[] = {'��','��','��','��','��','��','��',
					'��','��','��','��','��','��','��'};
		
		for(char ch: arr)
			System.out.print(ch);
	}
}
