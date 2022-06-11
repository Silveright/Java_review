package Study;
abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	}
}

interface Fightable {
	void move(int x, int y);//public abstract가 생략됨
	void attack(Fightable f);//public abstract가 생략됨
}

class Fighter extends Unit implements Fightable{
	//오버라이딩 규칙: 조상보다 접근제어자 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println(x+","+y+"로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");

	}
	//싸울 수 있는 상대를 불러온다.
	Fightable getFighter( ) {
		Fighter f = new Fighter();// Fighter 생성해서 반환
		return f;
	}
}



public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFighter();// 메서드 반환타입과 일치
  		f.move(100, 200);
		f.attack( new Fighter()); //아래 두 코드와 같은 의미
//		Fightable f2 = new Fighter();
//		f.attack(f2);
		
		Unit u = new Fighter();
		u.move(100, 200);
		u.stop();
//		u.attack(); 메서드 호출 불가
		
		Fightable f1 = new Fighter();
		f1.attack(new Fighter());
		f1.attack(f1);
//		f1.stop(); 메서드 호출 불가 리모콘에 버튼이 없다.
		f1.move(100, 200);
		
	}

}
