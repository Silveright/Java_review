package ex05_3_while;

public class WhileExample01_2_Â¦¼ö_È¦¼ö {

	public static void main(String[] args) {
		
		int i =1;
		int sum=0;
		while (i <= 10) {
			System.out.println(i);
			sum+=i;
			i=i+2;
		}
		System.out.printf("È¦¼öÀÇ ÇÕ :%d\n", sum);
		System.out.println("================");
		
		i =2;
		sum=0;
		while (i <= 10) {
			System.out.println(i);
			sum+=i;
			i=i+2;
		}
		System.out.printf("Â¦¼öÀÇ ÇÕ :%d\n", sum);
	}		

}
