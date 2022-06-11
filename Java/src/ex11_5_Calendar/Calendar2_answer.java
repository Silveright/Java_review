package ex11_5_Calendar;

import java.util.Calendar;

public class Calendar2_answer {

	public static void main(String[] args) {
		String[] yo = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};//배열을 이용하는 방법
		Calendar today = Calendar.getInstance();
		
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH)+1;
		int d = today.get(Calendar.DATE);
		int h = today.get(Calendar.HOUR);//12시간
//		int h1 = today.get(Calendar.HOUR_OF_DAY);//24시간
		int ap = today.get(Calendar.AM_PM);
		int mm = today.get(Calendar.MINUTE);
		int s = today.get(Calendar.SECOND);
		System.out.print(y+"년 "+ m+ "월 " + d +"일 ");
		System.out.print(ap == Calendar.AM ? "오전 " : "오후 ");
		System.out.print(h+":"+ mm+":"+ s+"초 ");
		int yoil = today.get(Calendar.DAY_OF_WEEK);//
		System.out.println(yo[yoil-1]+" 입니다.");//배열을 이용해 요일 출력하기 일요일:0이 되도록 1을 빼줌
		
		
//		System.out.print(today.get(Calendar.YEAR)+"년 " + (today.get(Calendar.MONTH)+1) +"월 "
//				+ today.get(Calendar.DAY_OF_MONTH) +"일 "		);
//		
//		System.out.print(today.get(Calendar.AM_PM) == 0 ? "오전 " : "오후 ");
//		System.out.printf("%d:%d:%d초 ",today.get(Calendar.HOUR_OF_DAY),
//				today.get(Calendar.MINUTE),today.get(Calendar.SECOND));
//		
//	    int day = today.get(Calendar.DAY_OF_WEEK);
//	    System.out.println((day==1?"일":day==2?"월":day==3?"화":day==4?"수":day==5?"목":day==6?"금":"토" )+ "요일입니다.");
//	    
	    
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