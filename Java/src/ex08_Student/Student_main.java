//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex08_Student;
public class Student_main {
	public static void main(String args[]) {
		Student[] students = {new Student ("��ȣ��" , 85, 60, 70),
				  new Student ("�̽±�" , 90, 95, 80),
				  new Student ("���缮" , 75, 80 , 100),
				  new Student ("����" , 80 , 70, 95),
				  new Student ("�̱���" , 100 , 65, 80) };
	
			// ����ϱ�
			System.out.println("===============   �л���   /  ���� �������ϱ�  ==========");
			System.out.println("�̸�\t����\t����\t����\t����\t���");

			sort(students);
			printInfo(students);

			for (int j = 0; j < 51; j++) {
				System.out.print("=");
			}

			System.out.print("\n����\t");
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
