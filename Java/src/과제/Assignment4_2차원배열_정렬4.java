package 과제;


public class Assignment4_2차원배열_정렬4 {

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
		int[] student = new int[5];//학생총점
		
	
		System.out.println();
		for (int i =0; i<10; i++)
			System.out.print("=");
		
		System.out.print("학생별  /  과목별 총점 구하기  ");
		for(int i=0; i<10; i++)
			System.out.print("=");
		
		System.out.print("\n\t");
	
		for (int c=0; c<3; c++)
			System.out.print(sub_name[c]+"\t");
		
		System.out.println("총점\t평균");
		
		for (int i =0; i<3; i++) {
			for (int j=0; j<5; j++) {
				student[j]=score[j][i] +student[j];
				subject[i]=score[j][i] +subject[i];
			}
		}
			int rank[] = {1,1,1,1,1};
			for(int i =0; i<5;++i)
				for(int j=0; j<5; ++j) {
					if(student[i]>student[j])
						rank[j]++;
				}
//				
		for (int i =0; i<student.length-1; i++) {
			for (int j = i+1; j<student.length; j++) {
				if(student[i]>student[j]) {
					String imsi_name;
					
					imsi_name =name[i];
					name[i] =name[j];
					name[j]=imsi_name;
					
					int imsi2[] = score[i];
					score[i] = score[j];
					score[j] =imsi2;
					
					int imsi= student[i];
					student[i]=student[j];
					student[j] = imsi;
					
					imsi=rank[i];
					rank[i]=rank[j];
					rank[j]=imsi;
				}
	}
}
for(int i=0;i<5;i++) {
	System.out.print(name[i]+"\t");
	for(int j =0; j<3; j++) {
		System.out.print(score[i][j]+"\t");
	}
	System.out.print(student[i]+"\t" +(student[i]/3.0)+"\t");
	System.out.println();
				}
		
		
		System.out.println("====================================");
		System.out.print("총점"+"\t");
		for(int i=0;i<3;i++) {
			System.out.print(subject[i]+"\t");
		
	}
	}
	}







