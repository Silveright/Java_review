package ex13_2;

public class ObjectExample1 {
	public static void main(String args[]) {
		GoodStock obj = new GoodStock("73527", 200);
		
		String str = obj.toString();
		System.out.println(str);
	}
}
