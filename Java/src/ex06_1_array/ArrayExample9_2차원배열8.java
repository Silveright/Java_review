package ex06_1_array;


public class ArrayExample9_2차원배열8 {

	public static void main(String[] args) {
		
		String name[] = {  "강호동", "이승기", "유재석", "하하" , "이광수" };
		String sub_name[] =	 { "국어", "수학", "영어" };
						
		int [][] score = { {85, 60, 70},
							{90, 95, 80},
							{75, 80, 100},
							{80,70,95},
							{100,65,80}
							};
		System.out.println("=======학생별 / 과목별 총점구하기======");
		int[] subject=new int[3]; //과목별 총점을 저장할 변수
		int[] student=new int[5]; //학생별 총점을 저장할 변수
		int r,c;
		for(c =0; c<subject.length; c++) {
			for (r = 0; r<student.length; r++) {
				student[c] += score[r][c];
			}
			System.out.print (+student[c]+"\t");
		}
		
		
	}
}
