package ex07_object;

public class SubscriberInfo2_wrongex {
	//���� (�������)
	String name, id, password;
	String phoneNo, address;

	/*
	//������-
	 * �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ� ����Ǿ�� �� �۾��� ���ؼ��� ���
	 * �����ڵ� �����ε��� ���ɶ� �������� �����ڰ� ������ �� ����
	 *
	 * 
//	 ������ ����
	 �������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵ�
	 �����ڴ� ���� Ÿ���� ����
	 
//	 �Ű������� ���� ������ - �⺻ ������
	 Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� ���ǵǾ� �־�� �Ѵ�
	 �����ڰ� ���� ��� �ڵ����� �߰��Ǵ� ������
	 �Ű������� �ִ� �����ڰ� �Ѱ��� �ۼ��� ��� �⺻ �����ڴ� �ڵ� �߰����� �ʴ���
*/
	SubscriberInfo2_wrongex(String name, String id, String password,  String address){
		this.name = name;
		this.id = id;
		this.password = password;
		
	}
	
	SubscriberInfo2_wrongex(String name, String id, String password, String phoneNo){
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	
	
	}
	 
	
	void changePassword(String password) {
//		password = chpassword;
		this.password = password;
	} 
	void setPhoneNo(String phoneNo) {
//		phoneNo = chphonenum;
		this.phoneNo = phoneNo;
		
	} 
	void changeaddress(String address) {
		this.address = address;
		
	} 
	
	
}
	

