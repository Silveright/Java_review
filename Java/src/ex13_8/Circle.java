package ex13_8;

//Object 클래스에 정의된 clone()은 인스턴스 변수의 값만을 복제한다.
public class Circle implements Cloneable {
	Point p;
	double r;
	
	Circle(Point p,double r ){
		this.p = p;
		this.r =r;
	}
	
	public Circle clone() {
		try {
			//슈퍼 클래스의 clone메서드를 호출해 그 결과를 리턴
			return (Circle)super.clone();
		} 
		//슈퍼클래스의 clone메서드가 발생하는 익셉션 처리 
		//공변 반환 타입
		//얕은 복사 - 객체에 저장된 값을 그대로 복제
		//객체가 참조하고 있는 객체까지 복제하지 않는다.
		catch(CloneNotSupportedException e) {
			System.out.println("복제오류 발생");
			return null;
		}
	}
	public String toString() {
		return "[p="+p+" , r=" +r+"] ";
	}

}
