package assignment_220610;

import java.util.ArrayList;
import java.util.Scanner;


public class jumsu3 {

	public static void main(String[] args) {
		ArrayList<Student> as = new ArrayList<Student>();
		
		input(as);
		Student.sort(as);
		print(as);
	}

	private static void input(ArrayList<Student> as) {
		String pandan ="";
		String name;
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		while(!pandan.equalsIgnoreCase("q")) {

			System.out.print("학생이름을 입력하세요");
			name = sc.nextLine();

			System.out.print("국어 점수를 입력하세요");
			kor = isNumber(sc,0,100);//점수 범위 설정

			System.out.print("수학 점수를 입력하세요");
			math = isNumber(sc,0,100);
			
			System.out.print("영어 점수를 입력하세요");
			eng = isNumber(sc,0,100);
			
			Student s = new Student(name,kor,math,eng);
			as.add(s);
			//as.add(new Student(name,kor,math,eng)); 객체가 생성되며 주소값이 들어간다.
			
			System.out.print("계속입력하시겠습니까?(q 또는 Q 이면 종료 그외는 계속)");
			pandan = sc.nextLine();
		}sc.close();
		
	}
	static int isNumber(Scanner sc, int min, int max) {
		int num;
		
		while(true) {
			
			try {
			    num = Integer.parseInt(sc.nextLine());
				if(!(min<=num&& max>=num)) {
					System.out.println("잘못된 점수입력입니다.(0~100점 초과) 다시 입력>");
					continue;
				}
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
