package ex13_6_clone;

public class ObjectExample_rectangle {

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle(10,30);
		Rectangle obj2 = (Rectangle)obj1.clone();//The method clone() from the type Object is not visible
	}
}
