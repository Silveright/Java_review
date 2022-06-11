package ex17_07_SharedArea_solution;

public class CalcThread extends Thread {
	private SharedArea sa;
	
	CalcThread(SharedArea sa){
		this.sa = sa;
	}
	
	  public void run() {
			double total = 0.0;
			// ���̸� ����ϴ� �κ�
			for (int cnt = 1; cnt < 1000000000; cnt += 2) {
				if (cnt / 2 % 2 == 0)
					total += 1.0 / cnt;
				else
					total -= 1.0 / cnt;
				
			}

			
			// ��� ����� ���� ������ ����
			// total * 4�� ����� �ʵ��� setResult()�� �̿��ؼ� ����
			sa.setResult(total*4);
			sa.setReady(true);//SharedArea ��ü�� isReady �ʵ� ���� true�� ����
		}
}
//
//obj1.setRadius(10.5);
//area= obj1.getArea();	
