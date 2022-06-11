package ex08_8_abstract_class01;

public class EMailSender extends MessageSender {
	String senderAddr, emailBody;
	
	EMailSender(String title, String sendername, 
			String senderAddr, String emailBody ){
		super(title, sendername);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	@Override
	void sendMessage(String recipient) {
	
		System.out.println("--------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName);
		System.out.println("��ȭ��ȣ: " + recipient);
		System.out.println("ȸ�� ��ȭ��ȣ: " + senderAddr);
		System.out.println("�޽��� ����:" +emailBody);
	}
	
}
