package ex13_3;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("���ع��� ��λ��� ������ ");
		StringBuffer sb2 = new StringBuffer("���ع��� ��λ��� ������ ");
	
		if(sb == sb2)
			System.out.println("sb==sb2 ����");
		else
			System.out.println("sb==sb2 �ٸ���");
		//StringBufferŬ������ equals()�޼��带 �������̵� ���� �ʾҴ�. >>sb==sb2�� ���� ��� boolean java.lang.Object.equals(Object obj)
		if(sb.equals(sb2))
			System.out.println("sb.equals(sb2) ����");
		else	
			System.out.println("sb.equals(sb2) �ٸ���");
		
		if(sb.toString().equals(sb2.toString()))//String�� equals�޼��带 ȣ���ϸ� ���ٴ� ����� ���� �� �ִ�.
			System.out.println("sb.toString().equals(sb2.toString())����");
		else	
			System.out.println("sb.toString().equals(sb2.toString())�ٸ���");
	}
}
