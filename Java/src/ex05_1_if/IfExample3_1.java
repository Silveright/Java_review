package ex05_1_if;

public class IfExample3_1 {

	public static void main(String[] args) {
		int num1 = 52;
		int num2 = 24;
		int num3 = 32;
		
		if (num1 > num2) { //�̸� �����ϸ�
			if (num1 > num3) //�̸� �����ϰ� �� ���� �����ؾ�
				System.out.println("num1�� ���� Ů�ϴ�." ); //����� �ȴ�.
		}
		
		//�� ���� if ���� &&�����ڷ� �ٲٱ�
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1�� ���� Ů�ϴ�.");
			
		}
		
		System.out.println("��.");
	}

}
