package ex13_8_DeepCopy;

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
			Circle c =(Circle)super.clone();
			c.p = new Point(this.p.x, this.p.y);//���ο� ��ü�� ������ ��´�.
			//p�� ���� ���ο� ��ü�� �����Ѵ�.
			//�ν��Ͻ� ������ �������϶�
			//�����ϴ� ��ü�� �����ǰ� �������̵�
			return c;
			
		} catch(CloneNotSupportedException e){
			System.out.println("���� �� ���� �Դϴ�.");
			return null;
		} 
	}
	public String toString() {
		return "[p="+p+" , r=" +r+"] ";
	}

}
