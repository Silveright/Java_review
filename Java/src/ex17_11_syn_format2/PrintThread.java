package ex17_11_syn_format2;
//���� �ܾ� �հ� ��� ������ Ŭ����
public class PrintThread extends Thread{
	
	private SharedArea sharedArea;
	
	PrintThread(SharedArea area){
		sharedArea = area;
	}
	
	public void run() {
		for(int i=0; i<3; i++) {
			 
			int sum = sharedArea.getTotal();
			System.out.println("���� �ܾ� �հ�:" +sum);
		
			try {
				Thread.sleep(1);//1000���� 1��
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
