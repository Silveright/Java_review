package Study;

public class Ex6_18 {

	
	public static void main(String[] args) {
		String str = "";
		System.out.println(str + "�� �����Դϱ�? " +isNumber(str));
		
		str ="1234o";
		System.out.println(str +" �� �����Դϱ�?" + isNumber(str));
	}

	  static boolean isNumber(String str) {
		// TODO Auto-generated method stub
		if(str==null || str.equals("")) //� ���� �Ű������� �޾ƿ��� �𸣱� ������ ��ȿ�� üũ
			return false;
		  
		  for(int i=0; i< str.length(); i++) {
			if(str.charAt(i)<'0' || str.charAt(i) >'9') {
				return false;
			}
			
		}
		return true;
	}
}
