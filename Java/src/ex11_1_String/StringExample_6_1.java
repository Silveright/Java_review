package ex11_1_String;

public class StringExample_6_1 {

	public static void main(String[] args) {
		
		String jumin = "123456-2123456";
		String s = jumin.substring(7, 8);
		System.out.println("������ ���ڴ� " +s+"�̰� ");
		
		if (s.equals("2")|| s.equals("4")) {
			System.out.println("�����Դϴ�.");
		} else if (s.equals("1") || s.equals("3")) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�ܱ��� �Դϴ�.");
		}
	}
}
//str1.equals(str2)