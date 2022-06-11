package ex05_3_while;

public class WhileExample01_2_sum {

	public static void main(String[] args) {
		
		int sum = 0;
		int i =1;
		while (i <= 10) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
	}

}
