package ex17_08_syn_problem;

public class TransferThread extends Thread
 {
	private SharedArea sharedarea;
	TransferThread(SharedArea sharedarea){
		this.sharedarea = sharedarea;
	}
	
	public void run() {
		for(int i =0; i<12;i++) {
			sharedarea.getAccount1().withdraw(1000000);
			System.out.print("�̸��� ����: 100���� ����,");
			sharedarea.getAccount2().deposit(1000000);
			System.out.println("������ ����: 100���� �Ա�");
		}
	}
}
