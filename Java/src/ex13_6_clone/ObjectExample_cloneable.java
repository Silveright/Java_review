/*
 * clone()�޼���� ��ü�� �����ϴ� ����� �Ѵ�.
 * ��, �Ȱ��� ���� ���� ��ü�� �ϳ� �� �����.
 * ���� ������ Ŭ������ ���ؼ��� ȣ���� �� �ִ�.
 * ���� ������ Ŭ������ Cloneable �������̽� ���� ����. implements Cloneable
 * 
 * Cloneable �������̽��� ������ GregorianCalendar Ŭ������ ����
 * clone()�޼��� ȣ���ϴ� ����
 */

package ex13_6_clone;
import java.util.GregorianCalendar;
public class ObjectExample_cloneable {

	public static void main(String[] args) {
		//��ü�� �����Ѵ�.
		GregorianCalendar obj1 = new GregorianCalendar(2020,11,1);
		//clone�޼���� ��ü�� �����Ѵ�.
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)imsi;
		
		//GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();
		
		//%tF: ���� ���ڴ� ��¥�� yyyy-MM-dd �������� �����ϴ� ������ �Ѵ�.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2021, 5, 1);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
	}
}
