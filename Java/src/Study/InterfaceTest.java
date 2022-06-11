package Study;
class A {
	public void method(B b) { //B의 메서드를 호출하는 메서드 매개변수 참조타입 B
		b.method();
	}
}

class B {
	public void method( ) {
		System.out.println("B클래스의 메서드");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		 A a = new A();
		 a.method(new B()); //A가  B를 사용
		 B b = new B();
		 a.method(b);
	}

}
