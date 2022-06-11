package ex11_5_Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_assignment {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �⵵�� �Է��ϼ���>");
		int year = sc.nextInt();
		System.out.println("����� ���� �Է��ϼ���>");
		int month = sc.nextInt();
		
		System.out.println("\t"+ year+"��\t" +month+"��");
		System.out.println("===============================");
		System.out.printf("%3s %3s %3s %3s %3s %3s %3s\n", "��","��","ȭ","��","��","��","��");
		
		//1�Ϸ� Calendar����
		//��¥�� 1�Ϸ� �ٲٰ� ������ ã�´�.
		c.set(year, month-1, 1);
		
		//�ش� �� �� ���� �� ��¥�� ����
		//�ش� ���� 1�� ��ġ�� ã����-> 1���� ���Ͽ� �ش�Ǵ� ��
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		//������ ��¥
		int lastOfDate = c.getActualMaximum(Calendar.DATE);
		
		//week-1���� ������ ����Ѵ�.
		for(int i = 0; i < day - 1; i++) {
			System.out.printf("%4s", " ");
		}
		//1~������ ������ ���
		for(int i = 1; i <= lastOfDate; i++) {
			//cal.set(year, month - 1, i);
			//week = cal.get(Calendar.DAY_OF_WEEK);
			System.out.printf("%4d", i);
			if(day % 7 == 0)//�ָ��� ���� �ٲ�
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