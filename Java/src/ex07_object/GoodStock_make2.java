package ex07_object;

public class GoodStock_make2 {
public static void main(String[] args) {
		
		GoodStock2 obj; //변수 선언
		obj = new GoodStock2("52135", 200); //객체 생성
//		GoodStock obj = new GoodStock():
		
		
//		obj.goodsCode = "52135";   //필드에 값을 대입
//		obj.stockNum =200;		//필드에 값을 대입
		System.out.println("상품코드:" +obj.goodsCode);	//필드 값 사용
		System.out.println("재고수량:" +obj.stockNum);
		
		obj.addStock(1000);				//메소드 호출
		System.out.println("=====obj.addStock(1000) 후 ======");
		System.out.println("상품코드:" +obj.goodsCode);
		System.out.println("재고수량:" +obj.stockNum);
		
		obj.subtractStock(500);
		System.out.println("=====obj.addStock(500) 후 ======");
		System.out.println("상품코드:" +obj.goodsCode);
		System.out.println("재고수량:" +obj.stockNum);
		
	
	}
}
	
