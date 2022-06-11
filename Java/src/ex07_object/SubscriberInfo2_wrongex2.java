package ex07_object;

public class SubscriberInfo2_wrongex2 {
	public static void main(String args[]) {
		SubscriberInfo obj1;
		obj1 = new SubscriberInfo (); //기본생성자가 없는 경우에만 비워둘 수 있다
		print(obj1);
		obj1.setPhoneNo("010777777");
		obj1.changeaddress("서울시 종로구");
		print(obj1);
		
		
		
		SubscriberInfo obj2 = new SubscriberInfo ("연놀부", "richman", "money", "02-123-4567","강남");
		print(obj2);
		
		

	} 
		public static void print(SubscriberInfo obj) {
			System.out.println("이름:" + obj.name);
			System.out.println("아이디:" + obj.id);
			System.out.println("패스워드:" + obj.password);
			System.out.println("전화번화:" + obj.phoneNo);
			System.out.println("주소:" + obj.address);
			System.out.println();
		}
		
	
}
	

