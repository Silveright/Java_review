package Study;
class A {
	public void method(B b) { //B�� �޼��带 ȣ���ϴ� �޼��� �Ű����� ����Ÿ�� B
		b.method();
	}
}

class B {
	public void method( ) {
		System.out.println("BŬ������ �޼���");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		 A a = new A();
		 a.method(new B()); //A��  B�� ���
		 B b = new B();
		 a.method(b);
	}

}
