package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList4_add_set_remove {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//list에 3개의 데이터 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		pArrayList(list);
		
		//list에 2개의 데이터 삽입
		list.add(2, "키위");//인데스 2 위치에 삽입
		list.add(4, "키위");//인덱스 4 위치에 삽입
		pArrayList(list);
		
		//인덱스 0 위치에 데이터를 "오렌지"로 바꿈
		list.set(0, "오렌지");
		pArrayList(list);
		
		//인덱스 1 위치에 있는 데이터를 삭제
		list.remove(1);
		pArrayList(list);
		
		//list에서 "키위" 데이터를 찾아 삭제함 처음 만나는 키위만 지워짐
		list.remove("키위");
		pArrayList(list);
		
	}

	 static void pArrayList(ArrayList<String> list) {
		 for (int cnt =0; cnt< list.size(); cnt ++) {
				//get(index)메서드 사용해 index위치의 자료를 가져온다.
				String str = list.get(cnt);
				System.out.println("index=" + cnt+" 데이터="+ str);
			}
		 System.out.println("==================");
		 
//		 for(String str : list) {
//				System.out.println( str);
//			}
//		 System.out.println("==========");
	}

}
