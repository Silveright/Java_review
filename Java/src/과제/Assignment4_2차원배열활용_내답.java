package 과제;


public class Assignment4_2차원배열활용_내답 {

	public static void main(String[] args) {
		
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };

		int[][] score = { 
							{ 85, 60, 70 }, 
							{ 90, 95, 80 }, 
							{ 75, 80, 100 }, 
							{ 80, 70, 95 }, 
							{ 100, 65, 80 } };
		int[] subject = new int[3]; 
		int[] student = new int[5]; 
		System.out.println("==========학생별 / 과목별 총점구하기============");
		System.out.print("       ");
		for (String sub : sub_name) {
			System.out.print(sub + "\t");
		}
		System.out.println("평균");
		System.out.println();

		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");

				subject[j] += score[i][j];
			}

			int avr = 0;
			for (int j = 0; j < score[i].length; j++) {
				avr += score[i][j];
			}
			System.out.println((float) avr / sub_name.length + "\t");
			System.out.println();

		}
		System.out.println("==========================================");
		System.out.print("총첨\t");
		int i, j;
		for (j = 0; j < subject.length; j++) {
			for (i = 0; i < student.length; i++) {
				student[j] += score[i][j];
			}
			System.out.print(+student[j] + "\t");
		}
	}

}
