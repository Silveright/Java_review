package ex17_12_notifyall_wait;

public class LuxuryPrintThread extends Thread{
	private SharedArea sharedArea;
	
	LuxuryPrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	public void run() {
		if(sharedArea.isReady() !=true) {//���̰� ������� ���
			synchronized(sharedArea) {
				try {
					sharedArea.wait();//��ȣ�� ��ٸ���.
				}// try end
				catch(InterruptedException e) {//wait �޼��尡 �߻��ϴ� �ͼ��� ó��
					System.out.println(e.getMessage());
				}//catch end
			}//����ȭ end
		}//if end
		System.out.println("*** �� =  "+ sharedArea.getResult()+" ***");
	}//run end
}//class end
