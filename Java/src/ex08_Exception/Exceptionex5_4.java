//checked exception을 던지는 메서드
//컴파일 에러 발생
//throws exception을 가진 메서드 호출 시 try-catch문으로 처리
package ex08_Exception;
public class Exceptionex5_4 {
	public static void main(String[] args) {
		int result;
		 result = add (0,-2);
		}


	//throws Exception: throw 에 의해 발생한 에러를 호출한 메서드로 넘긴다
	static int add ( int a, int b)  {
		int result = a+ b;
		try {
			if (result < 0) {
			throw new Exception("0보다 작아 에러 발생");
			}			
			System.out.println("나는 출력이 되나");
			System.out.println(result);
		}catch (Exception e) {
		System.out.println(e.getMessage());
	}
		return result;
	}
}



//try {
//	if (sum <0) {
//		//throw는 에러를 발생시키는 키워드
//		throw new Exception ("에러발생");//exception 객체 생성
//	}
//	System.out.println(sum);
//} catch (Exception e) {
//	System.out.println("[catch]" + e.getMessage());
//}
