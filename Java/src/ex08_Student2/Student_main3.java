//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex08_Student2;


public class Student_main3 {
	public static void main(String args[]) {
		Student2[] students = {new Student2 ("강호동" , 85, 60, 70),
				  new Student2 ("이승기" , 90, 95, 80),
				  new Student2 ("유재석" , 75, 80 , 100),
				  new Student2 ("하하" , 80 , 70, 95),
				  new Student2 ("이광수" , 100 , 65, 80) };
	
			// 출력하기
		
			
			printInfo(students);


		}


static void printInfo(Student2[] students) {
	// TODO Auto-generated method stub
	System.out.println("===============   학생별   /  과목별 총점구하기  ==========");
	System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	for(Student2 s : students) {
//		
		System.out.print(s.name+"\t"+s.kor+"\t"+s.eng+"\t"+s.math+"\t"+ s.getTotal() +"\t");
		System.out.printf("%.1f\n", s.getavrage());
		
	}
	for (int j = 0; j < 51; j++) {
		System.out.print("=");
	}
	System.out.print("\n총점\t");
	System.out.print(Student2.korTotal + "\t");
	System.out.print(Student2.engTotal + "\t");
	System.out.print(Student2.mathTotal + "\n");
	}
} 



