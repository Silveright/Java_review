package ex11_7_Math;

public class MathExample1 {

	public static void main(String[] args) {
		System.out.println("12.45반올림? " +Math.round(12.45));
		System.out.println("124.5반올림? " +Math.round(124.5));
		//12.45를 반올림해서 12.5로 만들기
									//125로 만들고 원래대로
		System.out.println(Math.round(12.45*10)/10.0);
	}
}
