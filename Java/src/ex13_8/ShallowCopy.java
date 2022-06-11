package ex13_8;

public class ShallowCopy {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1,1),2.0);
		Circle c2 = c1.clone();//copy
		//복제된 p,r에서 p는 주소값이 복제되어 객체를 가리키게 된다.
		//별개의 Point 객체가 생성되도록 해야한다.(서로 개별적인 객체를 가리키도록)
		System.out.println("c1=" +c1);
		System.out.println("c2=" +c2);
		
		c1.p.x = 9;
		c1.p.y = 9;
		c1.r = 4;
		System.out.println("====c1 변경 후====");
		System.out.println("c1= "+ c1);
		//c1만 변경했는데 c2의 point도 변경됨
		System.out.println("c2= "+ c2);
	}
}
