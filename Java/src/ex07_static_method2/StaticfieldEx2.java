package ex07_static_method2;

public class StaticfieldEx2 {
	public static void main (String args[]) {
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("�Ѱ�" +grandTotal);
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		//���� �޼��� ȣ�⹮
		grandTotal = Accumulator.getGrandTotal();
		
		
		//�ν��Ͻ� �޼��� print()�� ���� �޼����� main���� ȣ���� �� ����
		StaticfieldEx2 s = new StaticfieldEx2();
		
		s.print(obj1);
		s.print(obj2);//�� �޼��带 ����ϱ� ����?
		System.out.println("�Ѱ�=" +grandTotal);
	
	}
	
	 void print(Accumulator a) {
		System.out.println("total=" +a.total);
	}
}
