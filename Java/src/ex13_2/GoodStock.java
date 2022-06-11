package ex13_2;

public class GoodStock {
	//핃드 (멤버변수)
	String goodsCode;
	int stockNum;

	GoodStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	public String toString() { //toString() 오버라이딩
		return "상품코드:" + goodsCode +" 재고수량:" + stockNum;
	}
}
