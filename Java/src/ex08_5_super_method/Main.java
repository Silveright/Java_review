package ex08_5_super_method;
public class Main {

	public static void main(String[] args) {
		BonusPointAccount obj = 
				new BonusPointAccount("111-22-33333333","홍길동",0, 0);
		obj.deposit(1000);
		System.out.println("잔액:" +obj.balance);
		System.out.println("누적 포인트:" +obj.bonusPoint);
		}
}
