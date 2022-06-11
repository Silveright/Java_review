//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex07_static_method;

class Accumulator {
	int total = 0;  //�ν��Ͻ�����
	static int grandTotal = 0; //���� �ʵ带 �����ϴ� ����
	
	void accumulate (int amount) { //�ν��Ͻ�
		total += amount;
		
		//�����ʵ忡 amount�Ķ���� ���� ���ϴ� ���Թ�
		grandTotal += amount;
	}
	
//	���� �޼��� �ȿ����� �ν��Ͻ� ����, �ν��Ͻ� �޼��� ����� �� ����
//	�ν��Ͻ� ������ �ν��Ͻ� �޼���� ��ü ������ ����� �� �ִ� ������̱� ������
//	�ν��Ͻ� ������ ���þ���  static �޼��� �ȿ����� ����� �� ����
//	���� this�� ����� �� ����
	
	static int getGrandTotal() {
		//total =5; //�����߻�
		//accumulate(100); //����
		return grandTotal;
	}
}