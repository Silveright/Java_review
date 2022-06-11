package ex13_7_clone2_Rectangle;
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
	 * ���� ��ȯŸ��(covariant return type)-JDK1.5���� ����
	 *  �������̵��� �� ���� �޼����� ��ȯŸ���� �ڼ� Ŭ������ Ÿ������ ������ ����Ѵ�.
	 *  ��, ��ȯ���� Object���� �ڼ� Ŭ���� Ÿ������ ������ ����Ѵ�.
	 *  ����) clone() ȣ�� �� �� ��ȯ�� �ʿ����.(main�޼���)
	 *    Rectangle obj2 = (Rectangle) obj1.clone();
	 *    --> Rectangle obj2 = obj1.clone();
	 *    
	 */
	
	public Rectangle clone() {//��ȯ���� Object�� -> Rectangle������ ����
		try {
			//���� Ŭ������ clone�޼��带 ȣ���� �� ����� ����
			return (Rectangle)super.clone();// Rectangle������ ��ȯ�Ѵ�.
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
