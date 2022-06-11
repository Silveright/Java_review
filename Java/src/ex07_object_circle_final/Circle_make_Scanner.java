package ex07_object_circle_final;

import java.io.InputStream;
import java.util.Scanner;

public class Circle_make_Scanner {
	public static void main(String args[]) {
	
	//InputStream in = System.in
	// Scanner sc = new Scanner(in);
	Scanner sc = new Scanner (System.in);
	System.out.print("반지름을 입력하세요>");
	
//	double input=sc.nextDouble();
	Circle obj1 =new Circle (sc.nextDouble()); 
	print(obj1);
	sc.close();
	
	//return 을 변수 area 선언없이 한 줄로 했을 경우
//	System.out.println("원의 넓이=" + getArea(3.5));

	
	}
	

	public static void print(Circle circle) {
		double area= circle.getArea();	
		System.out.println("원의 반지름=" + circle.radius);
			System.out.println("원의 넓이=" + area);
}
}


