package ex07_object;

public class SubscriberInfo2_wrongex2 {
	public static void main(String args[]) {
		SubscriberInfo obj1;
		obj1 = new SubscriberInfo (); //�⺻�����ڰ� ���� ��쿡�� ����� �� �ִ�
		print(obj1);
		obj1.setPhoneNo("010777777");
		obj1.changeaddress("����� ���α�");
		print(obj1);
		
		
		
		SubscriberInfo obj2 = new SubscriberInfo ("�����", "richman", "money", "02-123-4567","����");
		print(obj2);
		
		

	} 
		public static void print(SubscriberInfo obj) {
			System.out.println("�̸�:" + obj.name);
			System.out.println("���̵�:" + obj.id);
			System.out.println("�н�����:" + obj.password);
			System.out.println("��ȭ��ȭ:" + obj.phoneNo);
			System.out.println("�ּ�:" + obj.address);
			System.out.println();
		}
		
	
}
	

