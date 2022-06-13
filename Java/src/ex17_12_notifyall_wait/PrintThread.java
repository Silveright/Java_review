package ex17_12_notifyall_wait;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	public void run() {
		if(sharedArea.isReady() !=true) {//���̰� ������� ���
			/*������ ���- ���̰���� ���� ������ ��� üũ�ؾ߸� ����
			 * while(sharedArea.isReady != true) {
			 * 			System.out.println("���� ��");
			 * 	}
			 * 
			 */
			try {
				synchronized (sharedArea) {
					sharedArea.wait();//�ٸ� ������κ��� ��ȣ�� ��ٸ���.
					//������ ����� ������ �ٸ� �����忡�� ��ȣ�� ������
				}
			}// try end
			catch(InterruptedException e) {//wait �޼��尡 �߻��ϴ� �ͼ��� ó��
				System.out.println(e.getMessage());
			}//catch end
		}//if end
		System.out.println("PrintThread :" + sharedArea.getResult());
	}
}