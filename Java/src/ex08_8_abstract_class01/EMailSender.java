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
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName);
		System.out.println("전화번호: " + recipient);
		System.out.println("회신 전화번호: " + senderAddr);
		System.out.println("메시지 내용:" +emailBody);
	}
	
}
