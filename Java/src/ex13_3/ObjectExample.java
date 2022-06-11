/* equals �޼��� ��뿹) �Ȱ��� ���� ���� �� ���� ��ü�� ����
 
 *Object Ŭ������ equals()�޼���
 *�Ű������� ��ü�� ���������� �޾� ���Ͽ� �� ����� boolean������ �˷��ִ� ������ �Ѵ�.
 *
 *equals �޼����� ���� ����:
 *public boolean equals(Object arg0) {
 *				return this==arg0;
 *		} �� ��ü�� ���� �ٸ��� ���������� ������ �Ǵ��Ѵ�.
 *		���� �ٸ� �� ��ü�� equals�޼���� ���ϸ� �׻� false����� ��� �ȴ�.
 *
 */

package ex13_3;

import java.util.GregorianCalendar;

public class ObjectExample {

	public static void main(String[] args) {
		GregorianCalendar obj1 = new GregorianCalendar(2021,5,1);
		GregorianCalendar obj2 = new GregorianCalendar(2021,5,1);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.toString());//�������̵� �Ǿ� �ִ�String java.util.Calendar.toString()
		System.out.println(obj2.toString());
		
		if(obj1.equals(obj2))//������� �ٸ�>> �������̵� �Ǿ� �ִ�.boolean java.util.GregorianCalendar.equals(Object obj)
		System.out.println("obj1.equals(obj2):����");
		else
		System.out.println("obj1.equals(obj2):�ٸ�");
		
		if(obj1 == obj2)
		System.out.println("obj1==obj2 ����");
		else
		System.out.println("obj1==obj2 �ٸ�");
		
		
	}

}
