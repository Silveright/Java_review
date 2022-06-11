package ex08_7_final_method;

public class BonusPointAccount extends Account { 
	int bonusPoint;//���� ����Ʈ �ʵ�

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);//�θ� Ŭ������ ������ ȣ��
		this.bonusPoint = bonusPoint;
	}
	
	// �����Ѵ� ����� �ٽ� ���� (�޼��� �������̵�)
	//��� ���� �޼����� ������ �ܼ��� Ȯ��
	//super�� �ڽ� Ŭ�������� �θ�Ŭ������ ��� ���� �ʵ�� �޼��带 �����ϴµ� ���
	void deposit (int amount) {//�����Ѵ�.
		super.deposit(amount);
		bonusPoint+=(int)(amount * 0.001);
	}
}


