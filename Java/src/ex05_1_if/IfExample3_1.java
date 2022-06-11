package ex05_1_if;

public class IfExample3_1 {

	public static void main(String[] args) {
		int num1 = 52;
		int num2 = 24;
		int num3 = 32;
		
		if (num1 > num2) { //이를 만족하면
			if (num1 > num3) //이를 실행하고 이 또한 만족해야
				System.out.println("num1이 제일 큽니다." ); //출력이 된다.
		}
		
		//한 개의 if 문과 &&연산자로 바꾸기
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1이 제일 큽니다.");
			
		}
		
		System.out.println("끝.");
	}

}
