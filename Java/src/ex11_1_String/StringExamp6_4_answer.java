package ex11_1_String;
public class StringExamp6_4_answer {

	public static void main(String[] args) {
		String zumin = "123456-1111111";
		
//		System.out.println(zumin.length() ==14);//���̳� ������ �ٷ� ��ȯ�� �� ����
//		System.out.println(zumin.length() == 14 ? true:false);
		if(check_length(zumin)) { //���� ��쿡�� �����ϹǷ� ==true ���� �����ϴ�.
			if(check_hypen(zumin)) {
				int isNumber = isNumber(zumin);
				if(isNumber>=0 && isNumber<=5) {
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
				}else if(isNumber>=7 && isNumber<=13) {
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
				}else if(isNumber==-1) {
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
    	int index = -1;
    	int len = zumin.length();
    	for(int i=0; i<len;i++) {
    		if(i==6) continue;
    		
    		char test = zumin.charAt(i);
    		//if(test < '0' || test > '9') '0'��� �ƽ�Ű �ڵ� 48�� �ᵵ ��
    		if(!(test>='0' && test<='9')) {
    			index = i;
    			break;//??
    		}
    	}
		return index;//�� ���� ������ �ȵɰ�쿡�� -1�� �´�.
	}

    static boolean check_hypen(String zumin) {
	   return zumin.substring(6,7).equals("-");//.equals �޼����� ��ȯ���� boolean
	}

	static boolean check_length(String zumin) {
		return zumin.length() == 14;
		
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

