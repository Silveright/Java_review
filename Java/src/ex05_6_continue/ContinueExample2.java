package ex05_6_continue;

public class ContinueExample2 {

	public static void main(String[] args) {
		int [] arr;
		arr = new int[10];

		arr[0] =10;
		arr[1] = 20;
		arr[3] = arr[0] +arr[1];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]);
		System.out.println(arr[3]);
		System.out.println(arr[10]);
	}
}


