package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList3_Generics_String {

	public static void main(String[] args) {
		//ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<String>();
		//list�� 3���� ������ �߰�
		list.add("����");
		list.add("����");
		list.add("������");
		
		int num = list.size();//list �� �ִ� ������ �� ���ϴ� �޼���
		
		//list�� �ִ� ������ ����ŭ �ݺ��� �����͸� ������ ���
		for (int cnt =0; cnt< num; cnt ++) {
			//get(index)�޼��� ����� index��ġ�� �ڷḦ �����´�.
			String str = list.get(cnt);
			System.out.println(str);
		}
		
		System.out.println("===���� for��===");
		for(String str : list) {
			System.out.println( str);
		}
	 System.out.println("==========");
		
	}

}
