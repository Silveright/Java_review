package ex07_static_final1;

public class StaticfieldEx2 {
	public static void main (String args[]) {
		System.out.println("���Ѱ� =" +Accumulator.UPPER_LIMIT);
		
		Accumulator v = new Accumulator();
		v.setValue(200000);
		System.out.println("v.value =" + v.value);
		
		System.out.println("������ ���Ѱ� =" + Integer.MAX_VALUE);
		System.out.println("������ ���Ѱ� =" + Integer.MIN_VALUE);
	}
}
