package ex06_1_array;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		
		System.out.print("정수 5개를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int arr[] = { a, b,c,d,e };
		int sum= 0;
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
			sum+=arr[i];
		}
		double avr=(double)sum/arr.length;
		System.out.println("합=" +sum);
		System.out.println("평균="+ avr);
		sc.close();
	}
}


