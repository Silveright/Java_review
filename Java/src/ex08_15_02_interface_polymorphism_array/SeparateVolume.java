//���Ⱑ�� �������̽��� �����ϴ� ���ົ Ŭ����
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
		System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
		System.out.println("����:" + writer);
		System.out.println("������:" + borrower);
		System.out.println("������:" + date + "\n"); 

	}

	@Override
	public void checkIn() {
		this.state =0;
		this.checkOutDate = null;
		this.borrower = null;
		System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.");
       
	}
}
