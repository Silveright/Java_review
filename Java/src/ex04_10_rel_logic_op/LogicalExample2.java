package ex04_10_rel_logic_op;

//import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("���� �Է��ϼ���>");
		num = sc.nextInt();
		
		if (1<=num && num<=10) {
			System.out.println("1~10 ������ �� �Դϴ�.");
		} else {
			System.out.println("1~10 ������ ���� �ƴմϴ�.");
		}
		sc.close();
	}

}
