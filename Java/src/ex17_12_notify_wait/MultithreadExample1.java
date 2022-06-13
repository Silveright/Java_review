package ex17_12_notify_wait;
/*notify 메서드와 wait메서드의 사용예
 * 
 * -스레드 사이에 신호를 직접 주고 받을 수 있다.
 * 동기화된 스레드는 동기화 블럭에서 다른 스레드에게 제어권을 넘기지 못한다.
 * 이와 같이 동기화된 블럭에서 스레드간의 통신(제어권을 넘김)하기 위해
 * wait(), notify(), notifyAll()메서드를 사용해야 한다.
 * 이 메서드를 사용할 때 synchronized 블럭에서만 의미가 있다.
 * 
 */
public class MultithreadExample1 {

	public static void main(String[] args) {
		//공유 영역 객체를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장한다.
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread(obj);//계산이 끝나고
		PrintThread thread2 = new PrintThread(obj);//출력이 되어야함
		//계산이 다 끝나기 전에 run이 실행됨 
		thread1.start();
		thread2.start();
	}

}
