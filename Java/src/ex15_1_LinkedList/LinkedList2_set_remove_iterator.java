package ex15_1_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2_set_remove_iterator {

	public static void main(String[] args) {
		//LinkedList ��ü ����
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2,"Ű��");
		pLinkedList(list);
		
		list.set(0, "������");
		pLinkedList(list);
		
		list.remove(1);
		pLinkedList(list);

		list.remove("Ű��");
		pLinkedList(list);
	}

	static void pLinkedList(LinkedList<String> list) {
		System.out.println("===================");
		//Iterator()�޼��带 ȣ���Ͽ� Iterator��ü�� ��´�.
		Iterator<String> iterator = list.iterator();
		
		//Iterator ��ü�� �̿��� list�� �ִ� �����͸� ������� ������ ���(�������� �о���� �ʿ䰡 ������)
		while(iterator.hasNext()) {//���� ��ġ���� ���� �����Ͱ� �ִ��� Ȯ���ϴ� �޼���
			String str = iterator.next();//���� �����͸� �������� �޼���
			System.out.println(str);
		}
	}
}
