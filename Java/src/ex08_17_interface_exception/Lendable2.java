//추상 메서드에 throws절을 추가한 대출 가능 인터페이스
package ex08_17_interface_exception;
interface Lendable2 {
	final static byte STATE_BORROWED =1; //대출 중
	final static byte STATE_NORMAL =0; //대출 되지 않은 상태
	
	abstract void checkOut(String borrower, String date)
		throws Exception;
		
	abstract void checkIn();
}
