package ex05_2_switch;

import java.util.Scanner;

public class SwitchExample4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("정수1을 입력하세요>");
		int n1 = sc.nextInt();
		
		System.out.println("정수2를 입력하세요>");
		int n2 = sc.nextInt();
		
		System.out.println("연산자 +,-,*,/,% 중 한 개 입력하세요>");
		String ch = sc.next();
	
		
		switch (ch) {
		 case "+" :
			 System.out.printf("%d + %d  =%d\n  ", n1, n2, (n1 + n2));
//			 System.out.println(n1 + ch + c2 + "=" (n1 + n2));
			 break;
		 case "-" :
			 System.out.printf("%d - %d = %d\n" , n1, n2, (n1 - n2));
//			  System.out.println(n1 + ch + c2 + "=" (n1 - n2));
			 break;
		 case "*" :
			 System.out.printf("%d * %d = %d\n" , n1, n2, (n1*n2));
			 break;
		 case "/" :
			 System.out.printf("%d / %d = %.1f\n" , n1, n2, (double)n1/n2);
			 break;
		default :
			System.out.println("+, -, *, / 중 한 개를 입력하세요.");
		System.out.println("끝.");
		}
		sc.close();
	}
}
