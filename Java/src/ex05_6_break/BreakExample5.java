package ex05_6_break;
//5제외하고 0부터 9 까지 출력
public class BreakExample5 {

	public static void main(String[] args) {
		
		for (int i =0; i<10;i++) {
			System.out.println(i);
			if(i==4) {
				i= i+1;
			}

		}
		System.out.println("끝.");
	}
}


