package ex06_2_sort;

import java.util.Scanner;

public class MethodEx15 {
	//�����͸� �Է¹޾Ƽ� ���밪���� ��ȯ�� ����ϴ� �޼��带 ������!
	public static int abs(int data) {		
		if (data<0) 
			data = -data;

//		int result = data;
		return data; 
	}
	
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = abs(num);
		System.out.println(result);
//		System.out.println(abs(num));
		sc.close();
	}

}
