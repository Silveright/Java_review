package ex06_2_sort;

public class MethodEx12 {
	
	//����������  //��ü �������� ���� ����      //��ȯ�Ǵ� ���� �ڷ���       //�޼��� �̸�(�Ű����� ���)
	public     static                     void                main(String[] args) {
		hap(1,10);
		
		int result = hap(1,100);
		System.out.println("1: result =" +result);
		
		System.out.println("��¹� �ȿ��� ȣ��:"+hap(1,5));
	
	
	}
	
	
	
	
                  //��ȯ��         //���� �޾��ִ� ����
	public static int hap(int start, int end) {			//�޼��� ���� 
		int sum=0;
		for(int i=start; i<=end;i++) {	
			sum+=i;
		}
	return sum; //��ȯ�Ǵ� ���� �ڷ����� void�� ��� �� ������ ���� ����
	}
}
