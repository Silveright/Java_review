
package ex13_7_clone2_Rectangle;
public class ObjectExample_rectangle {

	public static void main(String[] args) {
		//객체 생성
		Rectangle obj1 = new Rectangle(10,30);
		Rectangle obj2 = obj1.clone(); //(Rectangle)형변환이 필요없어졌다.
		//clone 메서드로 객체 복제
		System.out.println("[obj1] " + obj1);
		System.out.println("[obj2] " + obj2);
		
		//원본 객체와 복체 객체의 값 출력
		obj1.height = 100; obj1.width =200;
		System.out.println("[obj1] " + obj1);
		System.out.println("[obj2] " + obj2);
	}

}
