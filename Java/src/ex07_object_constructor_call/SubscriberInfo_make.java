package ex07_object_constructor_call;

public class SubscriberInfo_make {
	public static void main(String args[]) {
	SubscriberInfo obj1 = new SubscriberInfo ("���", "java", "java","01051552" ,
												"�� ã����"); 
	print(obj1);
	
	obj1.changeaddress("����� ���α�");
	print(obj1);
}
	
	public static void print(SubscriberInfo obj) {
		System.out.println("�̸�:" + obj.name);
		System.out.println("���̵�:" + obj.id);
		System.out.println("�н�����:" + obj.password);
		System.out.println("��ȭ��ȭ:" + obj.phoneNo);
		System.out.println("�ּ�:" + obj.address);
		System.out.println("=============================");
	}
}
	

