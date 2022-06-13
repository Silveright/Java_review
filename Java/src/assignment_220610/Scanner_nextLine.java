package assignment_220610;

import java.util.Scanner;

public class Scanner_nextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("입력하세요>");
		  String name = sc.nextLine();
		  //엔터를 치게 되면 빈문자열이 출력되어진다.
	      System.out.println("출력결과=" + name);
	      System.out.println("name 길이=" + name.length());
	      sc.close();
		}
}
