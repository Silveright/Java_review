package ex05_4_do_while;

import java.util.Scanner;

public class DoWhileEX2 {

	public static void main(String[] args) {
		String location;
		Scanner sc = new Scanner(System.in);
		do { 
			System.out.println("지역입력(exit=q)>");
			location = sc.next();
			if(location.equals("q")) {
				break;//자신이 포함된 가장 가까운 반복문을 벗어난다.
			}
			System.out.println("입력하신 지역은 " +location + "입니다.");
		} while(true);
		System.out.println("끝");
		sc.close();
	}

}
