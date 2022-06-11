package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar6_1_TimeZoneIDs {

	public static void main(String[] args) {
//		GregorianCalendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		System.out.println("현재 타임 zone = " +  cal.getTimeZone().getID());
		
		System.out.println("======================");
		for (String n : TimeZone.getAvailableIDs())
			System.out.println(n);
	}

}
