package ex08_13_01_polymorphism;
//�߻� �޼��带 �����ϴ� Ŭ���� - �޽��� ���� Ŭ����
abstract class MessageSender {//Ŭ���� ��ü�� �߻� Ŭ������ ����
	String title, senderName; //����, �߼��� �̸�

	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	//�߻� �޼��� - �޽����� �۽��Ѵ�
	abstract void sendMessage(String recipient);
}

