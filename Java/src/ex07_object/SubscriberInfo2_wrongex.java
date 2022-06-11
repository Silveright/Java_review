package ex07_object;

public class SubscriberInfo2_wrongex {
	//핃드 (멤버변수)
	String name, id, password;
	String phoneNo, address;

	/*
	//생성자-
	 * 인스턴스 변수의 초기화 작업에 주로 사용되며 인스턴스 생성시에 실행되어야 할 작업을 위해서도 사용
	 * 생성자도 오버로딩이 가능라여 여러개의 생성자가 존재할 수 있음
	 *
	 * 
//	 생성자 조건
	 생성자의 이름은 클래스의 이름과 같아야 한다
	 생성자는 리턴 타입이 없다
	 
//	 매개변수가 없는 생성자 - 기본 생성자
	 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야 한다
	 생성자가 없는 경우 자동으로 추가되는 생성자
	 매개변수가 있는 생성자가 한개라도 작성된 경우 기본 생성자는 자동 추가되지 않느다
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
	

