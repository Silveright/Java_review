package ex05_6_break;

public class BreakExample3_1 {
	//5는 제외하고 0부터 9까지 출력하기
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==1) {
				i=i+1;
			}
		}
	}
}


