package ex08_13_02_polymorphism_error;

public class InheritanceEx6 {

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("���������մϴ�", "������", 
				"admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		//�߻� �޼��带 ������ �޼��带 ȣ��
		
		SMSSender obj2 = new SMSSender("���������մϴ�", "������", 
				"02-000-0000", "10% ���������� ����Ǿ����ϴ�.");
		//���� Ŭ���� ��ü obj1, obj2�� ������ �޼��� ȣ��
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-000-0000");
	
	}
//MessageSender obj: ���� Ŭ���� Ÿ���� �Ķ����
//	MessageSender Ŭ�������� sendMessage�޼��带 �ּ�ó���� ��� ���� �߻��Ѵ�.
//	�ڹ� �����Ϸ��� ������ Ÿ������ �� �޼��尡 �ִ��� ������ üũ�Ѵ�.
//	MessageSender�� sendMessage()�޼��尡 �������� �ʾ�
//	The metod sendMessage(String) is undefined for the type���� �߻�
//	�ڹ� ���� ���� ��ü�Ǹ޼��带 ȣ���� �� ���� Ÿ�Կ� ������� ��ü�� ���ϴ� Ŭ������ �޼��带 ȣ���Ѵ�.
	 static void send(MessageSender obj, String recipient) {
		//��� Ŭ������ sendMessage�޼��尡 ȣ��ɱ��
		 //EMailSender �Ǵ� SMSSender
		 obj.sendMessage(recipient);
		
	}

}
