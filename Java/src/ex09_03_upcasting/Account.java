//final 키워드를 이용한 메서드 오버라이딩 금지
//상속 받은 withdraw메서드가 final 메소드라 오버라이딩 불가
package ex09_03_upcasting;

 class Account { 
	String accountNo;	//계좌번호
	String ownerName;	//예금주이름
	int balance;		//잔액

	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit (int amount) {//예금한다.
		balance+= amount;
	}
	
	final int withdraw (int amount) throws Exception {//인출한다.
		if (balance<amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}
}
