package ex08_8_abstract_class01;

public class InheritanceEx6 {

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("���������մϴ�", "������", "admin@khshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		//�߻� �޼��带 ������ �޼��带 ȣ��
		obj1.sendMessage("hoho@naver");
		
		SMSSender obj2 = new SMSSender("���������մϴ�", "������", "02-123-5678", "10% ���������� ����Ǿ����ϴ�.");
		obj2.sendMessage("010-1234-5678");
	}

}
