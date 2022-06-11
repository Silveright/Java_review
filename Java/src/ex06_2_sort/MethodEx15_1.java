package ex06_2_sort;

import java.util.Scanner;

public class MethodEx15_1 {
	
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int inputdata = sc.nextInt();
		int result = abs(inputdata);
		System.out.println(result);
		sc.close();
	}
	
	public static int abs(int data) {		
		if (data<0) 
			data = -data;
		return data; 
	}
	

}
