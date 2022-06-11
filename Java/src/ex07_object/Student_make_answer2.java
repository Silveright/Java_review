package ex07_object;

public class Student_make_answer2 {
	public static void main(String args[]) {
		Student s = new Student ("강호동" , 85, 60, 70);
		Student s1 = new Student ("이승기" , 90, 95, 80);
		Student s2 = new Student ("유재석" , 75, 80 , 100);
		Student s3 = new Student ("하하" , 80 , 70, 95);
		Student s4 = new Student ("이광수" , 100 , 65, 80);
		
		int total[]  = new int[3];
		System.out.println("===========학생별 / 과목별 총점 구하기===========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		
		printInfo(s);
		printInfo(s1);
		printInfo(s2);
		printInfo(s3);
		printInfo(s4);
		
		
		
		
		total[0] =s.kor + s1.kor + s2.kor + s3.kor + s4.kor;
		total[1]=s.eng+ s1.eng + s2.eng +s3.eng +s4.eng;
		total[2] = s.math +s1.math +s2.math +s3.math +s4.math;
		
		for(int j=0;j<45;j++) {
		 System.out.print("=");
	}
		System.out.print("\n" +"총점" + "\t");
		for (int i =0; i<total.length; i++) 
			System.out.print(total[i]+"\t");
		}
		
	

	 static void printInfo(Student s) {
		// TODO Auto-generated method stub
		System.out.print(s.name+"\t"+s.kor+"\t"+s.eng+"\t"+s.math+"\t"+ s.getTotal() +"\t");
		System.out.printf("%.1f\n", s.getavrage());
		
	}
} 
	
	
