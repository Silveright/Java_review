package ex11_1_String;
public class StringExamp6_4_method2 {

	public static void main(String[] args) {
		String zumin = "123456-11l1111";
		
		if(check_length(zumin)) {
			if(check_hypen(zumin)) {
				if(isNumber(zumin)>=0 && isNumber(zumin)<=5) {
					System.out.println("주민번호 앞자리를 숫자로 입력하세요");
				}else if(isNumber(zumin)>=7 && isNumber(zumin)<=13) {
					System.out.println("주민번호 뒷자리를 숫자로 입력하세요");
				}else if(isNumber(zumin)==-1) {
					System.out.println(pandan_gender(zumin) + "입니다.");
				}
			} else {
				System.out.println("-을 넣어주세요");
			}
		}else {
			System.out.println("주민번호는 14자리 입니다.");
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
		 String result = "외국인";
			switch(gender) {
			case "1" :
			case "3" :
				 result = "남자";
				break;
			case "2" :
			case "4" :
				result = "여자";
			}
		 return result;
	}
}

