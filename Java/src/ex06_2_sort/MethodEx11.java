package ex06_2_sort;

public class MethodEx11 {
	
	//����������  //��ü �������� ���� ����      //��ȯ�Ǵ� ���� �ڷ���       //�޼��� �̸�(�Ű����� ���)
	public     static                     void                main(String[] args) {
		hap(1,10);
		
//		int result = hap(1,100);
//		System.out.println("1: result =" +result);
	
	
	}
	
	
	
	
                  //��ȯ��         //���� �޾��ִ� ����
	public static void hap(int a, int b) {			//�޼��� ���� 
		int sum=0;
		for(int i=a; i<=b;i++) {	
			sum+=i;
		}
		System.out.println(sum);
//	return sum; //��ȯ�Ǵ� ���� �ڷ����� void�� ��� �� ������ ���� ����
	}
}
