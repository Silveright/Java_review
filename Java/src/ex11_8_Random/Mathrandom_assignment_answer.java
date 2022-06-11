package ex11_8_Random;


public class Mathrandom_assignment_answer {

	public static void main(String[] args) {

		int lotto2[] = new int[6];// 중복된 데이터 확인하고자 배열 사용한다.
		for (int i = 0; i < lotto2.length; i++) { // num[0] = 30 num[1] = 30 >>중복 발생시 다시 구한다. >>num[1]
			lotto2[i] = (int) (Math.random() * 45) + 1;
			// j=0; j<1
			for (int j = 0; j < i; j++) { // 중복제거 num[1] == num[0]
				if (lotto2[i] == lotto2[j]) { // i=0
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto2.length; i++) {
			System.out.print(lotto2[i] + ",");
		}
	}
}


