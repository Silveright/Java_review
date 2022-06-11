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
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName 
							+ " " + senderAddr);
		System.out.println("받는 사람: " + recipient);
		System.out.println("내용:" +emailBody);
	}
	
}
