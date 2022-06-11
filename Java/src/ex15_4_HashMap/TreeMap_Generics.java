package ex15_4_HashMap;
/*
 * HashMap Generic 사용 예
 * Map 인터페이스- HashMap, Hashtable(상속 받는 클래스)
 * 1. 여러가지 자료형의 Data를 모두 저장
 * 		ex) int, double, char, boolean, String etc
 * 2. Data를 저장할 때 Key, Value 를 동시에 저장
 * 
 * HashMap과 HashSet 등에 사용되는 hashing에 대한 설명
 * 	해싱이란 해시함수를 이용해 데이터를 해시 테이블에 저장하고 검색하는 기법을 말한다.
 * 	해시테이블이란 여러개의 통(bucket)을 만들어 두고 키 값을 이용해 데이터를 넣을 통 번호를 계산하는 데이터 구조
 * 	해시 함수는 키 값을 받아 해쉬 테이블의 인덱스 키 값을 구하는 함수
 * 	해시 함수는 데이터가 저장되어 있는 곳을 알려주기 때문에 다량의 데이터 중 원하는 데이터를 빠르게 찾을 수 있다.
 * 	해싱을 구현한 컬렉션 클래스로는 HashSet, HashMap, Hashtable 등이 있다.
 *  Object 클래스에 정의된 hashCode()를 해시함수로 사용한다.
 */

import java.util.Set;
import java.util.TreeMap;
/*
 * TreeMap
 * 키와 값의 쌍으로 이루어진 데이터를 키로 정렬해서 저장
 * 검색과 정렬에 적합한 컬렉션 클래스
 */
public class TreeMap_Generics {

	public static void main(String[] args) {
		//HashMap 객체 생성 방법 두가지
		// Map<String, String> tm = new TreeMap(); 방법1: 업캐스팅
		TreeMap<String, String> tm = new TreeMap<String, String>();//방법2: 구현 클래스를 통한 객체 생성
		//Key, Value 쌍을 삽입
		//Map의 put()을 이용해 (Key,Value) 쌍으로 자료 저장
		tm.put("woman", "재미있니");
		tm.put("man", "좋은 하루");
		tm.put("age", new String("10"));
		tm.put("city", "Seoul");
		tm.put("city", "Busan");//나중에 넣은 데이터가 선택된다.
		
		//알파벳순으로 정렬되어 출력됨
		//출력방법 1. 해당 객체명으로 출력
		System.out.println(tm);
		//{woman = 재미있니, city= Busan, man=좋은하루,age = 10}
		//{age = 10, city= Seoul, man=좋은하루, woman = 재미있니}
		
		//출력방법 2. Key값만 출력
		System.out.println(tm.keySet());
		//[woman,city,man,age]
		//[age,city,man,woman]
		
		//출력 방법 3. Value값만 출력
		System.out.println(tm.values());
		
		//출력 방법 4.
		//get(Key): Key에 해당하는 Value를 출력 - 가장많이 사용
		System.out.println(tm.get("woman"));//재미있니
		System.out.println(tm.get("city"));//Busan

		//출력 방법 5
		System.out.println("=========================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	}
}
