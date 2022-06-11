package ex06_2_sort;

import java.util.Scanner;

public class MethodEx17_1maxmin {

//한번에 최대값과 최소값 출력하기
	public static int[] max_min(int[] data) {
		
		int max = data[0], min= data[0];
		for (int i =1; i<data.length; i++) {
			if (max < data[i]) 
				max = data[i];
			if (min > data[i]) 
				min = data[i];
			
	}
	int result[] = {max, min};
	return result;
	
}



public static void main(String[] args) {
	int[]data = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("5 개의 정수 입력");
	for (int i = 0; i< data.length; i++)
		data[i] = sc.nextInt();
	
	int[] result = max_min(data);
	System.out.println(result[0]);
	System.out.println(result[1]);
	
	sc.close();
	}
}
