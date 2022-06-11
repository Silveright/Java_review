package ex08_03superconstructor;
//��� Ŭ������ ������ Object Ŭ����
//�����ڰ� �ִ� AccountŬ����
//���� ����Ŭ����
public class Account { //�����Ϸ��� extends Object�� �߰�����
	String accountNo;	//���¹�ȣ
	String ownerName;	//�������̸�
	int balance;		//�ܾ�
	
//	Account(){}
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	void deposit (int amount) {//�����Ѵ�.
		balance+= amount;
	}
	
	int withdraw (int amount) throws Exception {//�����Ѵ�.
		if (balance<amount)
			throw new Exception("�ܾ� ����");
		balance -= amount;
		return amount;
	}
}
