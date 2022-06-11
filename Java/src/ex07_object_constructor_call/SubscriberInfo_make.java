package ex07_object_constructor_call;

public class SubscriberInfo_make {
	public static void main(String args[]) {
	SubscriberInfo obj1 = new SubscriberInfo ("김고슬", "java", "java","01051552" ,
												"날 찾지마"); 
	print(obj1);
	
	obj1.changeaddress("서울시 종로구");
	print(obj1);
}
	
	public static void print(SubscriberInfo obj) {
		System.out.println("이름:" + obj.name);
		System.out.println("아이디:" + obj.id);
		System.out.println("패스워드:" + obj.password);
		System.out.println("전화번화:" + obj.phoneNo);
		System.out.println("주소:" + obj.address);
		System.out.println("=============================");
	}
}
	

