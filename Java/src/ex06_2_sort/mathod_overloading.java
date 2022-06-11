//오버로딩을 이용한 최대값 구하기
/*
 자바는 메서드 시그니처를 사용해 메서드를 구분
 메서드 시그니처는 메서드 이름과 매개변수 개수, 데이터 타입, 순서를 의미
 메서드 이름이 동일하더라도 매개변수 개수, 데이터타입, 순서 중 하나라도 다르면 다른 메서드로 정의(오버로딩)
 자바는 반환타입으로 메서드를 구분하지 않는다


*/
package ex06_2_sort;

import java.util.Scanner;

public class mathod_overloading {

	public static int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
}

	public static int max(int n1, int n2, int n3) {
		int max = n1;
		if (max < n2)	max = n2;
		if (max < n3)	max = n3;
		return max;
	}

	public static int max(int n1, int n2, int n3, int n4) {
	int max = n1;
	if (max < n2)	max = n2;
	if (max < n3)	max = n3;
	if (max < n4)	max = n4;
	return max;
	
	}
	
//	duplicate method max(int,int,int,int) in type Method_overloading
//	반환형은 메서드 오버로디 ㅇ조건과 무관해서 위으 메서드와 동일하게 취급해 에러 발생
	
//	public static String max(int n1, int n2, int n3, int n4)
//	int max = n1;
//	if (max < n2)	max = n2;
//	if (max < n3)	max = n3;
//	if (max < n4)	max = n4;
//	return max;
//	return "반환형 String:" + max
//	}

	public static void main(String args[]) {
		System.out.println("max(10,20) = " + max (10, 20));
		System.out.println("max(10,20,30) = " + max (10, 20,30));
		System.out.println("max(10,20,30,40) = " + max (10, 20,30,40));
	}
}
	
	
	
	
