package ex17_06_SharedArea_problem;

public class PrintThread extends Thread{
	private SharedArea sharedarea;
	
	PrintThread(SharedArea sharedarea){
		this.sharedarea = sharedarea;
	}
	public void run() {
		System.out.println("공유 영역의 데이터 = "+ sharedarea.getResult());
	}
}
