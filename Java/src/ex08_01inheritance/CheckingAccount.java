package ex08_01inheritance;
//���� ���� Ŭ������ ��ӹ޴� ���� ���� Ŭ����
//���� ���� Ŭ����(Account) ���� Ŭ����(����� ���ִ� Ŭ����)
//���� ���� Ŭ����(CheckingAccount) ���� Ŭ����(����� �޴� Ŭ����)
public class CheckingAccount extends Account {
	String cardNo;//���� ī�� ��ȣ
//	CheckingAccount(){
//		super();
//		}
	//balance�ʵ�� withdraw()�޼���� Account Ŭ�����κ��� ��ӹ޾� ��� �����ϴ�.
	//���� �� Ŭ���� �ȿ� ����Ǿ� �ִ� ��ó�� ����ϰ� �ִ�.
	
	//����ī�� ������ �����ϴ� �޼���
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) ||balance<amount)
			throw new Exception("������ �Ұ��� �մϴ�");
		
		return withdraw(amount);

	} 
}
