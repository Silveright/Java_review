package ex09_07_instanceof;

class CheckingAccount extends Account {
	String cardNo;
	//생성자의 첫 줄에서 조상 클래스의 생성자를 호출하는데 자손 클래스의 멤버가
	//부모 클래스의 멤버를 사용할 수 있으므로 부모의 멤버들이 먼저 초기화되어 있어야 한다
	CheckingAccount(String accountNo, String ownerName,
					int balance, String cardNo) {
		
	super(accountNo, ownerName, balance); //Account(){}
	this.cardNo = cardNo;
}
	
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) ||balance<amount)
			throw new Exception("지불이 불가능 합니다");
		return super.withdraw(amount); //부모클래스의 withdraw를 사용하겠다 (명시적으로)//this도 가능

	} 
}
