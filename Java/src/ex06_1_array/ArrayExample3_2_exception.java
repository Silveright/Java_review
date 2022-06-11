package ex06_1_array;

public class ArrayExample3_2_exception {

	public static void main(String[] args) {
		int arr[] = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		try {
			System.out.println(arr[10]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index 범위 초과");
		
		}
	}
}


