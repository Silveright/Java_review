package ex12_1_Exception;
/*
 * 자바에서는 실행도중 발생하는 에러(런타임 에러)를 에러와 예외로 구분한다.
 * Error:프로그램 코드에 의해 수습될 수 없는 심각한 오류
 * Exception:프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류
 * 
 * 
 * Exception이 일어나는 상황
 * 1) 정수를 0으로 나눌 때
 * 2) 배열의 index값이 음수 값
 * 3) 부적절한 형변환
 * 4) 입출력하기 위한 파일이 존재하지 않는 경우
 * 5) 메서드 호출 시
 */
//unchecked exception에 해당 - 컴파일 에러 없음
//실행 시 에러 발생 - 예외 발생
public class ExceptionExample2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =3, num2 =0;
		
		try {
			int result = num1/num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		finally {//에러 발생 유무 관계 없이 실행됨
			System.out.println("여기까지왔어요");
		}
	}

}
