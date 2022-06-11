package ex17_06_SharedArea_problem;
//CalcThread가 계산된 파이 값을 공유영역에 쓰기도 전에
// PrintThread가 공유 영역의 데이터를 읽어갔기 때문에
//result 필드가 가지고 있던 기본값 0.0이 출력된다.
//해결책??
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
