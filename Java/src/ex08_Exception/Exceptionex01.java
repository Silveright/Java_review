package ex08_Exception;
public class Exceptionex01 {
	public static void main(String[] args) {
		int sum=1 + -2;
		if (sum <0) {
			new Exception ("에러발생");//exception 객체 생성
		}
		System.out.println(sum);
	}
}
