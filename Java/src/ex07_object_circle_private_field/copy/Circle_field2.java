package ex07_object_circle_private_field.copy;
//������ ���� �ʵ忡 ������ �� ���� ��ü�� ������Ҹ� �ܺηκ��� ���ߴ� ���
 class Circle_field2 {
	public static void main(String args[]) {
	
	Circle2 obj1 = new Circle2 (5.5); //3.5�� ��� ������ �Ǵ����� �𸣰Ե�
	double area= obj1.getArea();	
	System.out.println("���� ������=" + obj1.getRadius());
	System.out.println("���� ����=" + area);
	
	obj1.setRadius(10.5);
	area= obj1.getArea();	
	System.out.println("���� ������=" + obj1.getRadius());
	System.out.println("���� ����=" + area);
	
	
	
	
	//return �� ���� area ������� �� �ٷ� ���� ���
//	System.out.println("���� ����=" + getArea(3.5));

	
	}
	
 }
//	public static void print(Circle circle) {
//}
//}


