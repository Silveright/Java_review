package ex04_12_conditional_op;

import java.util.Scanner;

public class ConditionalOpExample2_2 {
	public static void main(String[] args) {
		System.out.print("3���� ������ �Է� �ϼ���");
		int n1 , n2, n3, max , min  ;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
	
		max = n1;
		
		if (n2 > max) 
			max = n2; 
		if (n3 > max) 
			max = n3; 
		System.out.println("�ִ��� " + max + "�Դϴ�.");

		
		 min = n1;
		
		if (n2 < min) 
			min = n2; 
		if (n3 < min) 
			min = n3; 
		System.out.println("�ּҰ��� " + min + "�Դϴ�.");


		
		
		
		sc.close();
	}

}
