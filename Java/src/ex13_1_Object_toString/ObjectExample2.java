/*ObjectŬ������ ���ǵ� tostring() �� �ν��Ͻ��� ���� ������
 * ���ڿ� �� ������ �������� ������ ��
 * Ŭ���� �ۼ� �� toString()�� �������̵� ���� ������ �Ʒ��� ���� ���ǵ� ������ �״�� ���ȴ�
 * 
 * public String tostring() {
 *  		return getClass().getName() + "@" + Integer.toHexString(hasgCode);
 *  		}
 * -getClass() �޼���� hashCode()�޼��� ���� ObjectŬ������ �޼���� ȣ���� �� �ִ�
 * �ؽ� �ڵ�� �ν��Ͻ��� �ּҿ� ���õ� ��
 * 
 * -hashCode() �޼���� �ؽ� ����� ���Ǵ� �ؽ��Լ��� ������ ���̴�
 * �ؽ��� ������ ���� ��� �� �ϳ�
 */

package ex13_1_Object_toString;
public class ObjectExample2 {
	public static void main(String[] args) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1.toString());//	String java.lang.Object.toString()
		//System.out.print() �� System.out.println()�޼ҵ忡 
		//���ڿ��� �ƴ� ��ü�� �Ѱ��ָ� toString()�޼��尡 ȣ��ȴ�.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
		System.out.println(obj1.radius);
	}

}
