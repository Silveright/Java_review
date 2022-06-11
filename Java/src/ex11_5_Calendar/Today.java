package ex11_5_Calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today {
	private Calendar c1 = new GregorianCalendar();

	Today(GregorianCalendar c1 ){
		this.c1 = c1;
	}
	Today(){
	}
	
	public String toString(){//overrides
		String[] yo = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		String[] ampm ={"���� ", "���� "};
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH)+1;
		int d = c1.get(Calendar.DATE);
		int h = c1.get(Calendar.HOUR);//12�ð�
		int ap = c1.get(Calendar.AM_PM);
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);//
		
		return y+"�� "+ m+"�� " + d + "�� " +ampm[ap] + "" +
				h+":"+mm+":" +s+" " +yo[yoil-1]+" �Դϴ�." ;
	}
}
