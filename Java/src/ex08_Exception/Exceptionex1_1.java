package ex08_Exception;

public class Exceptionex1_1 {

	public static void main(String[] args) {
		int sum=1 + -2;
		if (sum <0) {
			//throw는 에러를 발생시키는 키워드
			throw new Exception ("에러발생");//exception 객체 생성
		}
		System.out.println(sum);
	}
}
