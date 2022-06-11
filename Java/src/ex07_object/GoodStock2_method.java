package ex07_object;

public class GoodStock2_method {
	public static void main(String args[]) {
		GoodStock2 obj;
		obj = new GoodStock2("52135", 200);//선언된 생성자를 이용해 객체 생성
		print(obj);//프린트 메서드 추가
		
		obj.addStock(1000);
		System.out.println("=====obj.addStock(500) 후 ======");
		print(obj);

		obj.subtractStock(500);
		System.out.println("=====obj.addStock(500) 후 ======");
		print(obj);
	}
	
	private static void print(GoodStock2 obj) {//프린트 메서드
		System.out.println("상품코드:" +obj.goodsCode);
		System.out.println("재고수량:" +obj.stockNum);
	}
}



	