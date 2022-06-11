package ex08_01inheritance;
//은행 계좌 클래스를 상속받는 직불 계좌 클래스
//은행 계좌 클래스(Account) 슈퍼 클래스(상속을 해주는 클래스)
//직불 계좌 클래스(CheckingAccount) 서브 클래스(상속을 받는 클래스)
public class CheckingAccount extends Account {
	String cardNo;//직불 카드 번호
//	CheckingAccount(){
//		super();
//		}
	//balance필드와 withdraw()메서드는 Account 클래스로부터 상속받아 사용 가능하다.
	//따라서 이 클래스 안에 선언되어 있는 것처럼 사용하고 있다.
	
	//직불카드 사용액을 지불하는 메서드
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) ||balance<amount)
			throw new Exception("지불이 불가능 합니다");
		
		return withdraw(amount);

	} 
}
