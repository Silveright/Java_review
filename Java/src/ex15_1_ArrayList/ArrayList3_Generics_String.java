package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList3_Generics_String {

	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		//list에 3개의 데이터 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		
		int num = list.size();//list 에 있는 데이터 수 구하는 메서드
		
		//list에 있는 데이터 수만큼 반복해 데이터를 가져와 출력
		for (int cnt =0; cnt< num; cnt ++) {
			//get(index)메서드 사용해 index위치의 자료를 가져온다.
			String str = list.get(cnt);
			System.out.println(str);
		}
		
		System.out.println("===향상된 for문===");
		for(String str : list) {
			System.out.println( str);
		}
	 System.out.println("==========");
		
	}

}
