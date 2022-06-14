package ex19_05_serialVersionUID_no;
//���� �簢�� Ŭ������ �޼��带 �߰��� ���
//���� �߻�: ����ȭ �� �� ����� Ŭ������
//������ȭ �� �� ����� Ŭ������ ������ �ٸ��� ����

public class Rectangle implements java.io.Serializable{
	
	private int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "����: " +width +"\n����: " +height;
	}
	
	/*������
	 * 
	 * 1. �Ʒ� getArea�޼����� �ּ��� �ް� ������ ��� ���� ����
	 * ObjectOutputExample.java�� ����
	 * ObjectInputExample.java ����
	 * 
	 * 2.�Ʒ� �޼����� �ּ��� Ǭ ��- ���� �߻�
	 * ObjectInputExample.java ����
	 * 
	 * serialVersionUID�� ���� Ŭ�������� �˷��ִ� �ĺ��� ������ �ϸ�
	 * Serializable �������̽��� ������ Ŭ������ �������ϸ� �ڵ�������
	 * serialVersionUID ���� �ʵ尡 �߰��ȴ�.
	 * 
	 * serialVersionUID�� �ڹ��� ����ȭ ��Ŀ����� ������ȭ ��Ŀ������ ����� ��
	 * �ڵ����� �ο��Ǵµ� ����ȭ ���� Ŭ������ ������ �״���̸� ���� ��ȣ�� �ο��ǰ�
	 * Ŭ������ ������Ұ� �ϳ��� �ٲ�� ������ �ٸ� serialVersionUID�� �ο��ȴ�.
	 * 
	 * ������ ��������� Ŭ������ serialVersionUID�� ����Ǿ� ������ 
	 * ������ �� �߰����� �ʱ� ������ ������ ���� ������ �� �ִ�.
	 * 
	 */
	
	
	int getArea() {
		return width*height;
	}
	
	
	
}
