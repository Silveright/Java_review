package ex07_object_circle_private_field.copy;
//������ ���� �ʵ忡 ������ �� ���� ��ü�� ������Ҹ� �ܺηκ��� ���ߴ� ���
 class Circle_field {
	public static void main(String args[]) {
	
	Circle obj1 = new Circle (3.5); //3.5�� ��� ������ �Ǵ����� �𸣰Ե�
	double area= obj1.getArea();	
//	System.out.println("���� ������=" + obj1.radius);
	System.out.println("���� ����=" + area);
	
	
//	obj1.radius = 5.5;
//	System.out.println("���� ������=" + obj1.radius);
	System.out.println("���� ����=" + area);
	
	
	
	
	//return �� ���� area ������� �� �ٷ� ���� ���
//	System.out.println("���� ����=" + getArea(3.5));

	
	}
	
 }


