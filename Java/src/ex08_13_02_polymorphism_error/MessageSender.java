package ex08_13_02_polymorphism_error;
//�߻� �޼��带 �����ϴ� Ŭ���� - �޽��� ���� Ŭ����
abstract class MessageSender {//Ŭ���� ��ü�� �߻� Ŭ������ ����
	String title, senderName; //����, �߼��� �̸�

	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	//�߻� �޼��� - �޽����� �۽��Ѵ�
//	abstract void sendMessage(String recipient);
}

