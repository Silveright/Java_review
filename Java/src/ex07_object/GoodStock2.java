package ex07_object;

public class GoodStock2 {
	//���� (�������)
	String goodsCode;
	int stockNum;

	/*
	//������-
	 * �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ� ����Ǿ�� �� �۾��� ���ؼ��� ���
	 * �����ڵ� �����ε��� ���ɶ� �������� �����ڰ� ������ �� ����
	 *
	 * 
//	 ������ ����
	 �������� �̸��� Ŭ������ �̸��� ���ƿ� �Ѵ�
	 �����ڴ� ���� Ÿ���� ����
	 
//	 �Ű������� ���� ������ - �⺻ ������
	 Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� ���ǵǾ� �־�� �Ѵ�
	 �����ڰ� ���� ��� �ڵ����� �߰��Ǵ� ������
	 �Ű������� �ִ� �����ڰ� �Ѱ��� �ۼ��� ��� �⺻ �����ڴ� �ڵ� �߰����� �ʴ���
*/
	GoodStock2(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	 void addStock(int amount) {
		stockNum += amount;
		
	} 
	
	//�޼���
	 int subtractStock(int amount) {
		if (stockNum<amount) 
			return 0;
		stockNum-=amount;
		return amount;
		
	}
	
}
