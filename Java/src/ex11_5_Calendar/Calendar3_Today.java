package ex11_5_Calendar;

public class Calendar3_Today {
	public static void main(String[] args) {
		System.out.println("===오늘의 날짜===");
		Today t = new Today();
		System.out.println(t.toString());
		System.out.println(t);//내부적으로 toString을 호출하고 있음
	}
}
