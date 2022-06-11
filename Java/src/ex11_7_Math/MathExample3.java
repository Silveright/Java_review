package ex11_7_Math;

public class MathExample3 {

	public static void main(String[] args) {
	// 파일 업로드시 시스템에 의해 다른 이름으로 변환해서 올라감  Random 으로 서로 중복되지 않게 사용
		System.out.println(Math.random());//0<=난수 <1: double형
		System.out.println(Math.random());
		System.out.println(Math.random());
		int num;
		/*
		 * 0부터 9까지 정수 번위에 속하는 난수 만들기
		 * 1. 0<= 난수 < 1
		 * 2. 0<= 난수*10< 10
		 * 3. 0<= (int)(난수*10) <10 ==> 정수로 만든다.
		 * 
		 * 공식: (정수화)((상한값 - 하한값 +1)*난수 + 하한값)
		 * 	(int)((9-0+1)*난수+0)
		 */
		num = (int)(Math.random()*10);
		System.out.println(num);
		
		for(int i =0;i<6;i++) {
			num = (int)(Math.random()*45 + 1);
			System.out.print(num+"\t");//중복이 발생할 수 있음
		}
	}
}
