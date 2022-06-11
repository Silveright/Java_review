package ex11_6_DateFormat;

import java.util.Date;
import java.text.SimpleDateFormat;
public class DateFormatExample1_Date {

	public static void main(String[] args) {
		//���� �ý��� ��¥�� �ð� ���ϴ� ���
		//Ŭ���� Date �̿��ϴ� ���-���� �ý��� ��¥�� �ð� ���Ѵ�.
		Date d = new Date();
		System.out.println("Date ��� :" +d);
		//System.out.prinln(new Date()); //�� �� ����� ���� �ǹ�
		
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sd1.format(d));//yyyy-MM-dd ���·� ���
		System.out.println(sd2.format(d));//yyyy��MM��dd�� ���·� ���
		
		/*379������ ����
		 �������� �Ű������� ��¥�� �ð��� ������ �ۼ��Ͽ� �Ѱ��ش�.
		 ���Ϲ���			�ǹ�
		 y			��
		 M			��
		 d			��
		 D			��(1~365)
		 E			��
		 a			���� ����
		 H�� 		0~23
		 h�� 		1~12
		 m			��
		 s			��
		 S			1/1000��
		 */
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a H�� m�� s�� E����");
		System.out.println(sdf.format(d));
	}

}
