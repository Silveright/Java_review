package ex07_object_circle;



public class Circle_make {
	public static void main(String args[]) {
	
	Circle obj1 = new Circle (3.5); 
	print(obj1);
	
	obj1.radius = 5.5;
	
	print(obj1);
	
	
	//return �� ���� area ������� �� �ٷ� ���� ���
//	System.out.println("���� ����=" + getArea(3.5));

	
	}
	

	public static void print(Circle circle) {
//		double area= circle.getArea();	
		System.out.println("���� ������=" + circle.radius);
			System.out.println("���� ����=" + circle.getArea());
}
}


