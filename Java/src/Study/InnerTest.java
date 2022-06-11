package Study;
class AA{
	int i = 200;

	B b = new B();
	class BB{
		void method() {
//			AA a = new AA();
//			System.out.println(a.i);
			System.out.println(i);
		}
	}
}
//class C{//내부클래스 사용 불가
//	BB b = new BB();
//}

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BB b = new BB();
//		b.method();
	}

}
