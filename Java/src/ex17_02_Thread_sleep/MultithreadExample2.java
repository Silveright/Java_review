package ex17_02_Thread_sleep;

public class MultithreadExample2 {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();
		
		for (char ch= 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				//sleep method: ���� �ð��� ����Ǳ⸦ ��ٸ��� �޼���
				//public static void sleep(long millis) throws InterruptedException
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//main end

}//class end
