package ex13_8_DeepCopy;

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
			Circle c =(Circle)super.clone();
			c.p = new Point(this.p.x, this.p.y);//새로운 객체에 복제해 담는다.
			//p를 담을 새로운 객체를 생성한다.
			//인스턴스 변수가 참조형일때
			//참조하는 객체도 복제되게 오버라이딩
			return c;
			
		} catch(CloneNotSupportedException e){
			System.out.println("복사 중 오류 입니다.");
			return null;
		} 
	}
	public String toString() {
		return "[p="+p+" , r=" +r+"] ";
	}

}
