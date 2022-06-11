package ex08_8_abstract_class01;

public class InheritanceEx6 {

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("생일축하합니다", "고객센터", "admin@khshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		//추상 메서드를 구현한 메서드를 호출
		obj1.sendMessage("hoho@naver");
		
		SMSSender obj2 = new SMSSender("생일축하합니다", "고객센터", "02-123-5678", "10% 할인쿠폰이 발행되었습니다.");
		obj2.sendMessage("010-1234-5678");
	}

}
