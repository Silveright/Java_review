package ex08_12_polymorphism;

public class CheckingAccount extends Account {
	String cardNo;
	//�������� ù �ٿ��� ���� Ŭ������ �����ڸ� ȣ���ϴµ� �ڼ� Ŭ������ �����
	//�θ� Ŭ������ ����� ����� �� �����Ƿ� �θ��� ������� ���� �ʱ�ȭ�Ǿ� �־�� �Ѵ�
	CheckingAccount(String accountNo, String ownerName,
					int balance, String cardNo) {
		
	//������ ù �ٿ��� �θ� �����ڸ� ȣ������ �ʾұ� ������ 
		//�����Ϸ��� �θ��� �����ڸ� ȣ���ϴ� ������ super();�� ���⿡ ��������
	super(accountNo, ownerName,balance);
	
	this.cardNo = cardNo;
}
	
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) ||balance<amount)
			throw new Exception("������ �Ұ��� �մϴ�");
		return withdraw(amount);

	} 
}
