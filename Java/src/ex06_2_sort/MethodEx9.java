package ex06_2_sort;

public class MethodEx9 {
	
	//����������  //��ü �������� ���� ����      //��ȯ�Ǵ� ���� �ڷ���       //�޼��� �̸�(�Ű����� ���)
	public     static                     void                main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		print(num);
		return;
	}
	
	//�޼��� ����               //���� �޾��ִ� ����
	public static void print(int[] num) {		
		
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}

//	
	return; //��ȯ�Ǵ� ���� �ڷ����� void�� ��� �� ������ ���� ����
	}
}
