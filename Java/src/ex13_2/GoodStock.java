package ex13_2;

public class GoodStock {
	//���� (�������)
	String goodsCode;
	int stockNum;

	GoodStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	public String toString() { //toString() �������̵�
		return "��ǰ�ڵ�:" + goodsCode +" ������:" + stockNum;
	}
}
