package ex08_12_polymorphism;
//자바는 한 타입의 참조변수로 여러타입의 객체를 참조할 수 있도록 했는데
//조상 클래스 타입의 참조 변수로 자손 클래스의 인스턴스를 참조할 수 있도록 하였습니다
//->다형성
public class Main2 {

	public static void main(String[] args) {
		Account obj = new Account("111-22-333333","임꺽정",10000);
		CheckingAccount obj1 = new CheckingAccount  (
				"444-55-6666", "홍길동" , 20000, "5555-6666-7777-8888");
		CreditLineAccount obj2 = new CreditLineAccount(
				"777-88-99999", "김선달", 30000,20000000);
		BonusPointAccount obj3 = new BonusPointAccount(
				"000-00-00000", "김미영", 0,0);
		printAccountInfo(obj);
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		
	}
	//다양한 타입의 객체를 한 타입의 파라미터로 받는다. (같은 부모를 상속받는다.)
	static void printAccountInfo(Account obj) {
	System.out.println("계좌번호:" +obj.accountNo);
		System.out.println("예금주 이름:" +obj.ownerName);
		System.out.println("잔액:" +obj.balance);
		System.out.println();
	}
		

}

