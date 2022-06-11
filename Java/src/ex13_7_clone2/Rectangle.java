package ex13_7_clone2;
/*���� ������ Ŭ������ �����
 * 1�ܰ�: Cloneable�������̽� ����
   2�ܰ�: clone()�޼��� �������̵�
 */

//Cloneable�������̽��� �����Ǿ��ִٴ� ���� Ŭ���� �ۼ��ڰ� ������ ����Ѵٴ� �ǹ�
public class Rectangle implements Cloneable {
	int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	/*
	 * Object Ŭ������ ���ǵ� clone()
	 * protected Object clone() throws CloneNotsupportedException;
	 * ==>�������̵� �� ���� ������ ����
	 * (protected => public: ��Ӱ��� ���� �ٸ� Ŭ�������� ȣ�� �� �� �ִ�.
	 */
	
	public Object clone() {//��ȯ���� Object��
		try {
			//���� Ŭ������ clone�޼��带 ȣ���� �� ����� ����
			return super.clone();
		} 
		//����Ŭ������ clone�޼��尡 �߻��ϴ� �ͼ��� ó�� 
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		return "���δ� " +width +", ���δ� " +height;
	}
	public boolean equals(Object obj) {
		if(obj!= null && obj instanceof Rectangle ) {
			Rectangle r2 = (Rectangle)obj;//�ٿ�ĳ����
			return this.width == r2.width
					&& this.height == r2.height;
		} else {
			return false;
		}
	}
}
