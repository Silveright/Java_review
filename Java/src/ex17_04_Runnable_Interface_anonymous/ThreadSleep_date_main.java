package ex17_04_Runnable_Interface_anonymous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date_main {

	public static void main(String[] args) {
		Thread thread = new Thread(new Thread() {
			public  void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� H�� m�� ss�� ");
				for ( int cnt = 0; cnt<10; cnt++) {
					Date d = new Date();
					System.out.println(sdf.format(d));
					try {
						//void java.lang.Thread.sleep(long millis) throws InterruptedException
						Thread.sleep(1000);//1 second
						//sleep �޼��尡 �߻���Ű�� InterruptedException ó���ϴ� ���� 	
					}catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		});
		thread.start();
	}//main end
}


