//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex08_Student;
public class Student_main4 {
	public static void main(String args[]) {
		Student obj1 = new Student ("��ȣ��" , 85, 60, 70);
		Student obj2 = new Student ("�̽±�" , 90, 95, 80);
		Student obj3 = new Student ("���缮" , 75, 80 , 100);
		Student obj4 = new Student ("����" , 80 , 70, 95);
		Student obj5 = new Student ("�̱���" , 100 , 65, 80) ;
	
			// ����ϱ�
			System.out.println("===============   �л���   /  ���� �������ϱ�  ==========");
			System.out.println("�̸�\t����\t����\t����\t����\t���");
			
			printInfo(obj1);
			printInfo(obj2);
			printInfo(obj3);
			printInfo(obj4);
			printInfo(obj5);

			for (int j = 0; j < 45; j++) {
				System.out.print("=");
			}
			System.out.print("\n����\t");
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




