package ex08_03superconstructor;
//모든 클래스의 조상은 Object 클래스
//생성자가 있는 Account클래스
//은행 계좌클래스
public class Account { //컴파일러가 extends Object를 추가해줌
	String accountNo;	//계좌번호
	String ownerName;	//예금주이름
	int balance;		//잔액
	
//	Account(){}
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	void deposit (int amount) {//예금한다.
		balance+= amount;
	}
	
	int withdraw (int amount) throws Exception {//인출한다.
		if (balance<amount)
			throw new Exception("잔액 부족");
		balance -= amount;
		return amount;
	}
}
