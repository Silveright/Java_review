package ex17_05_daemon_thread;
/*������� �Ϲ� ������� ���� ������� ������.
 * 
 * ���� ������� 
 * 	�ٸ� �Ϲ� ������(���� �����尡 �ƴ� ������)�� �۾��� ���� �������� ������ �����ϴ� ������
 *  �Ϲ� �����尡 ��� ����Ǹ� ���� ������� ���������� �ڵ� ����ȴ�.
 *  ���� ������� �Ϲ� �������� ���� ������ �����ϹǷ� �Ϲ� �����尡 ��� ����ǰ� ���� ���� �������� ������ �ǹ̰� ���� ����.
 *  ������ �����ϰ�� ���� ������� �Ϲ� ������� �ٸ��� �ʴ�.
 *  	���� �������� �� _ ������ �÷���, �������μ����� �ڵ�����, ȭ�� �ڵ����� ��
 *  ���� ������� ���� ������ ���ǹ��� �̿��ؼ� ���� �� ����ϰ� �ִٰ� Ư�� ������ �����Ǹ� �۾��� �����ϰ� �ٽ� ����ϵ��� �ۼ��Ѵ�.
 *  
 *  ���� ������ ����
 *   ������ ���� -> �ݵ�� setDaemon(true) �޼��� ȣ�� -> start() �޼��� ȣ��
 *   void setDaemon(boolean on): true(���� ������� ����), false(�Ϲ� ������� ����)
 * 
 */


public class Threadautosave implements Runnable{
	static boolean autoSave = false;
	public void run() {
		while (true) {
			try {
				Thread.sleep(3*1000);//3�ʸ���
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			//autoSave�� ���� true�̸� autoSave()ȣ��
			if(autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("�۾� ������ �ڵ� ����Ǿ����ϴ�.");
	}
}
