/*
 * private 필드를 갖는 클래스의 예
 * 
 * 객체 지향 프로그래밍의 주요 특징 중 하나인 켑슐화는 클래스 멤버를 클래스 내부에 감추는 것
 * 클래스 멤버를 외부에서 조작할 수 없도록 은닉하기 위해 private을 사용
 * 하지만 일부 멤버는 외부 클래스가 사용할 수 있도록 공개 해야 한다
 * 예로 리모컨은 복잡한 내부 회로를 캡슐화해서 은폐하지만 전원 버튼, 음량조절 버튼 등은 
 * 외부에 노출해서 사용할 수 있게 한다
 * 이처럼 클래스 내부에 은닉한 필드를 외부에서 사용할 수 있도록 
 * Getter 와 Setter를 제공한다
 * 일반적으로 Getter는 get Setter는 set으로 시작하는 이름을 사용한다
 * radius 필드에 접근하기 위해서 getRadius(), setRadius()메서드를 사용함
*/

package ex07_object_circle_private_field.copy;

public class Circle2 {
	//핃드 (멤버변수)
	// 접근제어자 private은 클래스 내부에서만 사용가능하다 -> 정보의 은닉
	private double radius;
	
	final double PI = 3.14;
	Circle2(double radius) {
		this.radius = radius;
	}

	//getter메서드
	double getArea() {
		return radius *radius *PI;
	}
	public double getRadius() {
		return radius;
	}
	
	//setter 메서드
	public void setRadius(double radius) {
		this.radius = radius;
	}
} 
	
	

	

