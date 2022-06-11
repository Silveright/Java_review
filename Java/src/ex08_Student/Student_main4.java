//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex08_Student;
public class Student_main4 {
	public static void main(String args[]) {
		Student obj1 = new Student ("강호동" , 85, 60, 70);
		Student obj2 = new Student ("이승기" , 90, 95, 80);
		Student obj3 = new Student ("유재석" , 75, 80 , 100);
		Student obj4 = new Student ("하하" , 80 , 70, 95);
		Student obj5 = new Student ("이광수" , 100 , 65, 80) ;
	
			// 출력하기
			System.out.println("===============   학생별   /  과목별 총점구하기  ==========");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			
			printInfo(obj1);
			printInfo(obj2);
			printInfo(obj3);
			printInfo(obj4);
			printInfo(obj5);

			for (int j = 0; j < 45; j++) {
				System.out.print("=");
			}
			System.out.print("\n총점\t");
			System.out.print(Student.korTotal + "\t");
			System.out.print(Student.engTotal + "\t");
			System.out.print(Student.mathTotal + "\n");
		}

static void printInfo(Student obj) {
	{
			System.out.print(obj.name+"\t"+obj.kor+"\t"+obj.eng+"\t"+obj.math+"\t"+ obj.getTotal() +"\t");
			System.out.printf("%.1f\n", obj.getavrage());
		}
	}
}




