package ex13_2;

public class ObjectExample {
	public static void main(String args[]) {
		GoodStock obj = new GoodStock("73527", 200);
		
		String str = "������� = "+  obj;
		//���ڿ��� GoodsStock ��ü ������ +�����ڷ� �����ϸ�
		//�� ��ü�� toString �޼��尡 �ڵ����� ȣ��� �� ���ڿ��� ����ȴ�.
		//String str = "������� =" + obj.toString()
		System.out.println(str);
	}
}
