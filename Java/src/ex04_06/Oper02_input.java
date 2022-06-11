package ex04_06;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("정수를 입력 하세요>");
		int a = sc.nextInt();
		System.out.println("입력값은" + a + "입니다.");
		
		System.out.println("정수를 입력 하세요>");
		int b = sc.nextInt();
		System.out.println("입력값은 " + b + "입니다.");
		
		sc.close();
	}

}
