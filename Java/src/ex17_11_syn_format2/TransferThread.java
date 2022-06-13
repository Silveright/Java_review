package ex17_11_syn_format2;
//계좌 이체 수행하는 스레드 클래스
public class TransferThread extends Thread
 {
	private SharedArea sharedArea;
	TransferThread(SharedArea area){//생성자
		this.sharedArea = area;
	}
	
	public void run() {
		for(int i =0; i<12;i++) {
			sharedArea.transfer();
		}
	}
}
