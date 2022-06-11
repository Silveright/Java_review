package ex08_01inheritance;
//obj.deposit(10);지불이 불가능
public class Main {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		obj.accountNo="111-22-33333333";//상속받은 필드
		obj.ownerName="홍길동";//상속받은 필드
		obj.cardNo="5555-6666-7777";//상속받은 메서드
//		obj.deposit(1000000);//상속받은 메서드
		obj.deposit(10);
		try {
			int paidAmount = obj.pay("555-666-777", 47000);
			System.out.println("지불액:" +paidAmount);
			System.out.println("잔액:" + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
