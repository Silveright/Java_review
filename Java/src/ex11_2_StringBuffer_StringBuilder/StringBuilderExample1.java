//StringBuffer���� ��Ƽ�������� ����ȭ�� �� StringBuilder�� �߰��Ǿ���.
package ex11_2_StringBuffer_StringBuilder;
class StringBuilderExample1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("���ع��� ��λ��� ������  ");
		//���� ���ڿ��� �߰���
		System.out.println(sb.append("�⵵�� �����ϻ�  "));
		
		//index�� 19�� ���� "�ϴ����� �ϴ����� "�� ����
		System.out.println(sb.insert(19, "�ϴ����� �ϴ����� "));
		
		//index�� 24���� 27���� ���ڿ� ����
		System.out.println(sb.delete(24, 28));
		
		//index�� 9�� ���� ���� �ϳ� ����
		System.out.println(sb.deleteCharAt(9));
		
		System.out.println(sb.append("�⵵�� �����ϻ�  ").delete(0, 5));
		
		
		
		
		
		
		
	}

}
