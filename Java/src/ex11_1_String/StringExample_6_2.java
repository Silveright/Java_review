package ex11_1_String;

public class StringExample_6_2 {

	public static void main(String[] args) {
		
		String jumin = "123456-2123456";
		String s = jumin.substring(7, 8);
		System.out.println("추출한 숫자는 " +s+"이고 ");

		switch(s) {
		
		case "1" :
		case "3" :
			System.out.println("남자입니다.");
			break;
		case "2" :
		case "4" :
			System.out.println("여자입니다.");
			break;
		default :
			System.out.println("외국인입니다.");
		}
		
		
		
		
	}
}
//str1.equals(str2)
//		if (s.equals("2")|| s.equals("4")) {
//			System.out.println("여자입니다.");
//		} else if (s.equals("1") || s.equals("3")) {
//			System.out.println("남자입니다.");
//		} else {
//			System.out.println("외국인 입니다.");
//		}