package ex14_1_Wrapper;

public class Wrapper1_boxing_unboxing {
//������ �����͸� ���� �� ���ڿ��� �ް� �ȴ�.
	public static void main(String[] args) {
		//���� 351������
		Integer obj = new Integer(12);//�ڹ� jdk1.9���� deprecated
		
		//�⺻�� ���� ���Ѵ�.
		//Wrapper Ŭ������ �����ڸ� ����ϴ� ���� �޼��带 �̿��� ��ü �����Ѵ�.(Ŭ������ ���ٰ���>static)
		//�ڽ� - �⺻�� Ÿ���� ���� ��ü�� ��ȯ
		// int -> Integer
		Integer obj1 = Integer.valueOf(12);
		Integer obj2 = Integer.valueOf(7);
		
		
		//��ڽ�- ��ü�� �⺻�� Ÿ���� ������ ��ȯ
		//Integer -> int
		int n1 = obj1.intValue();
		int n2 = obj2.intValue();//Integer��ü �ȿ� int���� �����´�.
		int sum = n1+n2;
		System.out.println(sum);
		
		//String -> Integer
//		Integer n02 = Integer.valueOf("20a");���� �߻�java.lang.NumberFormatException
		//���ڰ� �ƴ� ���ڰ� ���� NumberFormatException �߻� try-catch������ ó��
		Integer n02 = Integer.valueOf("20");//�ڽ��� �ƴ�
		//"20"�� ���ڿ��� �⺻���� �ƴϴ�.
		//Integer->int >>20�� ���ڷ� ��ȯ��
		int n3 = n02.intValue();//��ڽ� �̷����, �̰����� ����ȯ�� �̷����
		sum = n1 + n2 + n3;
		System.out.println(sum);
	}

}
