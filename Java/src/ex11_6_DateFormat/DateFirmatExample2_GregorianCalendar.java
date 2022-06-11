package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateFirmatExample2_GregorianCalendar {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println(calendar.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� M�� dd�� a h�� m�� s�� E����");
		System.out.println(sdf.format(calendar.getTime()));
	}
}
