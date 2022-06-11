/*Object클래스에 정의된 tostring() 은 인스턴스에 대한 정보를
 * 문자열 로 제공할 목적으로 정의한 것
 * 클래스 작성 시 toString()을 오버라이딩 하지 않으면 아래와 같이 정의된 내용이 그대로 사용된다
 * 
 * public String tostring() {
 *  		return getClass().getName() + "@" + Integer.toHexString(hasgCode);
 *  		}
 * -getClass() 메서드와 hashCode()메서드 역시 Object클래스의 메서드로 호출할 수 있다
 * 해시 코드는 인스턴스의 주소와 관련된 값
 * 
 * -hashCode() 메서드는 해싱 기법에 사용되는 해시함수를 구현한 것이다
 * 해싱은 데이터 관리 기법 중 하날
 */

package ex13_1_Object_toString;
public class ObjectExample2 {
	public static void main(String[] args) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1.toString());//	String java.lang.Object.toString()
		//System.out.print() 나 System.out.println()메소드에 
		//문자열이 아닌 객체를 넘겨주면 toString()메서드가 호출된다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
		System.out.println(obj1.radius);
	}

}
