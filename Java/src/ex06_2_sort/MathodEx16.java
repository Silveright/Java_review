package ex06_2_sort;

import java.util.Scanner;

public class MathodEx16 {

//두 개의 정수를 입력해 최대값과 최소값을 출력하는 메서드를 만들자
	public static int max(int a, int b) { //최대값을 구하는 메서드1
		int max = a;
		if (max < b) {
			max = b; 
					}
		return max; 
	}
	
		public static int min(int a, int b) { //최소값을 구하는 메서드2
			
			int min = a;
			
				if(min>b) {
					min =b;
				}
				return min;
			}
		public static void main(String[] args) {
			
			System.out.println("두 개의 정수 입력");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int max = max(a,b);
			int min = min(a,b);
			
			System.out.println("max="+max);
			System.out.println("min="+min);
			
			System.out.println("최대값 =" +max + " 최소값= " + min);
			sc.close();
		}
}

