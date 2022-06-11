package ex07_object_circle;



public class Circle_make {
	public static void main(String args[]) {
	
	Circle obj1 = new Circle (3.5); 
	print(obj1);
	
	obj1.radius = 5.5;
	
	print(obj1);
	
	
	//return 을 변수 area 선언없이 한 줄로 했을 경우
//	System.out.println("원의 넓이=" + getArea(3.5));

	
	}
	

	public static void print(Circle circle) {
//		double area= circle.getArea();	
		System.out.println("원의 반지름=" + circle.radius);
			System.out.println("원의 넓이=" + circle.getArea());
}
}


