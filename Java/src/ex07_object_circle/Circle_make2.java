package ex07_object_circle;



public class Circle_make2 {
	public static void main(String args[]) {
	
	Circle obj1 = new Circle (3.5); 
	
	System.out.println("���� ������=" + obj1.radius);
	System.out.println("���� ����=" + obj1.getArea());
	obj1.radius = 5.5;
	
	
	
	//return �� ���� area ������� �� �ٷ� ���� ���
//	System.out.println("���� ����=" + getArea(3.5));

	
	}
}	



