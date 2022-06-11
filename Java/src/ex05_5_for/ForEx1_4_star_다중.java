package ex05_5_for;

public class ForEx1_4_star_¥Ÿ¡ﬂ {

	public static void main(String[] args) {
		int line =5;
		for (int i = 1; i <= line; i++) {//line
			for(int j =1; j<=line-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
System.out.println("=======================");
		for (int i = 1; i <= 5; i++) {//line
			
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}