package ex07_object;

public class GoodStock_make {
public static void main(String[] args) {
		
		GoodStock obj; //���� ����
		obj = new GoodStock(); //��ü ����
//		GoodStock obj = new GoodStock():
		
		
		obj.goodsCode = "52135";   //�ʵ忡 ���� ����
		obj.stockNum =200;		//�ʵ忡 ���� ����
		System.out.println("��ǰ�ڵ�:" +obj.goodsCode);	//�ʵ� �� ���
		System.out.println("������:" +obj.stockNum);
		
		obj.addStock(1000);				//�޼ҵ� ȣ��
		System.out.println("=====obj.addStock(1000) �� ======");
		System.out.println("��ǰ�ڵ�:" +obj.goodsCode);
		System.out.println("������:" +obj.stockNum);
		
		obj.subtractStock(500);
		System.out.println("=====obj.addStock(500) �� ======");
		System.out.println("��ǰ�ڵ�:" +obj.goodsCode);
		System.out.println("������:" +obj.stockNum);
		
	
	}
}
	
