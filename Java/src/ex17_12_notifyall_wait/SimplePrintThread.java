package ex17_12_notifyall_wait;

public class SimplePrintThread extends Thread{
	private SharedArea sharedArea;
	
	SimplePrintThread(SharedArea sharedArea){
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
		System.out.printf("SimplePrintThread: %.2f %n ", sharedArea.getResult());
	}//run end
}//class end
