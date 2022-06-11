package ex17_04_Runnable_Interface_anonymous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date_main {

	public static void main(String[] args) {
		Thread thread = new Thread(new Thread() {
			public  void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 H시 m분 ss초 ");
				for ( int cnt = 0; cnt<10; cnt++) {
					Date d = new Date();
					System.out.println(sdf.format(d));
					try {
						//void java.lang.Thread.sleep(long millis) throws InterruptedException
						Thread.sleep(1000);//1 second
						//sleep 메서드가 발생시키는 InterruptedException 처리하는 문장 	
					}catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		});
		thread.start();
	}//main end
}


