package ex07_object;

public class GoodStock2_method {
	public static void main(String args[]) {
		GoodStock2 obj;
		obj = new GoodStock2("52135", 200);//����� �����ڸ� �̿��� ��ü ����
		print(obj);//����Ʈ �޼��� �߰�
		
		obj.addStock(1000);
		System.out.println("=====obj.addStock(500) �� ======");
		print(obj);

		obj.subtractStock(500);
		System.out.println("=====obj.addStock(500) �� ======");
		print(obj);
	}
	
	private static void print(GoodStock2 obj) {//����Ʈ �޼���
		System.out.println("��ǰ�ڵ�:" +obj.goodsCode);
		System.out.println("������:" +obj.stockNum);
	}
}



	