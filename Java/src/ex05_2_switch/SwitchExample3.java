package ex05_2_switch;

public class SwitchExample3 {

	public static void main(String[] args) {
		String ch = "+";
		
		switch (ch) {
		 case "+" :
			 System.out.println("+");
			 break;
		 case "-" :
			 System.out.println("-");
			 break;
		 case "*" :
			 System.out.println("*");
			 break;
		 case "/" :
			 System.out.println("/");
			 break;
		default :
			System.out.println("+, -, *, / �� �� ���� �Է��ϼ���.");
		System.out.println("��.");
		}
	}
}
