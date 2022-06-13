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
			System.out.println("���� �ܾ� �հ�:" +sum);
			try {
				//void java.lang.Thread.sleep(long millis) throws InterruptedException
				Thread.sleep(1);//1000���� 1��
				//sleep �޼��尡 �߻���Ű�� InterruptedException ó���ϴ� ���� 	
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}
	
}
