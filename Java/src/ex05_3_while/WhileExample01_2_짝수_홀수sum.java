package ex05_3_while;

public class WhileExample01_2_Â¦¼ö_È¦¼ösum {

	public static void main(String[] args) {
		
		int i =-1;
		int sum =0;
		while (i <9) {
			i=i+2;
			System.out.println(i);
			sum= sum+i; //sum+=i;
		}
		System.out.printf("È¦¼öÀÇ ÇÕ: %d\n", sum);
		System.out.println("================");
		
		sum=0;
		i =0;
		while (i <9) {
			i=i+2;
			System.out.println(i);
			sum= sum+i;
		}
		System.out.printf("Â¦¼öÀÇ ÇÕ: %d", sum);
	}		

}
