package ex08_01inheritance;
//모든 클래스의 조상은 Object 클래스
//다른 클래스로부터 상속 받지 않는 모든 클래스들은 자동적으로 Object 클래스로부터 상속받음

public class CheckingAccount연습 extends Account { //컴파일러가 extends Object를 추가해줌
	String cardNo;
	try {int paidAmount =  cac.withdraw(paidAmount);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}




	
	int pay(String cardNo, int amount) throws Exception {
		

			if (cardNo.equals(this.cardNo) ||balance<amount)
				throw new Exception("지불이 불가능 합니다");
			return withdraw( amount );

	}
}


