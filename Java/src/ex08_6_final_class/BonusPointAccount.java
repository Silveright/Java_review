package ex08_6_final_class;
//final class Account�� ��� �޾� ���� �߻�
//The type BonusPointAccount cannot subclass the final class Account
public class BonusPointAccount extends Account { 
	int bonusPoint;//���� ����Ʈ �ʵ�
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);//�θ� Ŭ������ ������ ȣ��
		this.bonusPoint = bonusPoint;
	}
	void deposit (int amount) {//�����Ѵ�.
		super.deposit(amount);
		bonusPoint+=(int)(amount * 0.001);
	}
}


