package ex04_10_rel_logic_op;

public class EqualityExample1 {

	public static void main(String[] args) {
		int num1  = 6;
		int num2 = 2+3;
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		if (num1 == num2) {
			System.out.println("num1�� num2�� ���� �����մϴ�.");
		}
		
		if(num1 != num2) {
			System.out.println("num1�� num2�� ���� ���� �ʽ��ϴ�.");
		}
	}

}
