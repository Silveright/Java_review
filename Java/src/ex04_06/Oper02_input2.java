package ex04_06;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input2 {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		int a, b, result;
		System.out.print("����1�� �Է� �ϼ���>");
		 a = sc.nextInt();
		System.out.println("����2�� �Է� �ϼ���>");
		 b = sc.nextInt();
		
//		System.out.println(a + " + " + b + " = " + (a+b));
//		
//		System.out.println(a + " - " + b + " = " + (a-b));
//		
//		 
//		System.out.println(a + " * " + b + " = " + a*b);
//		
//		
//		System.out.println(a + " / " + b + " = " + (a/b));
//
//		
//		System.out.println(a + " % " + b + " = " + (a%b));

		
		result = a + b;
		System.out.printf("%-3d + %3d = %d\n", a, b, result);

		result = a - b;
		System.out.printf("%-5d - %5d = %d\n", a, b, result);
		
		result = a * b;
		System.out.printf("%-5d * %5d = %d\n", a, b, result);
		
		result = a / b;
		System.out.printf("%-5d + %5d = %d\n", a, b, result);
		sc.close();
		
		
	
	}

}
