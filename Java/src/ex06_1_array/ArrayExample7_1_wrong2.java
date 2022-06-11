package ex06_1_array;

import java.util.Scanner;

public class ArrayExample7_1_wrong2 {

	public static void main(String[] args) {
		
		int[] data = new int[5];
		System.out.println("정수 5개를 입력하세요");
		Scanner sc = new Scanner(System.in);
//		data[0]=sc.nextInt();
		int max = 0 , min =0;
		for(int i =0; i<data.length; i++) {
			data[i]=sc.nextInt();
		
			for(int a =1; i<data.length; i++) {
			max = data[0];
			min =data[0];
			if(data[a]>max) {
				max = data[a];
			}  if (data[a]<min) {
				min = data[a];
			}
		}
		
		System.out.println("max=" +max);
		System.out.println("min=" +min);
	}
	}		
}


