package ex15_1_ArrayList;
import java.util.ArrayList;

/* List �������̽� -ArrayList(��ӹ޴� Ŭ����)
 * 1.�������� �ڷ����� Data�� ��� ������ �� �ִ�.
 *  ex) int, double, char, boolean, String...
 * 2.�Է��� ������� ��µȴ�. (index��ȣ ������ ����ȴ�.)
 * 3.�ߺ��� ������ ���� ����
 * 4. ������ ���� ������ �̿��� �� �ִ�.(add(), remove())
 */
public class ArrayList1_add {
	public static void main(String[] args) {
		//��ĳ����(������� �޼��常 ��밡���ϴ�.)
		//List list = new ArrayList();
		ArrayList list = new ArrayList();
		//�ڷ� �߰�	E:������Ʈ � �ڷ����̵� �� �� �ִ�.
		list.add("�ϳ�");
		list.add(2);//list.add(Integer.valueOf(2));
		list.add(false);
		list.add(3.42);
		list.add("��");
		list.add("five");
		list.add('A');
//		System.out.println(list.isEmpty());
		
		System.out.print(list);//list�� ��� ������ ���
		System.out.println(list.toString());
		
		//size() ������ ���� ���ϴ� �޼���
		System.out.println("�������� ���� = "+ list.size());
		
		//get(index) :�ش� �ε����� ������ �������� �޼���
		//get(3): 0���� ����, index =3�� ������ ����ض�
		System.out.println("list.get(3) =" +list.get(3));
	}

}
