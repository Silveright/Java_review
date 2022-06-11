package ex05_3_while;

public class WhileExample01_2_calender {

	public static void main(String[] args) {
		
		int i =1;
		while (i <= 31) {
			System.out.printf("%5d",i);
			if (i%7==0)
				System.out.println();
			i++;
		}
		System.out.println("\n=============");
		 i =0;
		while (++i <= 31) {
			System.out.printf("%5d",i);
			if (i%7==0)
				System.out.println();
		}
	}

}
