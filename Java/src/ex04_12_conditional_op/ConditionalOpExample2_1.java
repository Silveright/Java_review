package ex04_12_conditional_op;

import java.util.Scanner;

public class ConditionalOpExample2_1 {
	public static void main(String[] args) {
		System.out.print("3개의 정수를 입력 하세요");
		int n1 , n2, n3, max , min  ;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3 && n2 < n3) {
		max = n1;
		min = n2;
		System.out.println("max=" + max);
		} 
		
		if (n2 > n3 ) {
		max = n3; 
		System.out.println("max=" + max);
		}
		
		if (n2 < n3) {
			min = n2;
			System.out.println("min =" + min);
		
		}
		
		
		
		sc.close();
	}

}
