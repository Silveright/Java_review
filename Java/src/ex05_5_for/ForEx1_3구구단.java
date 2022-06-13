package ex05_5_for;

public class ForEx1_3구구단 {

	public static void main(String[] args) {
		for (int i=2; i<=2; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d*%d=%d\n", i,j,i*j);
			}
		}
//		int dan=2;
//		System.out.println("["+dan+"단]");
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
//		
//		dan = 3;
//		System.out.println("[" + dan + "단]");
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan * i));
//		}
//		
//		dan = 4;
//		System.out.println("[" + dan + "단]");
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan * i));
//		}
		for (int dan =2; dan <=9; dan++) {
			System.out.println("[" + dan + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
		}

	}
}
