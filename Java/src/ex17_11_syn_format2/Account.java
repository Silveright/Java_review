package ex17_11_syn_format2;
//은행 계좌 클래스
public class Account { 
	private String accountNo;	//계좌번호
	private String ownerName;	//예금주이름
	private int balance;		//잔액
//클래스 안 마우스 우클릭>source>generate getters and setters
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	void deposit (int amount) {//예금한다.
		balance+= amount;
	}
	
	int withdraw (int amount){//인출한다.
		if (balance<amount)
			return 0;
		balance -= amount;
		return amount;
	}
}
