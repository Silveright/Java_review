package ex13_1_Object_toString;
public class ObjectExample3 {
	public static void main(String[] args) {
		Circle2 obj1 = new Circle2(5);
		Circle2 obj2 = new Circle2(15);
		
		System.out.println(obj1.toString());//		String java.lang.Object.toString()
		//System.out.print() �� System.out.println()�޼ҵ忡 
		//���ڿ��� �ƴ� ��ü�� �Ѱ��ָ� toString()�޼��尡 ȣ��ȴ�.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}
}
