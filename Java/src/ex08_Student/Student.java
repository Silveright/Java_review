//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex08_Student;

public class Student {
	String name;
	int kor,eng,math;
	
	static int korTotal, mathTotal, engTotal;
	
	public Student(String name, int kor, int eng, int math) {
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
} 

