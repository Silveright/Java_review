package ex06_2_sort;

public class MethodEx6char {
	
	//접근제어자  //객체 생성없이 접근 가능      //반환되는 값의 자료형       //메서드 이름(매개변수 목록)
	public     static                     void                main(String[] args) {
		char ch ='*';
		
		print(ch); 
	}
	
	//메서드 정의               //값을 받아주는 변수
	public static void print(char ch) {		
		System.out.println("print()메서드 입니다.");
		System.out.println("main()메서드에서 전달받은 데이터의 값은 " + ch +"입니다.");
	}

}
