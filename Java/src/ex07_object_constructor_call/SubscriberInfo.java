//�����ڿ��� �����ڸ� ȣ���ϱ�
package ex07_object_constructor_call;
public class SubscriberInfo {
	//���� (�������)
	String name, id, password;
	String phoneNo, address;
	SubscriberInfo() {
		
	}
	//this�� ���������� �ν��Ͻ� �ڽ��� ����Ų��.
	SubscriberInfo(String name, String id, String password){
		this.name = name;
		this.id = id;
		this.password = password;
		
	}
	//this(): ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
	//String Ÿ���� �Ƕ���� 3���� ���� �����ڸ� ȣ��
	//������ ȣ�⹮�� ������ �ȿ��� ù��° ��ɹ��̾�� �Ѵ�.
	SubscriberInfo(String name, String id, String password, String phoneNo, String address){
		this(name,id,password);
		this.phoneNo = phoneNo;
		this.address = address;
	}
	 
	void changePassword(String password) {
//		password = chpassword; //this �� �� �� ���; (�޼���-String chpassword)
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
	

