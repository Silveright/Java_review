//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex08_SingleTon;

public class Singleton {
	
	private static Singleton s = new Singleton();
	
	private Singleton() {	
	}
	
	public static Singleton getInstance() {
        System.out.println("여기는 getInstance입니다.");
		return s;
    }
}
