package ex17_06_SharedArea_problem;
//CalcThread�� ���� ���� ���� ���������� ���⵵ ����
// PrintThread�� ���� ������ �����͸� �о�� ������
//result �ʵ尡 ������ �ִ� �⺻�� 0.0�� ��µȴ�.
//�ذ�å??
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
