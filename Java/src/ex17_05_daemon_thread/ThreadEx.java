package ex17_05_daemon_thread;

public class ThreadEx {
public static void main(String[] args) {
	Thread t = new Thread (new Threadautosave());//Runnable 인터페이스 사용
	t.setDaemon(true);//이부분이 없으면 종료되지 않는다.
						//데몬 스레드로 만든다.
	
	t.start();
	
	for(int i =1; i<=30; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(i);
		
		if(i ==5)
			Threadautosave.autoSave = true;
	}
	System.out.println("프로그램을 종료합니다");
}
}
