package ex11_1_String;
public class StringExamp6_4_method2 {

	public static void main(String[] args) {
		String zumin = "123456-11l1111";
		
		if(check_length(zumin)) {
			if(check_hypen(zumin)) {
				if(isNumber(zumin)>=0 && isNumber(zumin)<=5) {
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
				}else if(isNumber(zumin)>=7 && isNumber(zumin)<=13) {
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
				}else if(isNumber(zumin)==-1) {
					System.out.println(pandan_gender(zumin) + "�Դϴ�.");
				}
			} else {
				System.out.println("-�� �־��ּ���");
			}
		}else {
			System.out.println("�ֹι�ȣ�� 14�ڸ� �Դϴ�.");
		}
	}
	
    static int isNumber(String zumin) {
    	for(int i=0; i<zumin.length();i++) {
    		if(zumin.charAt(i)=='-') continue;
    		if(!(zumin.charAt(i)>='0' && zumin.charAt(i)<='9')) {
    			return i;
    		}
    	}
		return -1;
	}

    static boolean check_hypen(String zumin) {
	   return zumin.charAt(6) != '-' ? false: true;
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

