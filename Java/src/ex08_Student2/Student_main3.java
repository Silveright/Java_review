//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal�ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ�

package ex08_Student2;


public class Student_main3 {
	public static void main(String args[]) {
		Student2[] students = {new Student2 ("��ȣ��" , 85, 60, 70),
				  new Student2 ("�̽±�" , 90, 95, 80),
				  new Student2 ("���缮" , 75, 80 , 100),
				  new Student2 ("����" , 80 , 70, 95),
				  new Student2 ("�̱���" , 100 , 65, 80) };
	
			// ����ϱ�
		
			
			printInfo(students);


		}


static void printInfo(Student2[] students) {
	// TODO Auto-generated method stub
	System.out.println("===============   �л���   /  ���� �������ϱ�  ==========");
	System.out.println("�̸�\t����\t����\t����\t����\t���");
	for(Student2 s : students) {
//		
		System.out.print(s.name+"\t"+s.kor+"\t"+s.eng+"\t"+s.math+"\t"+ s.getTotal() +"\t");
		System.out.printf("%.1f\n", s.getavrage());
		
	}
	for (int j = 0; j < 51; j++) {
		System.out.print("=");
	}
	System.out.print("\n����\t");
	System.out.print(Student2.korTotal + "\t");
	System.out.print(Student2.engTotal + "\t");
	System.out.print(Student2.mathTotal + "\n");
	}
} 



