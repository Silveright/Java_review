/*
 * LinkedList ��뿹
 * LinkedList ArrayList ������
 * -������ �߰� �Ǵ� ������ ArrayList���� �ӵ��� ������.
 *  ArrayList�� ��� ���ʴ�� �����͸� �߰��ϰ� �������������� �����͸� �����ϴ� ���� LinkedList���� ������.
 *  ������ �߰��� �����͸� �߰��Ϸ��� ���ڸ��� ����� ���� �ٸ� �����͸� �����ؼ� �̵��ؾ� �ϰ�
 *  ������ ��쿡�� �����͸� ���ġ �ؾ� ������
 *  LinkedList�� ��� �� ��Ұ� ���Ḹ �������ָ� �Ǳ� ������ ó���ӵ��� ����� ������.
 *  -�˻��� ArrayList�� ���������� �޸𸮻� �����ϱ� ������ ã�µ� ��������
 *  �ҿ��������� ��ġ�� LinkedList�� ó������ ���ʴ�� ���󰡾� ���ϴ� ���� ��� �˻��ð��� ������.
 */
package ex15_1_LinkedList;

import java.util.LinkedList;

public class LinkedList1_add {

	public static void main(String[] args) {
		// LinkedList ��ü ����
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		int num = list.size();
		for ( int cnt = 0; cnt<num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
				
	}

}
