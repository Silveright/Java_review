package ex07_object_circle;



public class Circle_make2 {
	public static void main(String args[]) {
	
	Circle obj1 = new Circle (3.5); 
	
	System.out.println("원의 반지름=" + obj1.radius);
	System.out.println("원의 넓이=" + obj1.getArea());
	obj1.radius = 5.5;
	
	
	
	//return 을 변수 area 선언없이 한 줄로 했을 경우
//	System.out.println("원의 넓이=" + getArea(3.5));

	
	}
}	



