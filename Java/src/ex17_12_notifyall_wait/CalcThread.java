package ex17_12_notifyall_wait;

public class CalcThread extends Thread {
	private SharedArea sharedArea;
	
	CalcThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	
	  public void run() {
			double total = 0.0;
			// ���̸� ����ϴ� �κ�
			for (int cnt = 1; cnt < 1000000000; cnt += 2) 
				if (cnt / 2 % 2 == 0)
					total += 1.0 / cnt;
				else
					total -= 1.0 / cnt;
				
			

			
			// ��� ����� ���� ������ ����
			// total * 4�� ����� �ʵ��� setResult()�� �̿��ؼ� ����
			sharedArea.setResult(total*4);
			sharedArea.setReady(true);//SharedArea ��ü�� isReady �ʵ� ���� true�� ����
			//���� ����� �������� �ǹ�
			
			synchronized(sharedArea) {
				sharedArea.notifyAll();//��ٸ��� �ִ� ��� ������� ��ȣ�� ������ �޼���
//				sharedArea.notify();
				//notify(): wait���� ������ �� �ϳ����Ը� ��ȣ�� ������
			}
	  }
}
//
//obj1.setRadius(10.5);
//area= obj1.getArea();	
