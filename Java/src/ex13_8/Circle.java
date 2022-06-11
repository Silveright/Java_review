package ex13_8;

//Object Ŭ������ ���ǵ� clone()�� �ν��Ͻ� ������ ������ �����Ѵ�.
public class Circle implements Cloneable {
	Point p;
	double r;
	
	Circle(Point p,double r ){
		this.p = p;
		this.r =r;
	}
	
	public Circle clone() {
		try {
			//���� Ŭ������ clone�޼��带 ȣ���� �� ����� ����
			return (Circle)super.clone();
		} 
		//����Ŭ������ clone�޼��尡 �߻��ϴ� �ͼ��� ó�� 
		//���� ��ȯ Ÿ��
		//���� ���� - ��ü�� ����� ���� �״�� ����
		//��ü�� �����ϰ� �ִ� ��ü���� �������� �ʴ´�.
		catch(CloneNotSupportedException e) {
			System.out.println("�������� �߻�");
			return null;
		}
	}
	public String toString() {
		return "[p="+p+" , r=" +r+"] ";
	}

}
