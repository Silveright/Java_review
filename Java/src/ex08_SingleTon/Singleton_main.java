//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex08_SingleTon;

public class Singleton_main {
	public static void main(String arfs[]) {
	Singleton obj1 = Singleton.getInstance();
	Singleton obj2 = Singleton.getInstance();//정적메서드로 객체 생성
	
	if (obj1 ==obj2) {
		System.out.println("같은 singleton");
	}else { 
			System.out.println("다른");
    }
}
}

