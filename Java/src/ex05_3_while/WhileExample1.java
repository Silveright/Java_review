package ex05_3_while;

public class WhileExample1 {

	public static void main(String[] args) {
		
		
		int cnt =0;
		while(cnt<10) {
			System.out.println(cnt);
//			cnt+=1;
			cnt++;
		}
		System.out.println("========");
		cnt =0;
		while(cnt<10) {
			System.out.println(cnt++);
//			cnt+=1;
		}
		System.out.println("====1====");

		cnt = -1;
		while (++cnt < 10) {
			System.out.println(cnt);
		}
		System.out.println("====2====");
	}
}
