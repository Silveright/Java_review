package ex06_1_array;

import java.util.Scanner;

public class ArrayExample8_������2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name[] = { "ȫ�浿", "�̼���", "�������" };
		
		int index = -1;
		
		do {
		System.out.println("�̸��� �Է��ϼ���.");
		System.out.println("�̸�:");

		String inputname = sc.next();
		
		for(int i =0; i<name.length; i++) {
			if(inputname.equals(name[i])) {
				index = i;
			}
		}
		if(index != -1) {
				System.out.println(inputname + "�� �迭�� �ε���" + index +"�濡�� ã�ҽ��ϴ�.");
				break;
			}
			System.out.println(inputname + "�� �迭�濡�� ã�� ���߽��ϴ�.");
		}while(true);
		sc.close();
	}
}

