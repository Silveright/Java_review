package ex06_1_array;


public class ArrayExample9_2�����迭4_����for��2 {

	public static void main(String[] args) {
		
		String arr[][] = { { "����", "���" }, 
							{ "���̽�ũ��", "�޷γ�" }, 
							{ "Ŀ��" } };

		for (String num : arr[0]) {
			System.out.println(num);
		}
		System.out.println("=======================");

		for (String[] num : arr) {
			for (String n : num) {
				System.out.printf("%s\t",n);
				System.out.println();
			}
		}

	}
}


