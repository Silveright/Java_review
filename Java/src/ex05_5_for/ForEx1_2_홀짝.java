package ex05_5_for;

public class ForEx1_2_Ȧ¦ {

	public static void main(String[] args) {
		int sum = 0;
		for (int i =1; i<=10; i=i+2) {
			sum= i +sum;
			System.out.println(i);
		}
			System.out.println("Ȧ���� ��=" + sum);	
			System.out.println("============");
		
		int i=0;
		sum=0;
		for (i = 2; i<=10; i=i+2) {
			sum = i + sum;
			System.out.println(i);
		}
		System.out.println("¦���� ��=" + sum);
		System.out.println("============");
		
		i=0;
		sum = 0;
		for ( i =1; i <=10; i++) {
			sum+=i;
		}
		System.out.println("1���� 10������ ��=" + sum);
	}

}
