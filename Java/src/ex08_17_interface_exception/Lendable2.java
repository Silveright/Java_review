//�߻� �޼��忡 throws���� �߰��� ���� ���� �������̽�
package ex08_17_interface_exception;
interface Lendable2 {
	final static byte STATE_BORROWED =1; //���� ��
	final static byte STATE_NORMAL =0; //���� ���� ���� ����
	
	abstract void checkOut(String borrower, String date)
		throws Exception;
		
	abstract void checkIn();
}
