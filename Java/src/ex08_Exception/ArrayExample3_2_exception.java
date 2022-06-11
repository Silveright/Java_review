package ex08_Exception;
public class ArrayExample3_2_exception {
	public static void main(String[] args) {
		int arr[] = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			//String message = e.getMessage();
			//System.out.println(message);
			System.out.println(e.getMessage());
			System.out.println("ÀÎµ¦½º ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
		}
	}
}


