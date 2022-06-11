package ex06_1_array;


public class ArrayExample9_2차원배열7 {

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
		for(int i =0; i<student.length; i++) {
			for (int j = 0; j<subject.length; j++) {
				student[i] += score[i][j];
			}
			System.out.println(name[i] + "총점:" + student[i]);
		}
		System.out.println("==================");
		for (int j =0; j<subject.length;j++) {
		for(int i =0; i<student.length; i++) {
			subject[j] += score[i][j];
		}
		System.out.println(sub_name[j] + "총점 : " + subject[j]);
		
	}
}
}