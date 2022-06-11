package assignment_220610;

import java.util.ArrayList;
import java.util.Scanner;


public class jumsu {

	public static void main(String[] args) {
		ArrayList<Student> as = new ArrayList<Student>();
		
		input(as);
		Student.sort(as);
		print(as);
	}

	private static void input(ArrayList<Student> as) {
		
		Scanner sc = new Scanner(System.in);
		for (;;) {

			System.out.println("학생이름을 입력하세요");
			String name = sc.nextLine();

			System.out.println("국어 점수를 입력하세요");
			int kor = isNumber(sc);

			System.out.println("수학 점수를 입력하세요");
			int mat = isNumber(sc);
			System.out.println("영어 점수를 입력하세요");
			int eng = isNumber(sc);
			as.add(new Student(name, kor, eng, mat));
			System.out.println("계속입력하시겠습니까?(q 또는 Q 이면 종료 그외는 계속)");
			String tmp = sc.nextLine();
			if (tmp.equals("Q") || tmp.equals("q"))
				break;

		}
		
	}
	static int isNumber(Scanner sc) {
		int num;
		
		while(true) {
			try {
			    num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("숫자로 다시 입력하세요>");
			}
		}
		return num;
	}
	
	static void sort(ArrayList<Student> students) {
		Student imsi;
		for (int i = 0; i < students.size()-1 ; i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).getTotal() < students.get(j).getTotal()) {
					imsi = students.get(i);
					students.set(i,students.get(j));
					students.set(j,imsi);
					
					}
				}
		}
}
	static void print(ArrayList<Student> students) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student obj : students) {
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
