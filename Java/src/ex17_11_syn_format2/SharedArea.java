package ex17_11_syn_format2;

class SharedArea {
	private Account account1;//�̸����� ����
	private Account account2;//�������� ����
	
	SharedArea(Account a1, Account a2){
		this.account1 = a1;
		this.account2 = a2;
	}
	
	//����ȭ �޼���
	synchronized void transfer() {
		account1.withdraw(1000000);
		account2.deposit(1000000);
	}
	
	//����ȭ �޼���
	synchronized  int getTotal() {//�ܾ� �հ踦 ���Ѵ�.
		return account1.getBalance() + account2.getBalance();
	}
	
	public Account getAccount1() {
		return account1;
	}
	
	public void setAccount1(Account account1) {
		this.account1 = account1;
	}
	
	public Account getAccount2() {
		return account2;
	}
	
	public void setAccount2(Account account2) {
		this.account2 = account2;
	}
	
}

