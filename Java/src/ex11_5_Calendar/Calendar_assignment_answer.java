package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_assignment_answer {
//1) 1일이 언제시작하냐에 따라 공백 결정>>1일이 무슨 요일인지
//2) 그 달의 마지막 날을 구하기
//3) 줄 바꿈 기준 정하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 년도를 입력하세요>");
		int year = sc.nextInt();
		System.out.println("출력할 달을 입력하세요>");
		int month = sc.nextInt();
		sc.close();
		//입력 년도, 달의 1일이 무슨 요일인지 알아야한다.
		Calendar c = new GregorianCalendar(year, month-1,1);//캘린더를 구현 Calendar를 조상으로(다형성)
		//
//		new GregorianCalendar();시스템 날짜가 저장됨
		
		
		//입력 년도, 달의 마지막 날짜
		int lastOfDate = c.getActualMaximum(Calendar.DATE);
		
		//해당 주 중 지난 달 날짜를 배제
		//해당 달의 1일 위치를 찾아줌-> 1일의 요일에 해당되는 수
		//1:일요일, 2:월요일, ...7:토요일
		int day_of_week = c.get(Calendar.DAY_OF_WEEK);
		
		
		//타이틀 출력
		String yoil[] = {"일","월","화","수","목","금","토"};
		System.out.print("\t\t\t"+ c.get(Calendar.YEAR)+"년");
		System.out.print((c.get(Calendar.MONTH)+1)+"월"+"\n");
		for(int i =0; i<yoil.length; i++) {
			System.out.print(yoil[i]+"\t");
		}
		
		
		System.out.println();
		for(int i =0; i<51;i++)
			System.out.print("=");
		System.out.println();
		
		
		
		
		//week-1까지 공백을 출력한다.
		//c.get(Calendar.Day_Of_WEEK)=1 일요일 공백은 없다.
		//c.get(Calendar.Day_Of_WEEK)=2 월요일은 공백 하나
		//c.get(Calendar.Day_Of_WEEK)=3 화요일 공백 두개 
		//c.get(Calendar.Day_Of_WEEK)=4 수요일 공백 세개
		int count;
								//4
		for(count =1; count < day_of_week ; count++) { //1 1<4
			System.out.print("\t");						//\t
		}
		//1~마지막 날까지 출력
		for(int i = 1; i <= lastOfDate; i++) {		//1
			System.out.print(i+"\t");
			if(count++ % 7 == 0)//주마다 줄이 바뀜		//4 % 7
				System.out.println("\n");
		}
	}
}
