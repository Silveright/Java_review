package ex17_01_Thread_효율;
/*
 * -java.lang.Thread 클래스와 이 클래스의 서브 클래스르르
 * Thread (스레드) 클래스 라고 한다.
 * - 스레드가 할 일을 run 메서드 안에 저장한다.
 * -public void run()의 형식으로 작성한다.
 */
class DigitThread extends Thread{
//오버라이딩- 오버라이딩 안해도 에러는 나지 않음
//start()메서드에 의해 실행
	public void run() {
		for(int cnt =0; cnt<10; cnt++)
			System.out.print(cnt);
		
//		System.out.println(Thread.currentThread().getName());
		
	}

}
