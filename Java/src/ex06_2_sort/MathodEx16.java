package ex06_2_sort;

import java.util.Scanner;

public class MathodEx16 {

//�� ���� ������ �Է��� �ִ밪�� �ּҰ��� ����ϴ� �޼��带 ������
	public static int max(int a, int b) { //�ִ밪�� ���ϴ� �޼���1
		int max = a;
		if (max < b) {
			max = b; 
					}
		return max; 
	}
	
		public static int min(int a, int b) { //�ּҰ��� ���ϴ� �޼���2
			
			int min = a;
			
				if(min>b) {
					min =b;
				}
				return min;
			}
		public static void main(String[] args) {
			
			System.out.println("�� ���� ���� �Է�");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int max = max(a,b);
			int min = min(a,b);
			
			System.out.println("max="+max);
			System.out.println("min="+min);
			
			System.out.println("�ִ밪 =" +max + " �ּҰ�= " + min);
			sc.close();
		}
}

