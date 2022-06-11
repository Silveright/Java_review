package ex06_2_sort;

import java.util.Scanner;

public class MathodEx16_1 {


	public static int max(int a, int b) {
		if (a < b) 
			return b;
			else 
				return a;
		}
	
	public static int min(int a, int b) {
			if(a>b) 
					return b;
				else
					return a;
			
			}
		

	public static void main(String[] args) {
		int n1, n2, max2, min2;
		System.out.println("두 개의 정수 입력");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		max2 = max(n1,n2);
		min2 = min(n1,n2);
		
		System.out.println("max="+max2);
		System.out.println("min="+min2);
		
		sc.close();
	}
}

	
	
	

			


