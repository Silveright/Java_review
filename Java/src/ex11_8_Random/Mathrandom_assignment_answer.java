package ex11_8_Random;


public class Mathrandom_assignment_answer {

	public static void main(String[] args) {

		int lotto2[] = new int[6];// �ߺ��� ������ Ȯ���ϰ��� �迭 ����Ѵ�.
		for (int i = 0; i < lotto2.length; i++) { // num[0] = 30 num[1] = 30 >>�ߺ� �߻��� �ٽ� ���Ѵ�. >>num[1]
			lotto2[i] = (int) (Math.random() * 45) + 1;
			// j=0; j<1
			for (int j = 0; j < i; j++) { // �ߺ����� num[1] == num[0]
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


