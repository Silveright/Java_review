//checked exception�� ������ �޼���
//������ ���� �߻�
//throws exception�� ���� �޼��� ȣ�� �� try-catch������ ó��
package ex08_Exception;
public class Exceptionex5_4 {
	public static void main(String[] args) {
		int result;
		 result = add (0,-2);
		}


	//throws Exception: throw �� ���� �߻��� ������ ȣ���� �޼���� �ѱ��
	static int add ( int a, int b)  {
		int result = a+ b;
		try {
			if (result < 0) {
			throw new Exception("0���� �۾� ���� �߻�");
			}			
			System.out.println("���� ����� �ǳ�");
			System.out.println(result);
		}catch (Exception e) {
		System.out.println(e.getMessage());
	}
		return result;
	}
}



//try {
//	if (sum <0) {
//		//throw�� ������ �߻���Ű�� Ű����
//		throw new Exception ("�����߻�");//exception ��ü ����
//	}
//	System.out.println(sum);
//} catch (Exception e) {
//	System.out.println("[catch]" + e.getMessage());
//}
