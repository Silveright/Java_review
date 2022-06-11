package ex13_1_Object_toString;
public class ObjectExample3 {
	public static void main(String[] args) {
		Circle2 obj1 = new Circle2(5);
		Circle2 obj2 = new Circle2(15);
		
		System.out.println(obj1.toString());//		String java.lang.Object.toString()
		//System.out.print() 나 System.out.println()메소드에 
		//문자열이 아닌 객체를 넘겨주면 toString()메서드가 호출된다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}
}
