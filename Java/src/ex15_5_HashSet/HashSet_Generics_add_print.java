package ex15_5_HashSet;
/*
 * Set 인터페이스
 * -HashSet(상속받는 클래스): 내부적으로HashMap을 이용해서 만들어졌으며
 * 	HashSet이란 이름은 해싱을 이용해 구현했기 때문에 붙여진 것
 * -TreeSet은 이진 검색 트리(binary search tree)라는 자료구조의 형태로
 * 	데이터를 저장하는 컬렉션 클래스이다. 정렬이된다.
 * 1.여러가지 자료형(기본자료형, 참조형 모두)의 data를 모두 저장할 수 있다.
 * 	ex)int, double, boolean, char, String etc...
 * 2.순서 없이 입, 출력한다.
 * 3. 중복된 data를 저장하지 못한다.
 *    ex) 로또 번호 6개를 중복 되지 않게 하는 프로그램에서 이용
 */
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Generics_add_print {

	public static void main(String[] args) {
		//HashSet 객체 생성
		HashSet<String> set = new HashSet<String>();
		//데이터 저장
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수 = " + set.size());
		
		//set 객체가 보관하고 있는 데이터 객체 출력
		System.out.println(set);//[카푸치노, 자바, 에스프레소] 중복 제거됨
		
		//iterator(): set에 있는 데이터를 모두 가져온다.
		Iterator<String> iterator = set.iterator();
		//Iterator 객체를 이용해 list에 있는 데이터를 순서대로 가져와 출력(차례차례 읽어들일 필요가 없어짐)
		while(iterator.hasNext()) {//현재 위치에서 다음 데이터가 있는지 확인하는 메서드
			String str = iterator.next();//다음 데이터를 가져오는 메서드
			System.out.println(str);
		}
	}

}
