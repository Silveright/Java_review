package ex06_2_sort;

public class MethodEx19_��������variable_arguments {
	/*
	 * �������� (variable arguments)
	 	: �Ű� ������ ������ �������� �ƴ� �������� ������ �� �� �ִ�
		����) Ÿ��...������
		��Ģ) �������� �̿� �� �ٸ� �Ű� ������ �ִ� ��� �������ڸ� �Ű����� �߿��� ���� �������� �����ؾ� ��
	*
	*/
	
	public static String concatenate(String delim, String...str) {
		String result = "";
		
		for (String imsi : str)
			result+= imsi +delim;
		return result;
	}
	public static void main (String args[]) {
		System.out.println(concatenate(",", "���","��"));
		System.out.println(concatenate(",", "���","��","���"));
		System.out.println(concatenate(",", "���","��","���","Ű��"));
		System.out.println(concatenate(",",
			new String[] {"���", "��", "���", "Ű��"}));
			}
		}

