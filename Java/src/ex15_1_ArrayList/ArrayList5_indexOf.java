package ex15_1_ArrayList;
/*
 * ArrayList에 있는 데이터 검색하는 예
 * -indexOf(data): 인자와 같은 값을 갖는 첫 번째 데이터를 찾아 그 위치의 인덱스 리턴
 * -lastIndexOf(data): 인자와 같은 값을 마지막붙 순서대로 데이터를 찾아 그 위치의 인덱스 리턴
 * -인자와 같은 값이 없으면 -1 리턴
 */
import java.util.ArrayList;

public class ArrayList5_indexOf {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();//앞부분에서 자료형을 선언하면 뒷부분은 생략 가능
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		
		int index1 = list.indexOf("사과");
		int index2 = list.lastIndexOf("사과");
		System.out.println("첫번째 사과: " +index1);
		System.out.println("마지막 사과: " +index2);
	}

}
