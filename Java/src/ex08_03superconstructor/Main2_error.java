package ex08_03superconstructor;
//obj.deposit(10);������ �Ұ���
public class Main2_error {

	public static void main(String[] args) {
		CheckingAccount2_error obj = new CheckingAccount2_error("111-22-33333333","ȫ�浿",0, "555-666-777");
//		obj.accountNo="111-22-33333333";//��ӹ��� �ʵ�
//		obj.ownerName="ȫ�浿";//��ӹ��� �ʵ�
//		obj.cardNo="555-666-777";//��ӹ��� �޼���
////		obj.deposit(1000000);//��ӹ��� �޼���
		obj.deposit(1000000);
		try {
			int paidAmount = obj.pay("555-666-777", 47000);
			System.out.println("���Ҿ�:" +paidAmount);
			System.out.println("�ܾ�:" + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}