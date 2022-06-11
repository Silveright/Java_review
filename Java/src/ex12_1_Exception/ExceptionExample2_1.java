package ex12_1_Exception;
/*
 * �ڹٿ����� ���൵�� �߻��ϴ� ����(��Ÿ�� ����)�� ������ ���ܷ� �����Ѵ�.
 * Error:���α׷� �ڵ忡 ���� ������ �� ���� �ɰ��� ����
 * Exception:���α׷� �ڵ忡 ���� ������ �� �ִ� �ټ� �̾��� ����
 * 
 * 
 * Exception�� �Ͼ�� ��Ȳ
 * 1) ������ 0���� ���� ��
 * 2) �迭�� index���� ���� ��
 * 3) �������� ����ȯ
 * 4) ������ϱ� ���� ������ �������� �ʴ� ���
 * 5) �޼��� ȣ�� ��
 */
//unchecked exception�� �ش� - ������ ���� ����
//���� �� ���� �߻� - ���� �߻�
public class ExceptionExample2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =3, num2 =0;
		
		try {
			int result = num1/num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		finally {//���� �߻� ���� ���� ���� �����
			System.out.println("��������Ծ��");
		}
	}

}
