//final Ű���带 �̿��� �޼��� �������̵� ����
//��� ���� withdraw�޼��尡 final �޼ҵ�� �������̵� �Ұ�
package ex09_03_upcasting;

 class Account { 
	String accountNo;	//���¹�ȣ
	String ownerName;	//�������̸�
	int balance;		//�ܾ�

	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit (int amount) {//�����Ѵ�.
		balance+= amount;
	}
	
	final int withdraw (int amount) throws Exception {//�����Ѵ�.
		if (balance<amount)
			throw new Exception("�ܾ��� �����մϴ�.");
		balance -= amount;
		return amount;
	}
}
