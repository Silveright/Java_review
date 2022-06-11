package ex07_object;

public class Student_make_array {
	public static void main(String args[]) {
		
	
		Student[] students = {new Student ("강호동" , 85, 60, 70),
							  new Student ("이승기" , 90, 95, 80),
							  new Student ("유재석" , 75, 80 , 100),
							  new Student ("하하" , 80 , 70, 95),
							  new Student ("이광수" , 100 , 65, 80) }; //1차원 배열
	
		printInfo(students);
		
	}//main
		
		

	 static void printInfo(Student[] objs) {
		 //Student[] objs = {Student 배열이 넘어옴}
		
		 int total[]  = new int[3];
		
		 System.out.println("===========학생별 / 과목별 총점 구하기===========");
		 System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		
		for(Student obj : objs) {

			System.out.print(obj.name+"\t"+obj.kor+"\t"
					+obj.eng+"\t"+obj.math+"\t"+ obj.getTotal() +"\t");
			System.out.printf("%.1f\n", obj.getavrage());
//			System.out.println(obj); //주소값만 반환
			total[0] += obj.kor;
			total[1] += obj.eng;
			total[2] += obj.math;
		}
		
		for (int j =0; j<45; j++) {
			System.out.print("=");
		}
		
		System.out.print("\n" +"총점" + "\t");
		for (int i =0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
		}
	 }
}

	
	
