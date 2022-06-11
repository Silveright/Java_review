package ex11_8_Random;

import java.util.Random;

public class Mathrandom_assignment {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		int temp = 0;
		int j = 0;
		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);// 0~44������ ������ ���� ��´�.
			temp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp;
		}
		// �迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		for (int i = 0; i < 6; i++) {
			System.out.println("lotto[" + i + "]=" + lotto[i]);
		}

		Random random = new Random();

		int[] lottoNum = new int[6];

		for (int a = 0; a < lottoNum.length; a++) {
			lottoNum[a] = random.nextInt(45) + 1;
			for (int b = 0; b < a; b++) { // �ߺ�����
				if (lottoNum[a] == lottoNum[b]) {
					a--;
					break;
				}
			}
		}

		for (int c = 0; c < lottoNum.length; c++) {
			System.out.print(lottoNum[c] + ",\n");
		}

		int lotto2[] = new int[6];
		for (int a = 0; a < lotto2.length; a++) {
			lotto2[a] = (int) (Math.random() * 45) + 1;
			for (int b = 0; b < a; b++) { // �ߺ�����
				if (lotto2[a] == lotto2[b]) {
					a--;
					break;
				}
			}
		}
		for (int c = 0; c < lotto2.length; c++) {
			System.out.print(lotto2[c] + ",");
		}
	}
}


