package ex03_1_literal;

public class Literal4_printf {
	public static void main(String args[]) {
		
		System.out.printf("%f", 42.195 );
		System.out.println( );
		System.out.printf("%.2f%n",42.195);
		System.out.printf("%d\n", 42);
		System.out.printf("%10d\n", 42 );
		System.out.printf("%c%n", 'A' );
		System.out.printf("%s%n", "ȫ�浿" );
		System.out.printf("%10s\n", "ȫ�浿" );
		System.out.printf("%-10s\n", "ȫ�浿");
		System.out.printf("\n���� �̸��� %s, ���� ���̴� %d�� �Դϴ�.\n", "ȫ�浿", 21);
		System.out.printf("���� �̸��� %10s, ���� ���̴� %5d�� �Դϴ�.\n", "ȫ�浿", 21);
		System.out.printf("���� �̸��� %-10s, ���� ���̴� %-5d�� �Դϴ�.\n", "ȫ�浿", 21);
		

	}
}