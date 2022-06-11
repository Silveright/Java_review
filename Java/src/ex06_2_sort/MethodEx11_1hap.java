package ex06_2_sort;

public class MethodEx11_1hap {
	
	//접근제어자  //객체 생성없이 접근 가능      //반환되는 값의 자료형       //메서드 이름(매개변수 목록)
	public     static                     void                main(String[] args) {
		hap(1,10);
		
		int a = hap(1,100); //return의 sum의 값 저장됨
		System.out.println("1: result =" +a);
	
	
	}
	
	
	
	
                  //반환형         //값을 받아주는 변수
	public static int hap(int a, int b) {			//메서드 정의 
		int sum=0;
		for(int i=a; i<=b;i++) {	
			sum+=i;
		}
//		System.out.println(sum);
	return sum; //sum의 자료형과 메서드의 반환형은 일치해야함
	}
}
