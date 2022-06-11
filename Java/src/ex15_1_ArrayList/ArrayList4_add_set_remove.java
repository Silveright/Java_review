package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList4_add_set_remove {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//list�� 3���� ������ �߰�
		list.add("����");
		list.add("����");
		list.add("������");
		pArrayList(list);
		
		//list�� 2���� ������ ����
		list.add(2, "Ű��");//�ε��� 2 ��ġ�� ����
		list.add(4, "Ű��");//�ε��� 4 ��ġ�� ����
		pArrayList(list);
		
		//�ε��� 0 ��ġ�� �����͸� "������"�� �ٲ�
		list.set(0, "������");
		pArrayList(list);
		
		//�ε��� 1 ��ġ�� �ִ� �����͸� ����
		list.remove(1);
		pArrayList(list);
		
		//list���� "Ű��" �����͸� ã�� ������ ó�� ������ Ű���� ������
		list.remove("Ű��");
		pArrayList(list);
		
	}

	 static void pArrayList(ArrayList<String> list) {
		 for (int cnt =0; cnt< list.size(); cnt ++) {
				//get(index)�޼��� ����� index��ġ�� �ڷḦ �����´�.
				String str = list.get(cnt);
				System.out.println("index=" + cnt+" ������="+ str);
			}
		 System.out.println("==================");
		 
//		 for(String str : list) {
//				System.out.println( str);
//			}
//		 System.out.println("==========");
	}

}
