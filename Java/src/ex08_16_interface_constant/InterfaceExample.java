//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ� ���α׷�
package ex08_16_interface_constant;
public class InterfaceExample {
	public static void main(String[] args) {
		SeparateVolume obj =
				new SeparateVolume("863��", "����", "��������");
		printState(obj);
		obj.checkOut("����", "2022-06-22");
		printState(obj);
		
	
	}
	
	private static void printState(SeparateVolume obj) {
		
		if(obj.state == Lendable.STATE_NORMAL) {
			System.out.println("------------------");
			System.out.println("���� ����: ���Ⱑ��");
			System.out.println("------------------");
		}
		else if(obj.state == Lendable.STATE_BORROWED) {
			System.out.println("------------------");
			System.out.println("���� ����: ������");
			System.out.println("������: " +obj.borrower);
			System.out.println("������: " +obj.checkOutDate);
			System.out.println("------------------");
			
		}
	}
}
