package ex06_1_array;

import java.util.Scanner;

public class ArrayExample8_������4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name[] = { "ȫ�浿", "�̼���", "ȫ�浿", "�������","��浿" };
		
		int index = -1;
		
		 
		System.out.println("�̸��� �Է��ϼ���.");
		System.out.println("�̸�:");

		String inputname = sc.next();
		
		for(int i =name.length-1; i >= 0; i--) {
			if(inputname.equals(name[i])) {
				index = i;
				break;
			}
		}
		if(index != -1) {
				System.out.println(inputname + "�� �迭�� �ε���" + index +"���� ã�ҽ��ϴ�.");
			
			} else{
			System.out.println(inputname + "�� �迭�濡�� ã�� ���߽��ϴ�.");
		}
		sc.close();
	}
}


