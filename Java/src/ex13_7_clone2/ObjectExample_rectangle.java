
package ex13_7_clone2;
public class ObjectExample_rectangle {

	public static void main(String[] args) {
		//��ü ����
		Rectangle obj1 = new Rectangle(10,30);
		Rectangle obj2 = (Rectangle)obj1.clone();
		//clone �޼���� ��ü ����
		System.out.println("[obj1] " + obj1);
		System.out.println("[obj2] " + obj2);
		
		//���� ��ü�� ��ü ��ü�� �� ���
		obj1.height = 100; obj1.width =200;
		System.out.println("[obj1] " + obj1);
		System.out.println("[obj2] " + obj2);
	}

}
