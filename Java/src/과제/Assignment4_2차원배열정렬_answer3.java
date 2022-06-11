package 과제;


public class Assignment4_2차원배열정렬_answer3 {

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
		int[] subject = new int[3];
		int[] student = new int[5];
		
		int r,c;
		
		System.out.println();
		for (int i =0; i<10; i++)
			System.out.print("=");
		
		System.out.print("학생별  /  과목별 총점 구하기  ");
		for(int i=0; i<10; i++)
			System.out.print("=");
		
		System.out.print("\n\t");
		for (c=0; c<3; c++)
			System.out.print(sub_name[c]+"\t");
		
		System.out.print("총점\t평균");
		
		for (r =0; r<5; r++) {
			System.out.print("\n" + name[r] + "\t");
			
			for (c=0; c<3; c++) {
				System.out.print(score[r][c] + "\t");
				student[r] += score[r][c]; 
				subject[c] += score[r][c]; 
			}
			System.out.printf("%d\t%.1f" , student[r], student[r]/3.0);
//			System.out.print(student[r] + "\t" + student[r]/3);
		}
	
		System.out.println();
		for (int i =0; i<45; i++)
			System.out.print("=");
		
		System.out.print("\n" +"총점" + "\t");
		for (c=0; c<3; c++)
			System.out.print(subject[c] + "\t");
	}
	}


		
	

