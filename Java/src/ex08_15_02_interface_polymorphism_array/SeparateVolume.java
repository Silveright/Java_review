//대출가능 인터페이스를 구현하는 단행본 클래스
package ex08_15_02_interface_polymorphism_array;
class SeparateVolume implements Lendable {

	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	SeparateVolume(String requestNo, String bookTitle, 
			String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkOut(String borrower, String date) {
		
		if (state !=0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state =1;
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("저자:" + writer);
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n"); 

	}

	@Override
	public void checkIn() {
		this.state =0;
		this.checkOutDate = null;
		this.borrower = null;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.");
       
	}
}
