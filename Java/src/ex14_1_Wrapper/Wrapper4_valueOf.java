package ex14_1_Wrapper;
//Wrapper Ŭ������ �����ڸ� ����ϴ� ���� �޼���- valueOf
public class Wrapper4_valueOf {
	public static void main(String[] args) {
		//�ڽ�- �⺻�� Ÿ���� ���� ��ü��
		//int-> Integer
		Integer obj1 = Integer.valueOf(10);
		Integer obj2 = Integer.valueOf(10);
		
		//�Ȱ��� �⺻���� ������ valueOf�޼��带 ������ ȣ���ϸ� ���� ��ü�� ���� �������� ���ϵȴ�.
		
		if(obj1 == obj2)
			System.out.println("obj1==obj2");
		else
			System.out.println("obj1!=obj2");
		
		
		//String�� ���������� equals �޼���� �ּҰ��� �ƴ� ������ ���ϵ��� �������̵� �Ǿ��ִ�.
		if(obj1.equals(obj2))
			System.out.println("obj1.equals(obj2) ����.");
		else
			System.out.println("obj1.equals(obj2) �ٸ���.");
		
	}
}
