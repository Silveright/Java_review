package assignment_220610;

import java.util.Scanner;

public class Scanner_nextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("�Է��ϼ���>");
		  String name = sc.nextLine();
		  //���͸� ġ�� �Ǹ� ���ڿ��� ��µǾ�����.
	      System.out.println("��°��=" + name);
	      System.out.println("name ����=" + name.length());
	      sc.close();
		}
}
