package ex08_02constructor_Account;
//��� Ŭ������ ������ Object Ŭ����
//�ٸ� Ŭ�����κ��� ��� ���� �ʴ� ��� Ŭ�������� �ڵ������� Object Ŭ�����κ��� ��ӹ���

public class Account { //�����Ϸ��� extends Object�� �߰�����
	String accountNo;	//���¹�ȣ
	String ownerName;	//�������̸�
	int balance;		//�ܾ�
	//�⺻������ �����Ϸ��� �ڵ��߰�
	//Account()
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
