//�����ڰ� �ִ� ����Ŭ������ ��ӹ��� ���
package ex08_03superconstructor;
public class CheckingAccount extends Account {
	String cardNo;
	//�ڹ� �����Ϸ��� ������ �� ���� Ŭ������ ������ ù��° ��ɹ��� 
	//���� Ŭ������ ������ ȣ�⹮�� �ƴϸ�
	//�ڵ������� ���� Ŭ������ no-arg constructor ȣ�⹮�� �߰��Ѵ�.
	//������ ����Ŭ�������� no-arg constructor�� ��� ������ �����߻�
	CheckingAccount(String accountNo, String ownerName,
					int balance, String cardNo) {
	//�Ķ���� 3���� ����Ŭ���� ������ ȣ�⹮�� �ݵ�� �������� ù��° ��ɹ��̾�� �Ѵ�.	
		super(accountNo, ownerName, balance); //Account(){}
	this.cardNo = cardNo;
}
	
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) ||balance<amount)
			throw new Exception("������ �Ұ��� �մϴ�");
		return super.withdraw(amount); //�θ�Ŭ������ withdraw�� ����ϰڴ� (���������)//this�� ����
	} 
}
