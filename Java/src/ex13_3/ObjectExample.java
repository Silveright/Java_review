/* equals 메서드 사용예) 똑같은 값을 갖는 두 개의 객체를 생성
 
 *Object 클래스의 equals()메서드
 *매개변수로 객체의 참조변수를 받아 비교하여 그 결과를 boolean값으로 알려주는 역할을 한다.
 *
 *equals 메서드의 실제 내용:
 *public boolean equals(Object arg0) {
 *				return this==arg0;
 *		} 두 객체의 같고 다름을 참조변수의 값으로 판단한다.
 *		서로 다른 두 객체를 equals메서드로 비교하면 항상 false결과를 얻게 된다.
 *
 */

package ex13_3;

import java.util.GregorianCalendar;

public class ObjectExample {

	public static void main(String[] args) {
		GregorianCalendar obj1 = new GregorianCalendar(2021,5,1);
		GregorianCalendar obj2 = new GregorianCalendar(2021,5,1);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.toString());//오버라이딩 되어 있다String java.util.Calendar.toString()
		System.out.println(obj2.toString());
		
		if(obj1.equals(obj2))//원래라면 다름>> 오버라이딩 되어 있다.boolean java.util.GregorianCalendar.equals(Object obj)
		System.out.println("obj1.equals(obj2):같음");
		else
		System.out.println("obj1.equals(obj2):다름");
		
		if(obj1 == obj2)
		System.out.println("obj1==obj2 같음");
		else
		System.out.println("obj1==obj2 다름");
		
		
	}

}
