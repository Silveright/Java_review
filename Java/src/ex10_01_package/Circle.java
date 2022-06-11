package ex10_01_package;

private class Circle_private { //Illegal modifier for the class Circle_private;
								//only public, abstract & final are permitted
	//핃드 (멤버변수)
	int radius;
	
//	Circle() {
//		
//	}
	
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
	Circle_private(int radius){
		this.radius = radius;
	}
	//this(): 같은 클래스의 다른 생성자를 호출할 때 사용
	//생성자 호출문은 생성자 안에서 첫번째 명령문이어야 한다.
	
	
	
	
	 
	
	double getArea() {
//		double area= 3.14* radius * radius;
	//	return area;
		return 3.14 * radius * radius;
		
	
	} 
	
	
}
	

