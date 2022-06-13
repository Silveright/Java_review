package ex17_08_syn_problem;

public class PrintThread extends Thread{
	
	private SharedArea sharedarea;
	
	PrintThread(SharedArea area){
		sharedarea = area;
	}
	
	public void run() {
		for(int i=0; i<3; i++) {
			 int sum = sharedarea.getAccount1().getBalance()
					 + sharedarea.getAccount2().getBalance();
			System.out.println("계좌 잔액 합계:" +sum);
			try {
				//void java.lang.Thread.sleep(long millis) throws InterruptedException
				Thread.sleep(1);//1000분의 1초
				//sleep 메서드가 발생시키는 InterruptedException 처리하는 문장 	
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}
	
}
