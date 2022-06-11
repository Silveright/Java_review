package 과제;

import java.util.Scanner;

public class Assignment02_1_switch {

	
//	95~100: A+  5씩 묶음으로 처리->나누기 5를 활용한다
//	90~94: A
//	85~89: B+ ...
	public static void main(String[] args) {
		System.out.print("점수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		switch (num/5) {
		case 20: case 19:
			System.out.println("A+");
			break;
		case 18: 
			System.out.println("A");
			break;
		case 17: 
			System.out.println("B+");
			break;
		case 16:
			System.out.println("B");
			break;
		case 15:
			System.out.println("C+");
			break;
		case 14:
			System.out.println("C");
			break;
		case 13: 
			System.out.println("D+");
			break;
		case 12:
			System.out.println("D");
			break;
		
		default :
			System.out.println("F");
		}
		sc.close();
	}
}
