package ex17_10_syn_format1;
//���� ���� Ŭ����
public class Account { 
	private String accountNo;	//���¹�ȣ
	private String ownerName;	//�������̸�
	private int balance;		//�ܾ�
//Ŭ���� �� ���콺 ��Ŭ��>source>generate getters and setters
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

	void deposit (int amount) {//�����Ѵ�.
		balance+= amount;
	}
	
	int withdraw (int amount){//�����Ѵ�.
		if (balance<amount)
			return 0;
		balance -= amount;
		return amount;
	}
}
