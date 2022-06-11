//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex08_Student;
public class Student_main {
	public static void main(String args[]) {
		Student[] students = {new Student ("강호동" , 85, 60, 70),
				  new Student ("이승기" , 90, 95, 80),
				  new Student ("유재석" , 75, 80 , 100),
				  new Student ("하하" , 80 , 70, 95),
				  new Student ("이광수" , 100 , 65, 80) };
	
			// 출력하기
			System.out.println("===============   학생별   /  과목별 총점구하기  ==========");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

			sort(students);
			printInfo(students);

			for (int j = 0; j < 51; j++) {
				System.out.print("=");
			}

			System.out.print("\n총점\t");
			System.out.print(Student.korTotal + "\t");
			System.out.print(Student.engTotal + "\t");
			System.out.print(Student.mathTotal + "\n");
		}

		static void sort(Student[] students) {
			Student imsi;
			for (int i = 0; i < students.length - 1; i++) {
				for (int j = i + 1; j < students.length; j++)
					if (students[i].getTotal() < students[j].getTotal()) {
						imsi = students[i];
						students[i] = students[j];
						students[j] = imsi;
				}
			}
		}

		static void printInfo(Student[] students) {
			for (Student s : students) {
				System.out.print(s.name + "\t" + s.kor + "\t" + s.eng + "\t" + s.math + "\t" + s.getTotal() + "\t");
				System.out.printf("%.1f\n", s.getavrage());
			}
		}
	}
