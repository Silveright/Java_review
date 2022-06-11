package ex15_1_ArrayList;
import java.util.ArrayList;

/* List 인터페이스 -ArrayList(상속받는 클래스)
 * 1.여러가지 자료형의 Data를 모두 저장할 수 있다.
 *  ex) int, double, char, boolean, String...
 * 2.입력한 순서대로 출력된다. (index번호 순으로 저장된다.)
 * 3.중복된 데이터 저장 가능
 * 4. 동적인 저장 구조를 이용할 수 있다.(add(), remove())
 */
public class ArrayList1_add {
	public static void main(String[] args) {
		//업캐스팅(상속해준 메서드만 사용가능하다.)
		//List list = new ArrayList();
		ArrayList list = new ArrayList();
		//자료 추가	E:오브젝트 어떤 자료형이든 올 수 있다.
		list.add("하나");
		list.add(2);//list.add(Integer.valueOf(2));
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add('A');
//		System.out.println(list.isEmpty());
		
		System.out.print(list);//list의 모든 데이터 출력
		System.out.println(list.toString());
		
		//size() 데이터 개수 구하는 메서드
		System.out.println("데이터의 갯수 = "+ list.size());
		
		//get(index) :해당 인덱스의 데이터 가져오는 메서드
		//get(3): 0부터 시작, index =3인 데이터 출력해라
		System.out.println("list.get(3) =" +list.get(3));
	}

}
