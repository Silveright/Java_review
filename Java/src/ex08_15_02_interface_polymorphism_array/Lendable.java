//대출 가능 인터페이스
package ex08_15_02_interface_polymorphism_array;

interface Lendable {
	//대출한다.
	 void checkOut(String borrower, String date);
	
	//반납한다.
	 void checkIn();
}
