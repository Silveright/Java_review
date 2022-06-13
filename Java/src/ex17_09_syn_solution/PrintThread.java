package ex17_09_syn_solution;
//���� �ܾ� �հ� ��� ������ Ŭ����
public class PrintThread extends Thread{
	
	private SharedArea sharedArea;
	
	PrintThread(SharedArea area){
		sharedArea = area;
	}
	
	public void run() {
		for(int i=0; i<3; i++) {
			/*
			 * synchronized Ű���带 ����� ������� ���� �κ��� ����ȭ ���̶�� �Ѵ�. 			
			 */		
			//����ȭ ����
			synchronized (sharedArea) {
				int sum = sharedArea.getAccount1().getBalance()+ sharedArea.getAccount2().getBalance();
				System.out.println("���� �ܾ� �հ�:" +sum);
			}//����ȭ ��
			try {
				Thread.sleep(1);//1000���� 1��
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
