package ex07_static_final1;

public class StaticfieldEx2 {
	public static void main (String args[]) {
		System.out.println("상한값 =" +Accumulator.UPPER_LIMIT);
		
		Accumulator v = new Accumulator();
		v.setValue(200000);
		System.out.println("v.value =" + v.value);
		
		System.out.println("정수의 상한값 =" + Integer.MAX_VALUE);
		System.out.println("정수의 하한값 =" + Integer.MIN_VALUE);
	}
}
