package ex07_object_circle_final;

import java.io.InputStream;
import java.util.Scanner;

public class Circle_make_Scanner {
	public static void main(String args[]) {
	
	//InputStream in = System.in
	// Scanner sc = new Scanner(in);
	Scanner sc = new Scanner (System.in);
	System.out.print("�������� �Է��ϼ���>");
	
//	double input=sc.nextDouble();
	Circle obj1 =new Circle (sc.nextDouble()); 
	print(obj1);
	sc.close();
	
	//return �� ���� area ������� �� �ٷ� ���� ���
//	System.out.println("���� ����=" + getArea(3.5));

	
	}
	

	public static void print(Circle circle) {
		double area= circle.getArea();	
		System.out.println("���� ������=" + circle.radius);
			System.out.println("���� ����=" + area);
}
}


