//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex07_static_final1;

class Accumulator {
	
	static final int UPPER_LIMIT = 100000; //���� �ʵ带 �����ϴ� ����
	int value;
	
	void setValue (int value) {
		if (value < UPPER_LIMIT)
			this.value = value;
		else
			this.value = UPPER_LIMIT;
		
		
	}
}