package ex17_01_Thread_ȿ��;
/*
 * -java.lang.Thread Ŭ������ �� Ŭ������ ���� Ŭ��������
 * Thread (������) Ŭ���� ��� �Ѵ�.
 * - �����尡 �� ���� run �޼��� �ȿ� �����Ѵ�.
 * -public void run()�� �������� �ۼ��Ѵ�.
 */
class DigitThread extends Thread{
//�������̵�- �������̵� ���ص� ������ ���� ����
//start()�޼��忡 ���� ����
	public void run() {
		for(int cnt =0; cnt<10; cnt++)
			System.out.print(cnt);
		
//		System.out.println(Thread.currentThread().getName());
		
	}

}
