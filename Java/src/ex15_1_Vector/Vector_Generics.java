package ex15_1_Vector;

import java.util.Vector;

/*
 Vector 클래스- ArrayList의 구버전
 			  ArrayList와 거의 비슷, 둘 중에서 ArrayList를 더 많이 사용
 	1.여러가지 자료형의 Data를 모두 저장할 수 있다.
 	ex) int, double, char, boolean, String etc
 	2.순서있는 입.출력 처리(index번호 순으로 저장됨)
 	3.중복된 Data를 저장 할 수 있다.
 	4. 입출력 방법 다양하다.(열거형으로 출력가능)
 	5. 무조건 동기화를 하기에 단일 스레드 처리에서는 
 		ArrayList나 LinkedList보다 성능이 떨어진다.
 		참고) 동기화란 스레드에서공유자원에 작업을 마치기 전 까지는 다른 스레드에서 공유자원에 접근 하지 못하게 약속하는 것
 */
public class Vector_Generics {

	public static void main(String[] args) {
		Vector<String>vec = new Vector<String>();
		vec.add("Apple");
		vec.add("banana");
		vec.add("orange");
		print(vec);
		
		vec.add(2,"키위");
		print(vec);
		
		vec.add(0,"오렌지");
		print(vec);

		vec.remove(1);
		print(vec);

		vec.remove("키위");
		print(vec);
	}

	private static void print(Vector<String> vec) {
		System.out.println("============");
		for (int cnt =0; cnt< vec.size(); cnt ++) {
			//get(index)메서드 사용해 index위치의 자료를 가져온다.
			String str = vec.get(cnt);
			System.out.println(str);
		}
		
	}

}
