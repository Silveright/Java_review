package ex11_5_Calendar;
import java.util.Calendar;
public class Calendar2 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.print(today.get(Calendar.YEAR)+"�� " + (today.get(Calendar.MONTH)+1) +"�� "
				+ today.get(Calendar.DAY_OF_MONTH) +"�� "		);
		
		System.out.print(today.get(Calendar.AM_PM) == 0 ? "���� " : "���� ");
		System.out.printf("%d:%d:%d�� ",today.get(Calendar.HOUR_OF_DAY),
				today.get(Calendar.MINUTE),today.get(Calendar.SECOND));
		
	    int day = today.get(Calendar.DAY_OF_WEEK);
	    System.out.println((day==1?"��":day==2?"��":day==3?"ȭ":day==4?"��":day==5?"��":day==6?"��":"��" )+ "�����Դϴ�.");
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