package ex08_04_overriding;
public class Main {
	public static void main(String[] args) {
		CreditLineAccount obj = 
				new CreditLineAccount("111-22-33333333","ȫ�浿",100, 20000);
		try {
			int amount = obj.withdraw(500);
			//int amount = obj.withdraw(50000);
			System.out.println("�����:" +amount);
			System.out.println("�ܾ�:" + obj.balance);
			System.out.println("���̳ʽ� �ѵ�:" +obj.creditLine);
		} 
		catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
