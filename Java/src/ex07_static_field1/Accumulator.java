//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex07_static_field1;

class Accumulator {
	int total;  //�ν��Ͻ�����
	static int grandTotal = 0; //���� �ʵ带 �����ϴ� ����
	
	void accumulate (int amount) {
		total += amount;
		//�����ʵ忡 amount�Ķ���� ���� ���ϴ� ���Թ�
		grandTotal += amount;
	}

	public int getGrandTotal() {
//		total =5;
		return grandTotal;
	}
}