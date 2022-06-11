package ex04_12_conditional_op;

import java.util.Scanner;

public class ConditionalOpExample2 {
	public static void main(String[] args) {
		System.out.print("3개의 정수를 입력 하세요");
		int n1 , n2, n3, max , min;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		max = n1 > n2 ? n1 : n2;
		max = n3 > max ? n3 : max;
		System.out.println("max = " + max);
		System.out.printf("%d, %d, %d중 가장 큰 수는 %d 입니다.\n" ,n1, n2, n3, max);
		
		min = n1 < n2 ? n1 : n2;
		min = n3 < min ? n3 : min;
		System.out.println("min = " + min);
		System.out.printf("%d, %d, %d중 가장 작은 수는 %d 입니다." ,n1, n2, n3, min);
	
		sc.close();
	}

}
