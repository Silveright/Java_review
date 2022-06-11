package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.List;

/*1.지네릭스(Generics) jdk 1.5에서 처음 도입
 * 	다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능
 * 
 * 2. 클래스 옆에 꺽쇠<> 기호를 이용해서 만든다.
 *  1) <> 안에 특정 자료형(Wrapper class, String, 사용자 정의 클래스형-참조형)을 넣어주면 된다.
 *  2) API 형식 표기
 *     Class ArrayList<E> :E의 ArrayList라고 읽는다.
 *     -ArrayList: 원시 타입(raw type)
 * 	   - E(타입 매개 변수): 기호의 종류만 다를 뿐 임의의 참조형 타입을 의미
 * 		
 * 			변수:의미
 * 			E: 원소(Element)
 * 			K: key
 * 			T: Type
 * 			V: Value
 * 
 * -사용 예) 
 * 	List<String> 			list = new ArrayList<String>();
 * 	ArrayList<String>		list = new ArrayList<String>();
 * 	ArrayList<Integer> 		list = new ArrayList<Integer>();
 * 	ArrayList<Double> 		list = new ArrayList<Double>();
 * 	ArrayList<MemberInput>	list = new ArrayList<MemberInput>();
 * 
 * 
 */


public class ArrayList2_Generics {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//구현체 생성자가 같이 있지 않고 업캐스팅한 상태 
		list.add("hana");
//		list.add(2);
//The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		
		System.out.println("객체명으로 출력");
		System.out.println(list);
	
	}

}
