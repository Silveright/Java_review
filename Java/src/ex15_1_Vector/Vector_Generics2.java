package ex15_1_Vector;

import java.util.Vector;

/*
 Vector Ŭ����- ArrayList�� ������
 			  ArrayList�� ���� ���, �� �߿��� ArrayList�� �� ���� ���
 	1.�������� �ڷ����� Data�� ��� ������ �� �ִ�.
 	ex) int, double, char, boolean, String etc
 	2.�����ִ� ��.��� ó��(index��ȣ ������ �����)
 	3.�ߺ��� Data�� ���� �� �� �ִ�.
 	4. ����� ��� �پ��ϴ�.(���������� ��°���)
 	5. ������ ����ȭ�� �ϱ⿡ ���� ������ ó�������� 
 		ArrayList�� LinkedList���� ������ ��������.
 		����) ����ȭ�� �����忡�������ڿ��� �۾��� ��ġ�� �� ������ �ٸ� �����忡�� �����ڿ��� ���� ���� ���ϰ� ����ϴ� ��
 */
public class Vector_Generics2 {

	public static void main(String[] args) {
		Vector vec = new Vector();
		vec.add("Apple");
		vec.add("banana");
		vec.add("orange");
		print(vec);
		
		vec.add(2,"Ű��");
		print(vec);
		
		vec.add(0,"������");
		print(vec);

		vec.remove(1);
		print(vec);

		vec.remove("Ű��");
		print(vec);
	}

	private static void print(Vector vec) {
		System.out.println("============");
		for (int cnt =0; cnt< vec.size(); cnt ++) {
			//get(index)�޼��� ����� index��ġ�� �ڷḦ �����´�.
			String str = (String) vec.get(cnt);//Generic<> ������� ������ casting ����(�ڷ����� ������)
			System.out.println(str);
		}
		
	}

}