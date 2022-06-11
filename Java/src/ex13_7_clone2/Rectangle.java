package ex13_7_clone2;
/*복제 가능한 클래스로 만들기
 * 1단계: Cloneable인터페이스 구현
   2단계: clone()메서드 오버라이드
 */

//Cloneable인터페이스가 구현되어있다는 것은 클래스 작성자가 복제를 허용한다는 의미
public class Rectangle implements Cloneable {
	int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	/*
	 * Object 클래스에 정의된 clone()
	 * protected Object clone() throws CloneNotsupportedException;
	 * ==>오버라이딩 시 접근 제어자 변경
	 * (protected => public: 상속관계 없이 다른 클래스에서 호출 할 수 있다.
	 */
	
	public Object clone() {//반환형이 Object형
		try {
			//슈퍼 클래스의 clone메서드를 호출해 그 결과를 리턴
			return super.clone();
		} 
		//슈퍼클래스의 clone메서드가 발생하는 익셉션 처리 
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		return "가로는 " +width +", 세로는 " +height;
	}
	public boolean equals(Object obj) {
		if(obj!= null && obj instanceof Rectangle ) {
			Rectangle r2 = (Rectangle)obj;//다운캐스팅
			return this.width == r2.width
					&& this.height == r2.height;
		} else {
			return false;
		}
	}
}
