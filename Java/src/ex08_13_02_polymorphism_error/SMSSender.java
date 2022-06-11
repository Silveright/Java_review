package ex08_13_02_polymorphism_error;

public class SMSSender extends MessageSender {
	String returnPhoneNo, message;
	
	SMSSender(String title, String sendername, 
			String returnPhoneNo, String message ){
		super(title, sendername);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	void sendMessage(String recipient) {
	
		System.out.println("--------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName);
		System.out.println("��ȭ��ȣ: " + recipient);
		System.out.println("ȸ�� ��ȭ��ȣ: " + returnPhoneNo);
		System.out.println("�޽��� ����:" +message);
	}
	
}
