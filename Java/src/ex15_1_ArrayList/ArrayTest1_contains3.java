package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest1_contains3 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("��"); 
		list1.add("����");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("��");//0   ���ŵ�
		list2.add("��");//1   >>0
		list2.add("����");//2  >>1
		list2.add("�ܿ�");//3  >>2
		
		System.out.println(list1);
		System.out.println(list2);
//		//list2���� list1�� ����Ǵ� ��ҵ��� ã�� ����
		for(int i = 0; i < list2.size(); i++) {
			//������ ��ü(list2.get(i))�� list1�� ���ԵǾ��ִ��� Ȯ��
			if(list1.contains(list2.get(i))) {
				list2.remove(i); //���� �ϳ� ���� �ȴ�.
				
//				list2.remove(i--);//i���� �����Ѵ�.
// 				list2.remove(i);//�� �ڵ带 �� �ٷ� ������ �� 
//				i--;
			}
		}//�տ������� �����ؼ� ������ ��� 
		//������ ������ ���� �迭�� ����� ��ü���� ���������� ������ ���� �迭�� �Ű����� �Ǳ� ������
		//�ٷ�� �������� ���� ���� ���� �۾��ð��� �������.
		System.out.println(list1);
        System.out.println(list2);
	}

}
