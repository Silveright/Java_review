package ex07_object;

public class SubscriberInfo_make {
	public static void main(String args[]) {
	SubscriberInfo obj1 = new SubscriberInfo ("��ȫ��", "poorman", "zebi"); 
	print(obj1);
	obj1.setPhoneNo("010777777");
	obj1.changeaddress("����� ���α�");
	print(obj1);
	
	
	
	SubscriberInfo obj2 = new SubscriberInfo ("�����", "richman", "money", "02-123-4567","����");
	print(obj2);
	
	

} 
	public static void print(SubscriberInfo o) {
		System.out.println("�̸�:" + o.name);
		System.out.println("���̵�:" + o.id);
		System.out.println("�н�����:" + o.password);
		System.out.println("��ȭ��ȭ:" + o.phoneNo);
		System.out.println("�ּ�:" + o.address);
		System.out.println();
	}
	
}
	

