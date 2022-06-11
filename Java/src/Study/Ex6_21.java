package Study;

public class Ex6_21 {
	static int abs(int value) {
//		if (value<0)
//		return -value;
//		else return value;
		return value >=0 ? value : -value;
	}
	
	public static void main(String[] args) {
		int value=5;
		System.out.println(abs(value));
		
		value=-15;
		System.out.println(abs(value));
		
		
	}
}
