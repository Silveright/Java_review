//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex15_1_ArrayList;

import java.util.ArrayList;

public class Student_main4 {
	public static void main(String args[]) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("��ȣ��", 85, 60, 70));
		students.add(new Student("�̽±�", 90, 95, 80));
		students.add(new Student("���缮", 75, 80, 100));
		students.add(new Student("����", 80, 70, 95));
		students.add(new Student("�̱���", 100, 65, 80));

//�迭 �״�� �ΰ� 		
//		ArrayList<Student> students = new ArrayList<>();
//		for(Student s : students) {
//			students.add(s);
//		}

		
		Student.sort(students);
		printStudent(students);
		
	}

	static void printStudent(ArrayList<Student> students) {
		System.out.print("==========    �л���   /  ���� �������ϱ�  ==========\n\t");
		System.out.print("����\t����\t����\t����\t���\n");
		for (Student obj : students) {
			System.out.println(obj.toString());
		}
		for(int j=0;j<45;j++){
			System.out.print("=");
		}
		System.out.print("\n����\t");
		System.out.println(Student.korTotal+"\t"
		                  +Student.engTotal+"\t"
				          +Student.mathTotal);		
	}
}




