package ex11_1_String;

public class StringExample_6_2 {

	public static void main(String[] args) {
		
		String jumin = "123456-2123456";
		String s = jumin.substring(7, 8);
		System.out.println("������ ���ڴ� " +s+"�̰� ");

		switch(s) {
		
		case "1" :
		case "3" :
			System.out.println("�����Դϴ�.");
			break;
		case "2" :
		case "4" :
			System.out.println("�����Դϴ�.");
			break;
		default :
			System.out.println("�ܱ����Դϴ�.");
		}
		
		
		
		
	}
}
//str1.equals(str2)
//		if (s.equals("2")|| s.equals("4")) {
//			System.out.println("�����Դϴ�.");
//		} else if (s.equals("1") || s.equals("3")) {
//			System.out.println("�����Դϴ�.");
//		} else {
//			System.out.println("�ܱ��� �Դϴ�.");
//		}