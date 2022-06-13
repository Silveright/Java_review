package ex17_09_syn_solution;
//���� ��ü �����ϴ� ������ Ŭ����
public class TransferThread extends Thread
 {
	private SharedArea sharedArea;
	TransferThread(SharedArea sharedarea){//������
		this.sharedArea = sharedarea;
	}
	
	public void run() {
		for(int i =0; i<12;i++) {
			synchronized (sharedArea) {
				//����ȭ ����
				sharedArea.getAccount1().withdraw(1000000);
				System.out.print("�̸��� ����: 100���� ����,");
				sharedArea.getAccount2().deposit(1000000);
				System.out.println("������ ����: 100���� �Ա�");
			}//����ȭ ��
		}
	}
}
