package ex06_1_array;


public class ArrayExample9_2차원배열4_향상된for문2 {

	public static void main(String[] args) {
		
		String arr[][] = { { "과일", "사과" }, 
							{ "아이스크림", "메로나" }, 
							{ "커피" } };

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


