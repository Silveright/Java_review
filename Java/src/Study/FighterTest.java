package Study;
abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	}
}

interface Fightable {
	void move(int x, int y);//public abstract�� ������
	void attack(Fightable f);//public abstract�� ������
}

class Fighter extends Unit implements Fightable{
	//�������̵� ��Ģ: ���󺸴� ���������� ������ ������ �ȵȴ�.
	public void move(int x, int y) {
		System.out.println(x+","+y+"�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");

	}
	//�ο� �� �ִ� ��븦 �ҷ��´�.
	Fightable getFighter( ) {
		Fighter f = new Fighter();// Fighter �����ؼ� ��ȯ
		return f;
	}
}



public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFighter();// �޼��� ��ȯŸ�԰� ��ġ
  		f.move(100, 200);
		f.attack( new Fighter()); //�Ʒ� �� �ڵ�� ���� �ǹ�
//		Fightable f2 = new Fighter();
//		f.attack(f2);
		
		Unit u = new Fighter();
		u.move(100, 200);
		u.stop();
//		u.attack(); �޼��� ȣ�� �Ұ�
		
		Fightable f1 = new Fighter();
		f1.attack(new Fighter());
		f1.attack(f1);
//		f1.stop(); �޼��� ȣ�� �Ұ� �����ܿ� ��ư�� ����.
		f1.move(100, 200);
		
	}

}
