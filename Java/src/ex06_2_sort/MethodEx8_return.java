package ex06_2_sort;

public class MethodEx8_return {
	
	//����������  //��ü �������� ���� ����      //��ȯ�Ǵ� ���� �ڷ���       //�޼��� �̸�(�Ű����� ���)
	public     static                     void                main(String[] args) {
		int num= 50;
		char data ='*';
		print(num,data);
//		return;
	}
	
	//�޼��� ����               //���� �޾��ִ� ����
	public static void print(int num, char data) {		
		for (int i = 0; i < num; i++) {
			System.out.print(data);
	}
	
//	return; //��ȯ�Ǵ� ���� �ڷ����� void�� ��� �� ������ ���� ����
	}
}
