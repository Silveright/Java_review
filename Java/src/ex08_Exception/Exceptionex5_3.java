//checked exception�� ������ �޼���
//������ ���� �߻�
//throws exception�� ���� �޼��� ȣ�� �� try-catch������ ó��
package ex08_Exception;
public class Exceptionex5_3 {
	public static void main(String[] args) {
		int result;
		try {
			result = add (1,-2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	//throws Exception: throw �� ���� �߻��� ������ ȣ���� �޼���� �ѱ��
	static int add ( int a, int b) throws Exception {
		int result = a+ b;
		if (result < 0)
			throw new Exception("0���� �۾� ���� �߻�");
		System.out.println("���� ����� �ǳ�");
		return result;
	}
}

