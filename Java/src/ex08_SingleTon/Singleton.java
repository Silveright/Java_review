//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex08_SingleTon;

public class Singleton {
	
	private static Singleton s = new Singleton();
	
	private Singleton() {	
	}
	
	public static Singleton getInstance() {
        System.out.println("����� getInstance�Դϴ�.");
		return s;
    }
}
