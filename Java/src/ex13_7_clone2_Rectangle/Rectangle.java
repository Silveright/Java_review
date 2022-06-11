package ex13_7_clone2_Rectangle;
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
	 * 공변 반환타입(covariant return type)-JDK1.5부터 적용
	 *  오버라이딩할 때 조상 메서드의 반환타입을 자손 클래스이 타입으로 변경을 허용한다.
	 *  즉, 반환형을 Object에서 자손 클래스 타입으로 변경을 허용한다.
	 *  장점) clone() 호출 후 형 변환이 필요없다.(main메서드)
	 *    Rectangle obj2 = (Rectangle) obj1.clone();
	 *    --> Rectangle obj2 = obj1.clone();
	 *    
	 */
	
	public Rectangle clone() {//반환형이 Object형 -> Rectangle형으로 변경
		try {
			//슈퍼 클래스의 clone메서드를 호출해 그 결과를 리턴
			return (Rectangle)super.clone();// Rectangle형으로 변환한다.
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
