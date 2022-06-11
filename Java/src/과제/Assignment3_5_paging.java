package 과제;

import java.util.Scanner;

public class Assignment3_5_paging {

	public static void main(String[] args) {
		
		
			System.out.print("page를 입력하세요>");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int div = num / 10;
			if (num % 10 == 0) {
				System.out.println("startpage=" +((div - 1) *10+1));
			} else {
				System.out.println("startpage=" +(num / 10 * 10+1));
			

		} 
		sc.close();
	}
}
