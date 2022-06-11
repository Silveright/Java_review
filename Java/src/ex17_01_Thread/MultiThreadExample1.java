package ex17_01_Thread;

public class MultiThreadExample1 {

	public static void main(String[] args) {
		//thread 생성
		Thread thread = new DigitThread();
		//thread 실행 시킨다.
		thread.start();
		
		/*start() 설명
		 * Causes this thread to begin execution; 
		 * the Java Virtual Machine calls the run method of this thread. 
		 * 
		 * this thread(Thread thread = new DigitThread()의 thread)가 실행을 시작하도록 한다.
		 * Java 가상 머신이 스레드의 run() 메서드 호출
		 * -start()를 통해 run()이 실행된다.
		 *  start method는 java.lang.Thread 클래스의 메서드이다.
		 *  새로 생성한 Thread를 start하면 Runnable 상태가 됨
		 * -thread.run(); 이런식으로 호출 하지 않음
		 * 
		 */
		for(char ch = 'A'; ch<='Z'; ch++)
			System.out.print(ch);
		
		System.out.println("스레드 이름: " +Thread.currentThread().getName());
	//실행 결과는 run할 때 마다 매번 달라지나 (작업 수행)출력은 제대로 실행됨
	
	}

}
