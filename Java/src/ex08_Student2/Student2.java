//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex08_Student2;

public class Student2 {
	String name;
	int kor,eng,math;
	
	static int korTotal, mathTotal, engTotal;
	
	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		korTotal +=kor;
		mathTotal += math;
		engTotal += eng;
	}

	
	int getTotal() {
		return kor+eng+math;
	} 
	
	float getavrage() {
		return (getTotal()/3f);
	} 


static void sort(Student2[] students) {
	Student2 imsi;
	for (int i = 0; i < students.length - 1; i++) {
		for (int j = i + 1; j < students.length; j++)
			if (students[i].getTotal() < students[j].getTotal()) {
				imsi = students[i];
				students[i] = students[j];
				students[j] = imsi;

			}
	}
}
}