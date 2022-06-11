package 과제;

import java.util.Scanner;

public class Assignment3_1_paging {

	public static void main(String[] args) {
		
		
		System.out.print("정수를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		System.out.println(num/10);

		sc.close();
		}
	}

