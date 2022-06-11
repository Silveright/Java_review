package ex04_10_rel_logic_op;


import java.util.Scanner;

public class LogicalExample6 {

	public static void main(String[] args) {
		int a= 20, b=20;
		
		if (a>=20 && ++b >=20) {
			System.out.println("Âü: " + b);
		} else {
			System.out.println("°ÅÁş: " + b);
		}
		System.out.println(b);
		System.out.println("===============");
		
		a= 10; b = 20;
		if (a>=20 || ++b >=20) {
			System.out.println("Âü :" + b);
		} else {
			System.out.println("°ÅÁş :" + b);
		}
		System.out.println(b);
	}

}
