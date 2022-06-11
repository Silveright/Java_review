package ex08_7_final_method;
//obj.deposit(10);지불이 불가능
public class Main {

	public static void main(String[] args) {
		BonusPointAccount obj = 
				new BonusPointAccount("111-22-33333333","홍길동",0, 0);
		
		obj.deposit(1000);
		System.out.println("잔액:" +obj.balance);
		System.out.println("누적 포인트:" +obj.bonusPoint);
		}
	

}
