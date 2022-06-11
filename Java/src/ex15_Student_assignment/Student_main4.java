//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex15_Student_assignment;
public class Student_main4 {
	public static void main(String args[]) {
		Student[] students = { 
				   new Student("강호동", 85, 60, 70),
	               new Student("이승기", 90, 95, 80), 
	               new Student("유재석", 75, 80, 100), 
	               new Student("하하", 80, 70, 95), 
	               new Student("이광수", 100, 65, 80) };
		
		printStudent(students);
		
	}

	static void printStudent(Student[] objs) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student obj : objs) {
			System.out.println(obj.toString());
		}
		for(int j=0;j<45;j++){
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.println(Student.korTotal+"\t"
		                  +Student.engTotal+"\t"
				          +Student.mathTotal);		
	}
}




