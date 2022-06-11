package ex06_2_sort;

public class MethodEx9 {
	
	//접근제어자  //객체 생성없이 접근 가능      //반환되는 값의 자료형       //메서드 이름(매개변수 목록)
	public     static                     void                main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		print(num);
		return;
	}
	
	//메서드 정의               //값을 받아주는 변수
	public static void print(int[] num) {		
		
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}

//	
	return; //반환되는 값의 자료형이 void인 경우 이 문장은 생략 가능
	}
}
