package Study;

public class Ex6_18 {

	
	public static void main(String[] args) {
		String str = "";
		System.out.println(str + "는 숫자입니까? " +isNumber(str));
		
		str ="1234o";
		System.out.println(str +" 는 숫자입니까?" + isNumber(str));
	}

	  static boolean isNumber(String str) {
		// TODO Auto-generated method stub
		if(str==null || str.equals("")) //어떤 값을 매개변수로 받아올지 모르기 때문에 유효성 체크
			return false;
		  
		  for(int i=0; i< str.length(); i++) {
			if(str.charAt(i)<'0' || str.charAt(i) >'9') {
				return false;
			}
			
		}
		return true;
	}
}
