package ex11_1_String;
public class StringExamp6_4_answer {

	public static void main(String[] args) {
		String zumin = "123456-1111111";
		
//		System.out.println(zumin.length() ==14);//참이나 거짓을 바로 반환할 수 있음
//		System.out.println(zumin.length() == 14 ? true:false);
		if(check_length(zumin)) { //참인 경우에만 실행하므로 ==true 생략 가능하다.
			if(check_hypen(zumin)) {
				int isNumber = isNumber(zumin);
				if(isNumber>=0 && isNumber<=5) {
					System.out.println("주민번호 앞자리를 숫자로 입력하세요");
				}else if(isNumber>=7 && isNumber<=13) {
					System.out.println("주민번호 뒷자리를 숫자로 입력하세요");
				}else if(isNumber==-1) {
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
    	int index = -1;
    	int len = zumin.length();
    	for(int i=0; i<len;i++) {
    		if(i==6) continue;
    		
    		char test = zumin.charAt(i);
    		//if(test < '0' || test > '9') '0'대신 아스키 코드 48을 써도 됨
    		if(!(test>='0' && test<='9')) {
    			index = i;
    			break;//??
    		}
    	}
		return index;//한 번도 실행이 안될경우에도 -1이 온다.
	}

    static boolean check_hypen(String zumin) {
	   return zumin.substring(6,7).equals("-");//.equals 메서드의 반환형이 boolean
	}

	static boolean check_length(String zumin) {
		return zumin.length() == 14;
		
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

