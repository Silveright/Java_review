//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex08_SingleTon;

public class Singleton_main {
	public static void main(String arfs[]) {
	Singleton obj1 = Singleton.getInstance();
	Singleton obj2 = Singleton.getInstance();//�����޼���� ��ü ����
	
	if (obj1 ==obj2) {
		System.out.println("���� singleton");
	}else { 
			System.out.println("�ٸ�");
    }
}
}

