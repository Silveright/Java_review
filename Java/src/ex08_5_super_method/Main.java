package ex08_5_super_method;
public class Main {

	public static void main(String[] args) {
		BonusPointAccount obj = 
				new BonusPointAccount("111-22-33333333","ȫ�浿",0, 0);
		obj.deposit(1000);
		System.out.println("�ܾ�:" +obj.balance);
		System.out.println("���� ����Ʈ:" +obj.bonusPoint);
		}
}
