package ex04_06;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("������ �Է� �ϼ���>");
		int a = sc.nextInt();
		System.out.println("�Է°���" + a + "�Դϴ�.");
		
		System.out.println("������ �Է� �ϼ���>");
		int b = sc.nextInt();
		System.out.println("�Է°��� " + b + "�Դϴ�.");
		
		sc.close();
	}

}
