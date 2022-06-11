package ex05_1_if;

import java.util.Scanner;

public class IfExample4 {

	public static void main(String[] args) {
		System.out.print("수를 입력 하세요>");
//		InputStream in = System.in;
//		Scanner sc = new Scanner(in);
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		if (num < 10) {
			System.out.println("num의 값은 10 미만 입니다.");
		} else if (num < 100) {
			System.out.println("num의 값은 10이상 100 미만 입니다.");
		} else if (num < 1000) {
			System.out.println("num의 값은 100이상 1000미만입니다.");
		} else {
			System.out.println("num의 값은 1000이상 입니다.");

		
		}
		sc.close();
	}
}
