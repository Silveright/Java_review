package ����;

import java.util.Scanner;

public class Assignment3_3_paging {

	public static void main(String[] args) {
		
	
			System.out.print("������ �Է��ϼ���>");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int div = num / 10;
			if (num % 10 == 0) {
				System.out.println((div - 1) *10);
			} else {
				System.out.println(num / 10 * 10);
			

		} 
		sc.close();
	}
}
