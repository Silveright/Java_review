package ex06_1_array;

import java.util.Scanner;

public class ArrayExample5_1 {

	public static void main(String[] args) {
		
		System.out.print("정수 5개를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		
		
		int sum= 0;
		double avg=0;
		int[]score = new int[5];
		
		for(int i =0; i<score.length; i++) {
			score[i]=sc.nextInt();
//			System.out.println("score[" + i + "]=" + score[i]);
			sum+=score[i];
		}
		avg=(double)sum/score.length;
		System.out.println("합=" +sum);
		System.out.printf("평균=%5.1f", avg);
		sc.close();
	}
}


