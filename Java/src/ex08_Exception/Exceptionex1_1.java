package ex08_Exception;

public class Exceptionex1_1 {

	public static void main(String[] args) {
		int sum=1 + -2;
		if (sum <0) {
			//throw�� ������ �߻���Ű�� Ű����
			throw new Exception ("�����߻�");//exception ��ü ����
		}
		System.out.println(sum);
	}
}
