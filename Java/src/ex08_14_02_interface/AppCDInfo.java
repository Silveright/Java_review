package ex08_14_02_interface;

class AppCDInfo extends CDInfo implements Lendable {

	String borrower;         // ������
    String checkOutDate;     // ������
    byte state;              // �������
	
	AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
		
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (state !=0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state =1;
		System.out.println("*" + title + " CD�� ����Ǿ����ϴ�.");
        System.out.println("������:" + borrower);
        System.out.println("������:" + date + "\n");    
		
	}

	@Override
	public void checkIn() {
		this.state =0;
		this.checkOutDate = null;
		this.borrower = null;
		System.out.println("*" + title + " CD�� �ݳ��Ǿ����ϴ�.\n");
	}

}
