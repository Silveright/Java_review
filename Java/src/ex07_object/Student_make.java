package ex07_object;

public class Student_make {
	public static void main(String args[]) {
		String name[] = { "��ȣ��", "�̽±�", "���缮", "����", "�̱���" };
		String sub_name[] = { "����", "����", "����" };

		int[][] score = { 
				{ 85, 60, 70 }, 
				{ 90, 95, 80 }, 
				{ 75, 80, 100 }, 
				{ 80, 70, 95 }, 
				{ 100, 65, 80 } 
		};
		int[] subject = new int[3];
		int[] student = new int[5];
		int c ,r;
		for (r =0; r<score.length; r++) {
			
		for (c=0; c<score[r].length; c++) {
			
			student[r] += score[r][c]; 
			subject[c] += score[r][c]; 
		}		 
	}
		System.out.println("===========�л��� / ���� ���� ���ϱ�===========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		Student s = new Student ("��ȣ��" , 85, 60, 70);
		 s.getTotal();
		 s.getavrage();
		 print(s);
		 
		 Student s1 = new Student ("�̽±�" , 90, 95, 80);
		 s1.getTotal();
		 s1.getavrage();
		 print(s1);
		 
		 Student s2 = new Student ("���缮" , 75, 80 , 100);
		 s2.getTotal();
		 s2.getavrage();
		 print(s2);

		 Student s3 = new Student ("����" , 80 , 70, 95);
		 s3.getTotal();
		 s3.getavrage();
		 print(s3);

		 Student s4 = new Student ("�̱���" , 100 , 65, 80);
		 s4.getTotal();
		 s4.getavrage();
		 print(s4);
		 
		 System.out.print("==========================================");
		 System.out.print("\n" +"����" + "\t");
			for (c=0; c<3; c++)
				System.out.print(subject[c] + "\t");
		 
	}
	
	public static void print(Student s) {
		System.out.print(s.name+"\t");
		System.out.printf("%d\t %d\t %d\t", s.kor, s.eng, s.math);
		System.out.printf("%d\t",s.getTotal());
		System.out.println(s.getavrage());
//		System.out.printf("%d\t%.1f" , s.getavrage()); �� �̷��� ����ϸ� ������ �߳���...?
	}
} 
	
	
