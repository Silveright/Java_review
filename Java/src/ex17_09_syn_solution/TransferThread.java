package ex17_09_syn_solution;
//계좌 이체 수행하는 스레드 클래스
public class TransferThread extends Thread
 {
	private SharedArea sharedArea;
	TransferThread(SharedArea sharedarea){//생성자
		this.sharedArea = sharedarea;
	}
	
	public void run() {
		for(int i =0; i<12;i++) {
			synchronized (sharedArea) {
				//동기화 시작
				sharedArea.getAccount1().withdraw(1000000);
				System.out.print("이몽룡 계좌: 100만원 인출,");
				sharedArea.getAccount2().deposit(1000000);
				System.out.println("성춘향 계좌: 100만원 입금");
			}//동기화 끝
		}
	}
}
