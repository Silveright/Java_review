package ex13_8;

public class ShallowCopy {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1,1),2.0);
		Circle c2 = c1.clone();//copy
		//������ p,r���� p�� �ּҰ��� �����Ǿ� ��ü�� ����Ű�� �ȴ�.
		//������ Point ��ü�� �����ǵ��� �ؾ��Ѵ�.(���� �������� ��ü�� ����Ű����)
		System.out.println("c1=" +c1);
		System.out.println("c2=" +c2);
		
		c1.p.x = 9;
		c1.p.y = 9;
		c1.r = 4;
		System.out.println("====c1 ���� ��====");
		System.out.println("c1= "+ c1);
		//c1�� �����ߴµ� c2�� point�� �����
		System.out.println("c2= "+ c2);
	}
}
