package ex11_5_Calendar;

import java.util.Calendar;

public class Calendar2_answer {

	public static void main(String[] args) {
		String[] yo = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};//�迭�� �̿��ϴ� ���
		Calendar today = Calendar.getInstance();
		
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH)+1;
		int d = today.get(Calendar.DATE);
		int h = today.get(Calendar.HOUR);//12�ð�
//		int h1 = today.get(Calendar.HOUR_OF_DAY);//24�ð�
		int ap = today.get(Calendar.AM_PM);
		int mm = today.get(Calendar.MINUTE);
		int s = today.get(Calendar.SECOND);
		System.out.print(y+"�� "+ m+ "�� " + d +"�� ");
		System.out.print(ap == Calendar.AM ? "���� " : "���� ");
		System.out.print(h+":"+ mm+":"+ s+"�� ");
		int yoil = today.get(Calendar.DAY_OF_WEEK);//
		System.out.println(yo[yoil-1]+" �Դϴ�.");//�迭�� �̿��� ���� ����ϱ� �Ͽ���:0�� �ǵ��� 1�� ����
		
		
//		System.out.print(today.get(Calendar.YEAR)+"�� " + (today.get(Calendar.MONTH)+1) +"�� "
//				+ today.get(Calendar.DAY_OF_MONTH) +"�� "		);
//		
//		System.out.print(today.get(Calendar.AM_PM) == 0 ? "���� " : "���� ");
//		System.out.printf("%d:%d:%d�� ",today.get(Calendar.HOUR_OF_DAY),
//				today.get(Calendar.MINUTE),today.get(Calendar.SECOND));
//		
//	    int day = today.get(Calendar.DAY_OF_WEEK);
//	    System.out.println((day==1?"��":day==2?"��":day==3?"ȭ":day==4?"��":day==5?"��":day==6?"��":"��" )+ "�����Դϴ�.");
//	    
	    
	}

}

//System.out.println("����_����(0:����, 1:����): "
//		+today.get(Calendar.AM_PM));
//System.out.println("�ð�(0~23): "
//		+today.get(Calendar.HOUR_OF_DAY));
//
//System.out.println("��(0~59): "
//		+today.get(Calendar.MINUTE));
//
//System.out.println("��(0~59): "
//		+today.get(Calendar.SECOND));
//
////1:�Ͽ���, 2:������, ... 7:�����
//		System.out.println("����(1~7, 1:�Ͽ���):  "
//				+ today.get(Calendar.DAY_OF_WEEK));