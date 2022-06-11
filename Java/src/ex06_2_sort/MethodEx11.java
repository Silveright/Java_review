package ex06_2_sort;

public class MethodEx11 {
	
	//접근제어자  //객체 생성없이 접근 가능      //반환되는 값의 자료형       //메서드 이름(매개변수 목록)
	public     static                     void                main(String[] args) {
		hap(1,10);
		
//		int result = hap(1,100);
//		System.out.println("1: result =" +result);
	
	
	}
	
	
	
	
                  //반환형         //값을 받아주는 변수
	public static void hap(int a, int b) {			//메서드 정의 
		int sum=0;
		for(int i=a; i<=b;i++) {	
			sum+=i;
		}
		System.out.println(sum);
//	return sum; //반환되는 값의 자료형이 void인 경우 이 문장은 생략 가능
	}
}
