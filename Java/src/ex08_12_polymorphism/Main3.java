package ex08_12_polymorphism;
//�ڹٴ� �� Ÿ���� ���������� ����Ÿ���� ��ü�� ������ �� �ֵ��� �ߴµ�
//���� Ŭ���� Ÿ���� ���� ������ �ڼ� Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� �Ͽ����ϴ�
//->������
public class Main3 {

	public static void main(String[] args) {
		Account obj = new Account("111-22-333333","�Ӳ���",10000);
//		obj.accountNo="111-22-33333333";//��ӹ��� �ʵ�
//		obj.ownerName="ȫ�浿";//��ӹ��� �ʵ�
//		obj.cardNo="555-666-777";//��ӹ��� �޼���
////		obj.deposit(1000000);//��ӹ��� �޼���
//		obj.deposit(10000);
		
		print(obj);
		
		CheckingAccount obj1 = new CheckingAccount  (
				"444-55-6666", "ȫ�浿" , 20000, "5555-6666-7777-8888");
		print(obj1);
		
		CreditLineAccount obj2 = new CreditLineAccount(
				"777-88-99999", "�輱��", 30000,20000000);
		print(obj2);
		
		BonusPointAccount obj3 = new BonusPointAccount(
				"000-00-00000", "��̿�", 0,0);
		print(obj3);
	}

	private static void print(Account obj) {
		System.out.println("���¹�ȣ:" +obj.accountNo);
		System.out.println("������ �̸�:" +obj.ownerName);
		System.out.println("�ܾ�:" +obj.balance);
		System.out.println();
	}

}

