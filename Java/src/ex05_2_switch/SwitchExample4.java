package ex05_2_switch;

import java.util.Scanner;

public class SwitchExample4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("����1�� �Է��ϼ���>");
		int n1 = sc.nextInt();
		
		System.out.println("����2�� �Է��ϼ���>");
		int n2 = sc.nextInt();
		
		System.out.println("������ +,-,*,/,% �� �� �� �Է��ϼ���>");
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
			System.out.println("+, -, *, / �� �� ���� �Է��ϼ���.");
		System.out.println("��.");
		}
		sc.close();
	}
}
