package ex11_1_String;

public class StringExamp6_4_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String zumin = "123456-2123456";
		
		if(check_length(zumin)) {
			System.out.println(pandan_gender(zumin) + "�Դϴ�.");
		}else {
			System.out.println("�ֹι�ȣ�� 14�ڸ� �Դϴ�.");
		};
		
		
		
	}
	
	static boolean check_length(String zumin) {
		return zumin.length() != 14 ? false: true;
		
	}
	
	 static String pandan_gender(String zumin) {
		
		 String gender = zumin.substring(7, 8);
		 String result = "�ܱ���";
			switch(gender) {
			
			case "1" :
			case "3" :
				 result = "����";
				break;
			case "2" :
			case "4" :
				result = "����";
			}
		 return result;
	}
}

