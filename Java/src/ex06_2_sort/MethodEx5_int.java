package ex06_2_sort;

public class MethodEx5_int {
	
	//접근제어자  //객체 생성없이 접근 가능      //반환되는 값의 자료형       //메서드 이름(매개변수 목록)
	public     static                     void                main(String[] args) {
		int num =50;
		//num변수가 갖고 있는 값을  print()안에서 출력하려면..
		print(num);  //메서드의 괄호 안에 값을 넣어준다.
					// 메서드를 정의한 곳에서  num의 값을 저장하기 위한 변수를 선언
					//호출하는 메서드에서 사용한  num의 값은 인자
					//메서드 정의에 사용된 parameter를 매개변수라고 한다
	}
	
	//메서드 정의               //값을 받아주는 변수
	public static void print(int num) {		
		System.out.println("print()메서드 입니다.");
		System.out.println("main()메서드에서 전달받은 데이터의 값은 " + num +"입니다.");
	}

}
