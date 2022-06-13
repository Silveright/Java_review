package ex17_08_syn_problem;
/*���� ��ü�� �ܾ� ����� ���ÿ� �ϴ� ��Ƽ ������ ���α׷�
 * 
 * -�̸����� ���¿��� ����� 100������ �������� ���·� �ԱݵǱ� ����
 * PrintThread�� ���� ��� �Ѿ ���� �ܾ� �հ� 29000000 ��µ�
 * 
 * -�ذ� ��
 * ����ȭ: ���� ������ ��� �� �� ���� �����͸� �ٸ� �����尡 ������� ���ϵ��� ����� ���� �ǹ��Ѵ�.
 * 
 */
public class MultithreadExample1 {

	public static void main(String[] args) {
		Account a1 = new Account("111-111-1111","�̸���", 20000000);
		Account a2 = new Account("222-222-2222","������", 10000000);
		
		SharedArea area = new SharedArea(a1, a2);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}
}
