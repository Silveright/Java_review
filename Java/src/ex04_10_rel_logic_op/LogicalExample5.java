package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample5 {

	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int num;
		
		System.out.println("���� �Է��ϼ���>");
		num = sc.nextInt();
		
		if (!(1<=num && num<=10)) {
			System.out.println("(!)1~10 ������ ���� �ƴմϴ�.");
		} else {
			System.out.println("1~10 ������ ���Դϴ�.");
		}
		if (num<1 || 10<num) {
			System.out.println("1~10 ������ ���� �ƴմϴ�.");
		}
		sc.close();
	}

}
