package ex08_Exception;

public class Exceptionex1_2 {

	public static void main(String[] args) {
		int sum=1 +-2;
		try {
			if (sum <0) {
				//throw는 에러를 발생시키는 키워드
				throw new Exception ("에러발생");//exception 객체 생성
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("[catch]" + e.getMessage());
		}
		
	}
}
