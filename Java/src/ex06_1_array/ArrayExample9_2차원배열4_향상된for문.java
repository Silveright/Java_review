package ex06_1_array;


public class ArrayExample9_2�����迭4_����for�� {

	public static void main(String[] args) {
		
		int table[][] = { { 10, 20 }, { 30, 40 }, { 50 } };

		for (int[] num : table) { //table�� ����Ű�� �ִ� �� ��ҵ��� ������ �迭�� ����Ű�� �ִ�.
			for (int num1 : num) //num���� �Ѿ�� ����(������ �迭)�� num1�� �޾���
				System.out.println(num1);
		}
		System.out.println();
		for (int[] num : table) { //table�� ����Ű�� �ִ� �� ��ҵ��� ������ �迭�� ����Ű�� �ִ�.
			System.out.println(num);
			for (int num1 : num) //num���� �Ѿ�� ����(������ �迭)�� num1�� �޾���
				System.out.println(num1);
			
		}
	}
}


