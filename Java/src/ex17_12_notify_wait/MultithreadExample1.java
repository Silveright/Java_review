package ex17_12_notify_wait;
/*notify �޼���� wait�޼����� ��뿹
 * 
 * -������ ���̿� ��ȣ�� ���� �ְ� ���� �� �ִ�.
 * ����ȭ�� ������� ����ȭ ������ �ٸ� �����忡�� ������� �ѱ��� ���Ѵ�.
 * �̿� ���� ����ȭ�� ������ �����尣�� ���(������� �ѱ�)�ϱ� ����
 * wait(), notify(), notifyAll()�޼��带 ����ؾ� �Ѵ�.
 * �� �޼��带 ����� �� synchronized �������� �ǹ̰� �ִ�.
 * 
 */
public class MultithreadExample1 {

	public static void main(String[] args) {
		//���� ���� ��ü�� �����ؼ� �� ��ü�� �������� �� �������� �ʵ忡 �����Ѵ�.
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread(obj);//����� ������
		PrintThread thread2 = new PrintThread(obj);//����� �Ǿ����
		//����� �� ������ ���� run�� ����� 
		thread1.start();
		thread2.start();
	}

}
