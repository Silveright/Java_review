package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest1_contains3 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("봄"); 
		list1.add("여름");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("봄");//0   제거됨
		list2.add("봄");//1   >>0
		list2.add("가을");//2  >>1
		list2.add("겨울");//3  >>2
		
		System.out.println(list1);
		System.out.println(list2);
//		//list2에서 list1과 공통되는 요소들을 찾아 삭제
		for(int i = 0; i < list2.size(); i++) {
			//지정된 객체(list2.get(i))가 list1에 포함되어있는지 확인
			if(list1.contains(list2.get(i))) {
				list2.remove(i); //봄이 하나 남게 된다.
				
//				list2.remove(i--);//i값을 보존한다.
// 				list2.remove(i);//위 코드를 두 줄로 나누어 씀 
//				i--;
			}
		}//앞에서부터 접근해서 제거할 경우 
		//삭제된 데이터 뒤의 배열에 저장된 객체들이 순차적으로 삭제된 곳의 배열로 옮겨져야 되기 때문에
		//다루는 데이터의 수가 많을 수록 작업시간이 길어진다.
		System.out.println(list1);
        System.out.println(list2);
	}

}
