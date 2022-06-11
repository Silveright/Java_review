package ex06_2_sort;

import java.util.Scanner;

public class MethodEx15 {
	//데이터를 입력받아서 절대값으로 변환해 출력하는 메서드를 만들자!
	public static int abs(int data) {		
		if (data<0) 
			data = -data;

//		int result = data;
		return data; 
	}
	
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = abs(num);
		System.out.println(result);
//		System.out.println(abs(num));
		sc.close();
	}

}
