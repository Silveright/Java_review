package Study;
abstract class Player {
	 abstract void play(int pos);
	 abstract void stop();
}
//����� ���� �߻�Ŭ������ �ϼ��Ѵ�.
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"��ġ�� ���� �÷���");}
	void stop() {System.out.println("��� ����");} 
}
public class Player_test {

	public static void main(String[] args) {
//		Player p = new Player();
		AudioPlayer ap = new AudioPlayer();
		Player p = new AudioPlayer(); // ���� ȣ��Ǵ� ���� ���� ��ü �������ü�� ���. �������� Ÿ���� �߻�޼��忩�� ������.
//		�������ϰ� ����� ��ü�� ����� �� ������ �ִ�. �������� �߻�޼��忩�� ���� ����Ǵ� ���� ������ �޼����̹Ƿ� ���࿡ ������ ����.
		//���� ��ü�� ������ �ִ� �޼��尡 ȣ��ȴ�.
		
		ap.play(100);
		ap.stop();
		p.play(100);
	}

}
