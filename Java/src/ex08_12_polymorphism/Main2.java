package ex08_12_polymorphism;
//�ڹٴ� �� Ÿ���� ���������� ����Ÿ���� ��ü�� ������ �� �ֵ��� �ߴµ�
//���� Ŭ���� Ÿ���� ���� ������ �ڼ� Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� �Ͽ����ϴ�
//->������
public class Main2 {

	public static void main(String[] args) {
		Account obj = new Account("111-22-333333","�Ӳ���",10000);
		CheckingAccount obj1 = new CheckingAccount  (
				"444-55-6666", "ȫ�浿" , 20000, "5555-6666-7777-8888");
		CreditLineAccount obj2 = new CreditLineAccount(
				"777-88-99999", "�輱��", 30000,20000000);
		BonusPointAccount obj3 = new BonusPointAccount(
				"000-00-00000", "��̿�", 0,0);
		printAccountInfo(obj);
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		
	}
	//�پ��� Ÿ���� ��ü�� �� Ÿ���� �Ķ���ͷ� �޴´�. (���� �θ� ��ӹ޴´�.)
	static void printAccountInfo(Account obj) {
	System.out.println("���¹�ȣ:" +obj.accountNo);
		System.out.println("������ �̸�:" +obj.ownerName);
		System.out.println("�ܾ�:" +obj.balance);
		System.out.println();
	}
		

}

