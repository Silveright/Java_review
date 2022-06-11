package ex06_1_array;


public class ArrayExample9_2차원배열5 {

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
		int Ktotal =0;
		int Mtotal =0;
		int Etotal =0;
		for(int i = 0; i<score.length; i++) {
			int sum =0;
			float avr =0f;
			
			 Ktotal += score[i][0];
			 Mtotal += score[i][1];
			 Etotal += score[i][2];
			
			 for(int j =0; j<score[i].length; j++) {
				 sum += score[i][j];
				 System.out.printf("%5d", score[i][j]);
			 }
		avr= sum/(float)score[i].length;
		System.out.printf("%5d %5.1f%n", sum,avr);
		
		
		}
		System.out.println("==========================");
		System.out.printf("총점:%3d %4d%n", Ktotal,Mtotal,Etotal);
		
//		
//		int[] subject=new int[3]; //과목별 총점을 저장할 변수
//		int[] student=new int[5]; //학생별 총점을 저장할 변수
//		  
		  
		 }
		}


//for(int i =0; i<arr.length; i++) {
//	System.out.println("arr[" + i + "]=" + arr[i]);
//	sum+=arr[i];
//}
	



//for (String num : arr[0]) {
//	System.out.println(num);
//}
//System.out.println("=======================");
//
//for (String[] num : arr) {
//	for (String n : num) {
//		System.out.printf("%s\t",n);
//		System.out.println();
