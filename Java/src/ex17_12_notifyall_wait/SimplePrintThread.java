package ex17_12_notifyall_wait;

public class SimplePrintThread extends Thread{
	private SharedArea sharedArea;
	
	SimplePrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	public void run() {
		if(sharedArea.isReady() !=true) {//파이가 계산중인 경우
			synchronized(sharedArea) {
				try {
					sharedArea.wait();//신호를 기다린다.
				}// try end
				catch(InterruptedException e) {//wait 메서드가 발생하는 익셉션 처리
					System.out.println(e.getMessage());
				}//catch end
			}//동기화 end
		}//if end
		System.out.printf("SimplePrintThread: %.2f %n ", sharedArea.getResult());
	}//run end
}//class end
