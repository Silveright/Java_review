package ex08_Exception;

public class Exceptionex1_2 {

	public static void main(String[] args) {
		int sum=1 +-2;
		try {
			if (sum <0) {
				//throw�� ������ �߻���Ű�� Ű����
				throw new Exception ("�����߻�");//exception ��ü ����
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("[catch]" + e.getMessage());
		}
		
	}
}
