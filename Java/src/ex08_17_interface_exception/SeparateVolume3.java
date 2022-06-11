//���Ⱑ�� �������̽��� �����ϴ� ���ົ Ŭ����
package ex08_17_interface_exception;
class SeparateVolume3 implements Lendable3 {

	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	SeparateVolume3(String requestNo, String bookTitle, 
			String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	//�θ��� ���ܴ� IOException, �ڽ��� ���ܴ� Exception���� �������̵� �ϴ� ������ ���� ������ �� Ŀ�� ���� �߻�
	@Override
	public void checkOut(String borrower, String date)
											throws Exception {
		
		if (state !=STATE_NORMAL)
			throw new Exception("*����Ұ�:" + bookTitle);
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state =STATE_BORROWED;
		System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
		System.out.println("����:" + writer);
		System.out.println("������:" + borrower);
		System.out.println("������:" + date + "\n"); 

	}

	@Override
	public void checkIn() {
		this.state =STATE_NORMAL;
		this.checkOutDate = null;
		this.borrower = null;
		System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.");
       
	}
}
