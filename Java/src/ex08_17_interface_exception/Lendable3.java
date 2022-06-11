//추상 메서드에 throws절을 추가한 대출 가능 인터페이스
//구현 클래스에서 thorows절을 사용할 경우 인터페이스에서도 throws절을 작성해야한다.
package ex08_17_interface_exception;

import java.io.IOException;

interface Lendable3 {
	final static byte STATE_BORROWED =1; //대출 중
	final static byte STATE_NORMAL =0; //대출 되지 않은 상태
	
	abstract void checkOut(String borrower, String date)
		throws IOException;
		
	abstract void checkIn();
}
