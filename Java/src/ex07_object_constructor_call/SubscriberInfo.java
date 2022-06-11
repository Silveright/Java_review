//생성자에서 생성자를 호출하기
package ex07_object_constructor_call;
public class SubscriberInfo {
	//핃드 (멤버변수)
	String name, id, password;
	String phoneNo, address;
	SubscriberInfo() {
		
	}
	//this는 참조변수로 인스턴스 자신을 가리킨다.
	SubscriberInfo(String name, String id, String password){
		this.name = name;
		this.id = id;
		this.password = password;
		
	}
	//this(): 같은 클래스의 다른 생성자를 호출할 때 사용
	//String 타입의 피라미터 3개를 갖는 생성자를 호출
	//생성자 호출문은 생성자 안에서 첫번째 명령문이어야 한다.
	SubscriberInfo(String name, String id, String password, String phoneNo, String address){
		this(name,id,password);
		this.phoneNo = phoneNo;
		this.address = address;
	}
	 
	void changePassword(String password) {
//		password = chpassword; //this 를 안 쓸 경우; (메서드-String chpassword)
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
	

