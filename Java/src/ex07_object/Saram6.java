package ex07_object;

public class Saram6 {
	//핃드 (멤버변수)
	String name;
	double w;
	double ki;
	int age;
	
	//생성자-반두시 클래스 이름과 똑같고 리턴 타입이 없어야 함
	Saram6(String name, double w, double ki, int age){
		/*
		 * this란 
		 * 
		*/
		
		this.name=name;
		this.w= w;
		this.ki=ki;
		this.age = age;
	}
	
	Saram6( double w,String name){
		this.name=name;
		this.w= w;
		
	}
	
	//생성자-반두시 클래스 이름과 똑같고 리턴 타입이 없어야 함
	
	Saram6(String name2, double w2){
		this.name=name2;
		this.w= w2;
		
	}
	
	
	
	//메서드
	public void eat() {
		System.out.println(this.name+"이(가) 밥을 먹는다.");
	} //this 생략가능
	
	//메서드
	public void walk() {
		System.out.println(this.name+"이(가) 걷기전 몸무게는 " +w +"입니다.");
	}
	
	//메서드
	
	public void sesu() {
		System.out.println(this.name+"이(가) 세수한다.");
	}
	
	
	
}
