package ex14_1_Wrapper;
//기본형 값->Wrapper 객체로의 자동 Boxing
public class Wrapper7_auto_boxing {

	public static void main(String[] args) {
		printDouble(Double.valueOf(123.45));
		//double 타입의 값을 가지고 Double타입 인자를 받는 메서드 호출
		printDouble(123.45);
		//printDouble(Double.valueOf(123.45D));로 변환된다.
	}
	//자동 (오토) boxing
	 static void printDouble(Double obj) {
		 System.out.println("obj =" + obj);
		 System.out.println("obj.doubleValue() =" + obj.doubleValue());
		 System.out.println("obj.toString() =" + obj.toString());
	}
}
