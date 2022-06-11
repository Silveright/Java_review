package ex09_02_null;

class RefTypeExample5 {

	public static void main(String[] args) {
		Point obj =null;
		//The local variable obj may not have been initialized
		try {
			System.out.println(obj.x);
			System.out.println(obj.y);
		} catch(NullPointerException n) {
			System.out.println("Point는 null 입니다.");
		}
	}

}
