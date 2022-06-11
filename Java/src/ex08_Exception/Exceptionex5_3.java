//checked exception을 던지는 메서드
//컴파일 에러 발생
//throws exception을 가진 메서드 호출 시 try-catch문으로 처리
package ex08_Exception;
public class Exceptionex5_3 {
	public static void main(String[] args) {
		int result;
		try {
			result = add (1,-2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	//throws Exception: throw 에 의해 발생한 에러를 호출한 메서드로 넘긴다
	static int add ( int a, int b) throws Exception {
		int result = a+ b;
		if (result < 0)
			throw new Exception("0보다 작아 에러 발생");
		System.out.println("나는 출력이 되나");
		return result;
	}
}

