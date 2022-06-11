package ex07_object;

public class Student_make {
	public static void main(String args[]) {
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
		int c ,r;
		for (r =0; r<score.length; r++) {
			
		for (c=0; c<score[r].length; c++) {
			
			student[r] += score[r][c]; 
			subject[c] += score[r][c]; 
		}		 
	}
		System.out.println("===========학생별 / 과목별 총점 구하기===========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		Student s = new Student ("강호동" , 85, 60, 70);
		 s.getTotal();
		 s.getavrage();
		 print(s);
		 
		 Student s1 = new Student ("이승기" , 90, 95, 80);
		 s1.getTotal();
		 s1.getavrage();
		 print(s1);
		 
		 Student s2 = new Student ("유재석" , 75, 80 , 100);
		 s2.getTotal();
		 s2.getavrage();
		 print(s2);

		 Student s3 = new Student ("하하" , 80 , 70, 95);
		 s3.getTotal();
		 s3.getavrage();
		 print(s3);

		 Student s4 = new Student ("이광수" , 100 , 65, 80);
		 s4.getTotal();
		 s4.getavrage();
		 print(s4);
		 
		 System.out.print("==========================================");
		 System.out.print("\n" +"총점" + "\t");
			for (c=0; c<3; c++)
				System.out.print(subject[c] + "\t");
		 
	}
	
	public static void print(Student s) {
		System.out.print(s.name+"\t");
		System.out.printf("%d\t %d\t %d\t", s.kor, s.eng, s.math);
		System.out.printf("%d\t",s.getTotal());
		System.out.println(s.getavrage());
//		System.out.printf("%d\t%.1f" , s.getavrage()); 왜 이렇게 출력하면 오류가 뜨나요...?
	}
} 
	
	
