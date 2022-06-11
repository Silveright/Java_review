package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.List;

/*1.���׸���(Generics) jdk 1.5���� ó�� ����
 * 	�پ��� Ÿ���� ��ü���� �ٷ�� �޼��峪 �÷��� Ŭ������ ������ ���� Ÿ��üũ�� ���ִ� ���
 * 
 * 2. Ŭ���� ���� ����<> ��ȣ�� �̿��ؼ� �����.
 *  1) <> �ȿ� Ư�� �ڷ���(Wrapper class, String, ����� ���� Ŭ������-������)�� �־��ָ� �ȴ�.
 *  2) API ���� ǥ��
 *     Class ArrayList<E> :E�� ArrayList��� �д´�.
 *     -ArrayList: ���� Ÿ��(raw type)
 * 	   - E(Ÿ�� �Ű� ����): ��ȣ�� ������ �ٸ� �� ������ ������ Ÿ���� �ǹ�
 * 		
 * 			����:�ǹ�
 * 			E: ����(Element)
 * 			K: key
 * 			T: Type
 * 			V: Value
 * 
 * -��� ��) 
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
		//����ü �����ڰ� ���� ���� �ʰ� ��ĳ������ ���� 
		list.add("hana");
//		list.add(2);
//The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		
		System.out.println("��ü������ ���");
		System.out.println(list);
	
	}

}
