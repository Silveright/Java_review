package ex17_12_notify_wait;

public class CalcThread extends Thread {
	private SharedArea sharedArea;
	
	CalcThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	
	  public void run() {
			double total = 0.0;
			// 파이를 계산하는 부분
			for (int cnt = 1; cnt < 1000000000; cnt += 2) 
				if (cnt / 2 % 2 == 0)
					total += 1.0 / cnt;
				else
					total -= 1.0 / cnt;
				
			

			
			// 계산 결과를 공유 영역에 저장
			// total * 4의 결과를 필드의 setResult()를 이용해서 저장
			sharedArea.setResult(total*4);
			sharedArea.setReady(true);//SharedArea 객체의 isReady 필드 값을 true로 설정
			//파이 계산이 끝났음을 의미
			
			synchronized(sharedArea) {
				sharedArea.notify();//다른 스레드로 신호를 보내는 메서드
			}
	  
	  }
}
//
//obj1.setRadius(10.5);
//area= obj1.getArea();	
