package ex06_2_sort;

public class MethodEx8 {
	
	//����������  //��ü �������� ���� ����      //��ȯ�Ǵ� ���� �ڷ���       //�޼��� �̸�(�Ű����� ���)
	public     static                     void                main(String[] args) {
		int num= 50;
		char data ='*';
		print(num,data);
		
	}
	
	//�޼��� ����               //���� �޾��ִ� ����
	public static void print(int parn, char p_data) {		
		for (int i = 0; i < parn; i++)
			System.out.print(p_data);
	}

}
