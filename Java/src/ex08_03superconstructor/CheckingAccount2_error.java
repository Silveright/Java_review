package ex08_03superconstructor;

public class CheckingAccount2_error extends Account {
	String cardNo;
	//�������� ù �ٿ��� ���� Ŭ������ �����ڸ� ȣ���ϴµ� �ڼ� Ŭ������ �����
	//�θ� Ŭ������ ����� ����� �� �����Ƿ� �θ��� ������� ���� �ʱ�ȭ�Ǿ� �־�� �Ѵ�
	CheckingAccount2_error(String accountNo, String ownerName,
					int balance, String cardNo) {
		
	super(); //Account(){}
	this.cardNo = cardNo;
}
	
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) ||balance<amount)
			throw new Exception("������ �Ұ��� �մϴ�");
		return super.withdraw(amount); //�θ�Ŭ������ withdraw�� ����ϰڴ� (���������)//this�� ����

	} 
}
