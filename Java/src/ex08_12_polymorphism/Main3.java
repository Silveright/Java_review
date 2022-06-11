package ex08_12_polymorphism;
//자바는 한 타입의 참조변수로 여러타입의 객체를 참조할 수 있도록 했는데
//조상 클래스 타입의 참조 변수로 자손 클래스의 인스턴스를 참조할 수 있도록 하였습니다
//->다형성
public class Main3 {

	public static void main(String[] args) {
		Account obj = new Account("111-22-333333","임꺽정",10000);
//		obj.accountNo="111-22-33333333";//상속받은 필드
//		obj.ownerName="홍길동";//상속받은 필드
//		obj.cardNo="555-666-777";//상속받은 메서드
////		obj.deposit(1000000);//상속받은 메서드
//		obj.deposit(10000);
		
		print(obj);
		
		CheckingAccount obj1 = new CheckingAccount  (
				"444-55-6666", "홍길동" , 20000, "5555-6666-7777-8888");
		print(obj1);
		
		CreditLineAccount obj2 = new CreditLineAccount(
				"777-88-99999", "김선달", 30000,20000000);
		print(obj2);
		
		BonusPointAccount obj3 = new BonusPointAccount(
				"000-00-00000", "김미영", 0,0);
		print(obj3);
	}

	private static void print(Account obj) {
		System.out.println("계좌번호:" +obj.accountNo);
		System.out.println("예금주 이름:" +obj.ownerName);
		System.out.println("잔액:" +obj.balance);
		System.out.println();
	}

}

