package ex07_object;
/*
 다른 클래스에 있는 필드나 메서드를 사용하려면 먼저 객체를 생성해야 한다.
 생성된 객체 멤버에 접근하려면 마침표 연산자를 사용한다
 예 참조변수. 핃드, 참조변수.메서드()
*/
public class Saram_make5 {
	
	public static void main(String[] args) {
		
		Saram5 s = new Saram5( "수지", 47.4);
//		s.name="수지";
//		s.w=47.4;
		s.ki=168;
		s.age=27;
		s.eat();
		s.walk();
		
		Saram5 s2= new Saram5( 65, "박보검");
//		s2.name = "박보검";
		s2.age=24;
//		s2.w=65;
		s2.ki=182;
		s2.eat();
		s2.sesu();
		s2.walk();
	
	}
}
