package ex17_11_syn_format2;
//계좌 잔액 합계 출력 스레드 클래스
public class PrintThread extends Thread{
	
	private SharedArea sharedArea;
	
	PrintThread(SharedArea area){
		sharedArea = area;
	}
	
	public void run() {
		for(int i=0; i<3; i++) {
			 
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액 합계:" +sum);
		
			try {
				Thread.sleep(1);//1000분의 1초
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
