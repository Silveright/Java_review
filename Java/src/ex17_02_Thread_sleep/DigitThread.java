package ex17_02_Thread_sleep;

public class DigitThread extends Thread {

	public  void run() {
		for ( int cnt = 0; cnt<10; cnt++) {
			System.out.print(cnt);
			try {
				//void java.lang.Thread.sleep(long millis) throws InterruptedException
				Thread.sleep(1000);//1 second
			//sleep �޼��尡 �߻���Ű�� InterruptedException ó���ϴ� ���� 	
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
