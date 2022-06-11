package 과제;


public class Assignment4_2차원배열활용_answer {

	public static void main(String[] args) {
		
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };

		int[][] score = { 
				{ 85, 60, 70 }, 
				{ 90, 95, 80 }, 
				{ 75, 80, 100 }, 
				{ 80, 70, 95 }, 
				{ 100, 65, 80 } 
		};
		
		int[] subject = new int[3]; //과목총점 저장 ->열 column
		int[] student = new int[5]; //학생의 총점 저장 ->행 row

		int r,c; //r=행(학생) c=열(과목) 저장 변수선언
		
		System.out.println();
		for (int i=0; i<10; i++)
			System.out.print("=");
		
		System.out.print("학생별 / 과목별 총점구하기");
		for (int i =0; i<10; i++) 
			System.out.print("="); //첫줄 출력
		
		System.out.print("\n\t");
		for (c=0; c<3; c++) 
			System.out.print(sub_name[c] + "\t");//과목 출력
			
		System.out.print("총점\t평균");
		
		for (r=0; r<5; r++) {					// r=0 -> 강호동 
			System.out.print("\n" +name[r] + "\t");
				
			for (c=0; c<3; c++) { // c=0->85 c=1->60 c=2-> 70
				System.out.print(score[r][c] + "\t"); // 학생 점수 출력
				student[r] += score[r][c]; // 학생 총점 누적 //student[0] =85 student[1] =85+60 student[2] =85+60+70
				subject[c] += score[r][c]; // 과목 총점 누적 //subject[0] =85 subject[1] =60 subject[0] =70
			}
//				System.out.print(student[r] + "\t" + student[r]/3); 		//결과: 정수
			System.out.printf("%d\t%.1f", student[r], student[r] / 3.0); // 결과: 실수
		}
		
		System.out.println();
		for (int i = 0; i < 45; i++)
			System.out.print("=");

		System.out.print("\n" + "총점" + "\t");
		for (c = 0; c < 3; c++)
			System.out.print(subject[c] + "\t"); // 과목 총점 출력

	}
}

		
	

