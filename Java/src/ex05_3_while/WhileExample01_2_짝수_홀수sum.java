package ex05_3_while;

public class WhileExample01_2_¦��_Ȧ��sum {

	public static void main(String[] args) {
		
		int i =-1;
		int sum =0;
		while (i <9) {
			i=i+2;
			System.out.println(i);
			sum= sum+i; //sum+=i;
		}
		System.out.printf("Ȧ���� ��: %d\n", sum);
		System.out.println("================");
		
		sum=0;
		i =0;
		while (i <9) {
			i=i+2;
			System.out.println(i);
			sum= sum+i;
		}
		System.out.printf("¦���� ��: %d", sum);
	}		

}
