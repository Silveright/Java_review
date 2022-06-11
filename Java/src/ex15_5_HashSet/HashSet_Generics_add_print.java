package ex15_5_HashSet;
/*
 * Set �������̽�
 * -HashSet(��ӹ޴� Ŭ����): ����������HashMap�� �̿��ؼ� �����������
 * 	HashSet�̶� �̸��� �ؽ��� �̿��� �����߱� ������ �ٿ��� ��
 * -TreeSet�� ���� �˻� Ʈ��(binary search tree)��� �ڷᱸ���� ���·�
 * 	�����͸� �����ϴ� �÷��� Ŭ�����̴�. �����̵ȴ�.
 * 1.�������� �ڷ���(�⺻�ڷ���, ������ ���)�� data�� ��� ������ �� �ִ�.
 * 	ex)int, double, boolean, char, String etc...
 * 2.���� ���� ��, ����Ѵ�.
 * 3. �ߺ��� data�� �������� ���Ѵ�.
 *    ex) �ζ� ��ȣ 6���� �ߺ� ���� �ʰ� �ϴ� ���α׷����� �̿�
 */
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Generics_add_print {

	public static void main(String[] args) {
		//HashSet ��ü ����
		HashSet<String> set = new HashSet<String>();
		//������ ����
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		System.out.println("����� �������� �� = " + set.size());
		
		//set ��ü�� �����ϰ� �ִ� ������ ��ü ���
		System.out.println(set);//[īǪġ��, �ڹ�, ����������] �ߺ� ���ŵ�
		
		//iterator(): set�� �ִ� �����͸� ��� �����´�.
		Iterator<String> iterator = set.iterator();
		//Iterator ��ü�� �̿��� list�� �ִ� �����͸� ������� ������ ���(�������� �о���� �ʿ䰡 ������)
		while(iterator.hasNext()) {//���� ��ġ���� ���� �����Ͱ� �ִ��� Ȯ���ϴ� �޼���
			String str = iterator.next();//���� �����͸� �������� �޼���
			System.out.println(str);
		}
	}

}
