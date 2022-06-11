package ex04_13_ComAssign;

public class ComAssignmentExample1 {

	public static void main(String[] args) {
		int res = 10, a =2;
		res += a;
		System.out.println(res);
		
		res -= a;
		System.out.println(res);
		
		res *= a;
		System.out.println(res);
		
		res /= a;
		System.out.println(res);

		int num = 29;
		num -= 2 + 3 * 4;
		System.out.println(num);
	}

}
