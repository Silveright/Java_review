package Study;
abstract class Player {
	 abstract void play(int pos);
	 abstract void stop();
}
//상속을 통해 추상클래스를 완성한다.
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"위치로 부터 플레이");}
	void stop() {System.out.println("재생 멈춤");} 
}
public class Player_test {

	public static void main(String[] args) {
//		Player p = new Player();
		AudioPlayer ap = new AudioPlayer();
		Player p = new AudioPlayer(); // 실제 호출되는 것은 실제 객체 오디오객체의 멤버. 참조변수 타입이 추상메서드여도 괜찮다.
//		리모콘하고 연결된 객체가 기능을 다 가지고 있다. 리모콘이 추상메서드여도 실제 연결되는 것은 구현된 메서드이므로 실행에 문제가 없다.
		//실제 객체가 가지고 있는 메서드가 호출된다.
		
		ap.play(100);
		ap.stop();
		p.play(100);
	}

}
