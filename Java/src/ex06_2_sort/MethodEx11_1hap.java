package ex06_2_sort;

public class MethodEx11_1hap {
	
	//����������  //��ü �������� ���� ����      //��ȯ�Ǵ� ���� �ڷ���       //�޼��� �̸�(�Ű����� ���)
	public     static                     void                main(String[] args) {
		hap(1,10);
		
		int a = hap(1,100); //return�� sum�� �� �����
		System.out.println("1: result =" +a);
	
	
	}
	
	
	
	
                  //��ȯ��         //���� �޾��ִ� ����
	public static int hap(int a, int b) {			//�޼��� ���� 
		int sum=0;
		for(int i=a; i<=b;i++) {	
			sum+=i;
		}
//		System.out.println(sum);
	return sum; //sum�� �ڷ����� �޼����� ��ȯ���� ��ġ�ؾ���
	}
}
