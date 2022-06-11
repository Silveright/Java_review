package ex06_2_sort;

public class MethodEx8 {
	
	//접근제어자  //객체 생성없이 접근 가능      //반환되는 값의 자료형       //메서드 이름(매개변수 목록)
	public     static                     void                main(String[] args) {
		int num= 50;
		char data ='*';
		print(num,data);
		
	}
	
	//메서드 정의               //값을 받아주는 변수
	public static void print(int parn, char p_data) {		
		for (int i = 0; i < parn; i++)
			System.out.print(p_data);
	}

}
