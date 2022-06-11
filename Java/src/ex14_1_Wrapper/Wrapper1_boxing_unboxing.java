package ex14_1_Wrapper;

public class Wrapper1_boxing_unboxing {
//웹에서 데이터를 받을 때 문자열로 받게 된다.
	public static void main(String[] args) {
		//교재 351페이지
		Integer obj = new Integer(12);//자바 jdk1.9부터 deprecated
		
		//기본형 값을 감싼다.
		//Wrapper 클래스의 생성자를 대신하는 정적 메서드를 이용해 객체 생성한다.(클래스로 접근가능>static)
		//박싱 - 기본형 타입의 값을 객체로 변환
		// int -> Integer
		Integer obj1 = Integer.valueOf(12);
		Integer obj2 = Integer.valueOf(7);
		
		
		//언박싱- 객체를 기본형 타입의 값으로 변환
		//Integer -> int
		int n1 = obj1.intValue();
		int n2 = obj2.intValue();//Integer객체 안에 int값을 가져온다.
		int sum = n1+n2;
		System.out.println(sum);
		
		//String -> Integer
//		Integer n02 = Integer.valueOf("20a");에러 발생java.lang.NumberFormatException
		//숫자가 아닌 문자가 들어가면 NumberFormatException 발생 try-catch문으로 처리
		Integer n02 = Integer.valueOf("20");//박싱이 아님
		//"20"은 문자열로 기본형이 아니다.
		//Integer->int >>20의 숫자로 변환됨
		int n3 = n02.intValue();//언박싱 이루어짐, 이것으로 형변환이 이루어짐
		sum = n1 + n2 + n3;
		System.out.println(sum);
	}

}
