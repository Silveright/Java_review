package ex06_2_sort;

import java.util.Scanner;

public class MethodEx17 {

//�ѹ��� �ִ밪�� �ּҰ� ����ϱ�
	public static int[] max_min(int[] data) {
		int result[] = {data[0], data[0]};
		for (int i =1; i<data.length; i++) {
			if (result[0] < data[i]) 
				result[0] = data[i];
			if (result[1] > data[i]) 
				result[1] = data[i];
			
	}
	return result;
	
}



public static void main(String[] args) {
	int[]data = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("5 ���� ���� �Է�");
	for (int i = 0; i< data.length; i++)
		data[i] = sc.nextInt();
	
	int[] result = max_min(data);
	System.out.println(result[0]);
	System.out.println(result[1]);
	
	sc.close();
	}
}
