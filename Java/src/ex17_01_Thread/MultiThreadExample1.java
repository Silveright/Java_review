package ex17_01_Thread;

public class MultiThreadExample1 {

	public static void main(String[] args) {
		//thread ����
		Thread thread = new DigitThread();
		//thread ���� ��Ų��.
		thread.start();
		
		/*start() ����
		 * Causes this thread to begin execution; 
		 * the Java Virtual Machine calls the run method of this thread. 
		 * 
		 * this thread(Thread thread = new DigitThread()�� thread)�� ������ �����ϵ��� �Ѵ�.
		 * Java ���� �ӽ��� �������� run() �޼��� ȣ��
		 * -start()�� ���� run()�� ����ȴ�.
		 *  start method�� java.lang.Thread Ŭ������ �޼����̴�.
		 *  ���� ������ Thread�� start�ϸ� Runnable ���°� ��
		 * -thread.run(); �̷������� ȣ�� ���� ����
		 * 
		 */
		for(char ch = 'A'; ch<='Z'; ch++)
			System.out.print(ch);
		
		System.out.println("������ �̸�: " +Thread.currentThread().getName());
	//���� ����� run�� �� ���� �Ź� �޶����� (�۾� ����)����� ����� �����
	
	}

}
