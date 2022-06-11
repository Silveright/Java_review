package ex06_1_array;


public class ArrayExample9_2차원배열4_향상된for문 {

	public static void main(String[] args) {
		
		int table[][] = { { 10, 20 }, { 30, 40 }, { 50 } };

		for (int[] num : table) { //table이 가리키고 있는 각 요소들은 일차원 배열을 가리키고 있다.
			for (int num1 : num) //num으로 넘어온 값들(일차원 배열)을 num1이 받아줌
				System.out.println(num1);
		}
		System.out.println();
		for (int[] num : table) { //table이 가리키고 있는 각 요소들은 일차원 배열을 가리키고 있다.
			System.out.println(num);
			for (int num1 : num) //num으로 넘어온 값들(일차원 배열)을 num1이 받아줌
				System.out.println(num1);
			
		}
	}
}


