package ex11_5_Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_assignment {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 년도를 입력하세요>");
		int year = sc.nextInt();
		System.out.println("출력할 달을 입력하세요>");
		int month = sc.nextInt();
		
		System.out.println("\t"+ year+"년\t" +month+"월");
		System.out.println("===============================");
		System.out.printf("%3s %3s %3s %3s %3s %3s %3s\n", "일","월","화","수","목","금","토");
		
		//1일로 Calendar지정
		//날짜를 1일로 바꾸고 요일을 찾는다.
		c.set(year, month-1, 1);
		
		//해당 주 중 지난 달 날짜를 배제
		//해당 달의 1일 위치를 찾아줌-> 1일의 요일에 해당되는 수
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		//마지막 날짜
		int lastOfDate = c.getActualMaximum(Calendar.DATE);
		
		//week-1까지 공백을 출력한다.
		for(int i = 0; i < day - 1; i++) {
			System.out.printf("%4s", " ");
		}
		//1~마지막 날까지 출력
		for(int i = 1; i <= lastOfDate; i++) {
			//cal.set(year, month - 1, i);
			//week = cal.get(Calendar.DAY_OF_WEEK);
			System.out.printf("%4d", i);
			if(day % 7 == 0)//주마다 줄이 바뀜
				System.out.println();
			day++;
		}
		System.out.printf("\n");
		System.out.println("===============================");




		
		sc.close();
		
	}

}

//		int i =1;
//		while (i <= 31) {
//			System.out.printf("%5d",i);
//			if (i%7==0)
//				System.out.println();
//			i++;
//		}
//		System.out.println("\n=============");
//		 i =0;
//		while (++i <= 31) {
//			System.out.printf("%5d",i);
//			if (i%7==0)
//				System.out.println();
//		}