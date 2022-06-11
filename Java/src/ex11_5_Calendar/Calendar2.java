package ex11_5_Calendar;
import java.util.Calendar;
public class Calendar2 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.print(today.get(Calendar.YEAR)+"년 " + (today.get(Calendar.MONTH)+1) +"월 "
				+ today.get(Calendar.DAY_OF_MONTH) +"일 "		);
		
		System.out.print(today.get(Calendar.AM_PM) == 0 ? "오전 " : "오후 ");
		System.out.printf("%d:%d:%d초 ",today.get(Calendar.HOUR_OF_DAY),
				today.get(Calendar.MINUTE),today.get(Calendar.SECOND));
		
	    int day = today.get(Calendar.DAY_OF_WEEK);
	    System.out.println((day==1?"일":day==2?"월":day==3?"화":day==4?"수":day==5?"목":day==6?"금":"토" )+ "요일입니다.");
	}
}

//System.out.println("오전_오후(0:오전, 1:오후): "
//		+today.get(Calendar.AM_PM));
//System.out.println("시간(0~23): "
//		+today.get(Calendar.HOUR_OF_DAY));
//
//System.out.println("분(0~59): "
//		+today.get(Calendar.MINUTE));
//
//System.out.println("초(0~59): "
//		+today.get(Calendar.SECOND));
//
////1:일요일, 2:월요일, ... 7:토요일
//		System.out.println("요일(1~7, 1:일요일):  "
//				+ today.get(Calendar.DAY_OF_WEEK));