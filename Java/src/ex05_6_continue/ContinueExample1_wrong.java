package ex05_6_continue;

public class ContinueExample1_wrong {

	public static void main(String[] args) {
		int cnt =0;
		while (cnt<10) {
			if (cnt ==5)
				continue;
			System.out.println(cnt);
			cnt++;
		}
	}
}



//while (cnt++<9) {
//	if (cnt ==5)
//		continue;
//	System.out.println(cnt);
////			cnt++;
//}