package ex08_13_01_polymorphism;
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
	 static void send(MessageSender obj, String recipient) {
		//��� Ŭ������ sendMessage�޼��尡 ȣ��ɱ��
		 //EMailSender �Ǵ� SMSSender
		 obj.sendMessage(recipient);
	}
}
