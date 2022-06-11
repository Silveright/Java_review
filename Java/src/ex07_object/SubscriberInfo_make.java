package ex07_object;

public class SubscriberInfo_make {
	public static void main(String args[]) {
	SubscriberInfo obj1 = new SubscriberInfo ("연홍부", "poorman", "zebi"); 
	print(obj1);
	obj1.setPhoneNo("010777777");
	obj1.changeaddress("서울시 종로구");
	print(obj1);
	
	
	
	SubscriberInfo obj2 = new SubscriberInfo ("연놀부", "richman", "money", "02-123-4567","강남");
	print(obj2);
	
	

} 
	public static void print(SubscriberInfo o) {
		System.out.println("이름:" + o.name);
		System.out.println("아이디:" + o.id);
		System.out.println("패스워드:" + o.password);
		System.out.println("전화번화:" + o.phoneNo);
		System.out.println("주소:" + o.address);
		System.out.println();
	}
	
}
	

