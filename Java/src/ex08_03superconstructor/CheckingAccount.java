//생성자가 있는 슈퍼클래스를 상속받은 경우
package ex08_03superconstructor;
public class CheckingAccount extends Account {
	String cardNo;
	//자바 컴파일러가 컴파일 시 서브 클래스의 생성자 첫번째 명령문이 
	//슈퍼 클래스의 생성자 호출문이 아니면
	//자동적으로 슈퍼 클래스의 no-arg constructor 호출문을 추가한다.
	//하지만 슈퍼클래스에는 no-arg constructor가 없어서 컴파일 에러발생
	CheckingAccount(String accountNo, String ownerName,
					int balance, String cardNo) {
	//파라미터 3개의 슈퍼클래스 생성자 호출문은 반드시 생성자의 첫번째 명령문이어야 한다.	
		super(accountNo, ownerName, balance); //Account(){}
	this.cardNo = cardNo;
}
	
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) ||balance<amount)
			throw new Exception("지불이 불가능 합니다");
		return super.withdraw(amount); //부모클래스의 withdraw를 사용하겠다 (명시적으로)//this도 가능
	} 
}
