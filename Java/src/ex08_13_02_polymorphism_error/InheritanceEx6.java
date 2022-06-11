package ex08_13_02_polymorphism_error;

public class InheritanceEx6 {

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("생일축하합니다", "고객센터", 
				"admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		//추상 메서드를 구현한 메서드를 호출
		
		SMSSender obj2 = new SMSSender("생일축하합니다", "고객센터", 
				"02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
		//서브 클래스 객체 obj1, obj2를 가지고 메서드 호출
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-000-0000");
	
	}
//MessageSender obj: 슈퍼 클래스 타입의 파라미터
//	MessageSender 클래스에서 sendMessage메서드를 주석처리할 경우 에러 발생한다.
//	자바 컴파일러는 변수의 타입으로 그 메서드가 있는지 없는지 체크한다.
//	MessageSender에 sendMessage()메서드가 존재하지 않아
//	The metod sendMessage(String) is undefined for the type에러 발생
//	자바 가상 기계는 객체의메서드를 호출할 때 변수 타입에 상관없이 객체가 속하는 클래스의 메서드를 호출한다.
	 static void send(MessageSender obj, String recipient) {
		//어느 클래스의 sendMessage메서드가 호출될까요
		 //EMailSender 또는 SMSSender
		 obj.sendMessage(recipient);
		
	}

}
