package ex05_3_while;

public class WhileExample01_2_¦��_Ȧ�� {

	public static void main(String[] args) {
		
		int i =1;
		int sum=0;
		while (i <= 10) {
			System.out.println(i);
			sum+=i;
			i=i+2;
		}
		System.out.printf("Ȧ���� �� :%d\n", sum);
		System.out.println("================");
		
		i =2;
		sum=0;
		while (i <= 10) {
			System.out.println(i);
			sum+=i;
			i=i+2;
		}
		System.out.printf("¦���� �� :%d\n", sum);
	}		

}
