package ex05_1_if;

import java.util.Scanner;

public class IfExample5 {

	public static void main(String[] args) {
		System.out.print("������ �Է� �ϼ���>");
//		InputStream in = System.in;
//		Scanner sc = new Scanner(in);
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		if (num>= 95) {
			System.out.println("A+����");
		} else if (num >=90) {
			System.out.println("A����");
		} else if (num >=85) {
			System.out.println("B+����");
		} 	 else if (num >=80) {
		System.out.println("B����");	 
		} else if (num >=75) {
			System.out.println("C+����");
		 
		} else if (num >=70) {
			System.out.println("C+����");
		 
		} else if (num >=65) {
			System.out.println("D+����");
		
		} else if (num >=60) {
			System.out.println("D����");
		 
		} else {
			System.out.println("F����");
		}
		sc.close();
	}
}
