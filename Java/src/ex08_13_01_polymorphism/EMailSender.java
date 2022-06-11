package ex08_13_01_polymorphism;
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
		System.out.println("������ ���: " + senderName 
							+ " " + senderAddr);
		System.out.println("�޴� ���: " + recipient);
		System.out.println("����:" +emailBody);
	}
	
}
