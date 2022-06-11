package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_assignment_answer {
//1) 1���� ���������ϳĿ� ���� ���� ����>>1���� ���� ��������
//2) �� ���� ������ ���� ���ϱ�
//3) �� �ٲ� ���� ���ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �⵵�� �Է��ϼ���>");
		int year = sc.nextInt();
		System.out.println("����� ���� �Է��ϼ���>");
		int month = sc.nextInt();
		sc.close();
		//�Է� �⵵, ���� 1���� ���� �������� �˾ƾ��Ѵ�.
		Calendar c = new GregorianCalendar(year, month-1,1);//Ķ������ ���� Calendar�� ��������(������)
		//
//		new GregorianCalendar();�ý��� ��¥�� �����
		
		
		//�Է� �⵵, ���� ������ ��¥
		int lastOfDate = c.getActualMaximum(Calendar.DATE);
		
		//�ش� �� �� ���� �� ��¥�� ����
		//�ش� ���� 1�� ��ġ�� ã����-> 1���� ���Ͽ� �ش�Ǵ� ��
		//1:�Ͽ���, 2:������, ...7:�����
		int day_of_week = c.get(Calendar.DAY_OF_WEEK);
		
		
		//Ÿ��Ʋ ���
		String yoil[] = {"��","��","ȭ","��","��","��","��"};
		System.out.print("\t\t\t"+ c.get(Calendar.YEAR)+"��");
		System.out.print((c.get(Calendar.MONTH)+1)+"��"+"\n");
		for(int i =0; i<yoil.length; i++) {
			System.out.print(yoil[i]+"\t");
		}
		
		
		System.out.println();
		for(int i =0; i<51;i++)
			System.out.print("=");
		System.out.println();
		
		
		
		
		//week-1���� ������ ����Ѵ�.
		//c.get(Calendar.Day_Of_WEEK)=1 �Ͽ��� ������ ����.
		//c.get(Calendar.Day_Of_WEEK)=2 �������� ���� �ϳ�
		//c.get(Calendar.Day_Of_WEEK)=3 ȭ���� ���� �ΰ� 
		//c.get(Calendar.Day_Of_WEEK)=4 ������ ���� ����
		int count;
								//4
		for(count =1; count < day_of_week ; count++) { //1 1<4
			System.out.print("\t");						//\t
		}
		//1~������ ������ ���
		for(int i = 1; i <= lastOfDate; i++) {		//1
			System.out.print(i+"\t");
			if(count++ % 7 == 0)//�ָ��� ���� �ٲ�		//4 % 7
				System.out.println("\n");
		}
	}
}
