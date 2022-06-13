/*
 * Calendar �� �߻�Ŭ������ �̷��� ��� �� �� ����.
 * 1. Calendar c = new Calendar();
 * 
 * 2.Calendar ���� �ΰ���
 * 1) ���� �޼��带 �̿��ؼ� ����ϴ� ���
 * 	  Calendar c1 = Calendar.getInstance();
 *    getInstance(): Calendar Ŭ������ ������ Ŭ������ �ν��Ͻ��� ��ȯ
 *    getInstance() �޼���� �޷� �ʵ尡 ���� ��¥ �� �ð����� �ʱ�ȭ �� Calendar ��ü�� ��ȯ�Ѵ�.
 * 2)��ĳ���� ���(�ڽ��� �ּҸ� �θ��� �ڷ����� ���� ������ ����)
 *   Calendar c2 = new GregorianCalendar();
 */

package ex11_5_Calendar;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String[] args) {
		// �⺻������ ���糯¥�� �ð����� �����ȴ�.
		Calendar today = Calendar.getInstance();//staticŬ����
		//������ ��¥ ������ �����´�.
		System.out.println("�� ���� �⵵ :" + today.get(1)); //public final static int YEAR =1; 
		
		System.out.println("��(0~11, 0: 1��)" + today.get(Calendar.MONTH)); //public final static int MONTH =2; 
		
		System.out.println("��(0~11, 0:1��): "
							+(today.get(Calendar.MONTH)+1));
		
		System.out.println("�� ���� �� ° ��: "
							+ today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("�� ���� �� ° ��: "
				+ today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("�� ���� ��ĥ: "
				+ today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("�� ���� ��ĥ: "
				+ today.get(Calendar.DAY_OF_YEAR));
		//1:�Ͽ���, 2:������, ... 7:�����
		System.out.println("����(1~7, 1:�Ͽ���):  "
				+ today.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("�� ���� ��� ° ����: "
							+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		System.out.println("����_����(0:����, 1:����): "
				+today.get(Calendar.AM_PM));
		
		System.out.println("�ð�(0~11): "
				+today.get(Calendar.HOUR));
		
		System.out.println("�ð�(0~23): "
				+today.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("��(0~59): "
				+today.get(Calendar.MINUTE));
		
		System.out.println("��(0~59): "
				+today.get(Calendar.SECOND));
		
		System.out.println("�� ���� ������ ��: "
				+today.getActualMaximum(Calendar.DATE));
		
		System.out.println("1000���� 1��(0~999): "
				+today.get(Calendar.MILLISECOND));
	}
}