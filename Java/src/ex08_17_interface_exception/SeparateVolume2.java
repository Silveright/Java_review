//대출가능 인터페이스를 구현하는 단행본 클래스
package ex08_17_interface_exception;
class SeparateVolume2 implements Lendable2 {

	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	SeparateVolume2(String requestNo, String bookTitle, 
			String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkOut(String borrower, String date)
											throws Exception {
		
		if (state !=STATE_NORMAL)
			throw new Exception("*대출불가:" + bookTitle);
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state =STATE_BORROWED;
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("저자:" + writer);
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n"); 

	}

	@Override
	public void checkIn() {
		this.state =STATE_NORMAL;
		this.checkOutDate = null;
		this.borrower = null;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.");
       
	}
}
