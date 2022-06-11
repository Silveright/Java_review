/*
 * clone()메서드는 객체를 복제하는 기능을 한다.
 * 즉, 똑같은 값을 갖는 객체를 하나 더 만든다.
 * 복제 가능한 클래스에 대해서만 호출할 수 있다.
 * 복제 가능한 클래스는 Cloneable 인터페이스 구현 여부. implements Cloneable
 * 
 * Cloneable 인터페이스를 구현한 GregorianCalendar 클래스에 대해
 * clone()메서드 호출하는 예제
 */

package ex13_6_clone;
import java.util.GregorianCalendar;
public class ObjectExample_cloneable {

	public static void main(String[] args) {
		//객체를 생성한다.
		GregorianCalendar obj1 = new GregorianCalendar(2020,11,1);
		//clone메서드로 객체를 복사한다.
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)imsi;
		
		//GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();
		
		//%tF: 포맷 명세자는 날짜를 yyyy-MM-dd 형식으로 포맷하는 역할을 한다.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2021, 5, 1);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
	}
}
