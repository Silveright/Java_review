//�߻� �޼��忡 throws���� �߰��� ���� ���� �������̽�
//���� Ŭ�������� thorows���� ����� ��� �������̽������� throws���� �ۼ��ؾ��Ѵ�.
package ex08_17_interface_exception;

import java.io.IOException;

interface Lendable3 {
	final static byte STATE_BORROWED =1; //���� ��
	final static byte STATE_NORMAL =0; //���� ���� ���� ����
	
	abstract void checkOut(String borrower, String date)
		throws IOException;
		
	abstract void checkIn();
}
