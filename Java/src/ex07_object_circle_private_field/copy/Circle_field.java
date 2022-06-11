package ex07_object_circle_private_field.copy;
//정보의 은닉 필드에 접근할 수 없음 객체의 구성요소를 외부로부터 감추는 기술
 class Circle_field {
	public static void main(String args[]) {
	
	Circle obj1 = new Circle (3.5); //3.5가 어디에 저장이 되는지를 모르게됨
	double area= obj1.getArea();	
//	System.out.println("원의 반지름=" + obj1.radius);
	System.out.println("원의 넓이=" + area);
	
	
//	obj1.radius = 5.5;
//	System.out.println("원의 반지름=" + obj1.radius);
	System.out.println("원의 넓이=" + area);
	
	
	
	
	//return 을 변수 area 선언없이 한 줄로 했을 경우
//	System.out.println("원의 넓이=" + getArea(3.5));

	
	}
	
 }


