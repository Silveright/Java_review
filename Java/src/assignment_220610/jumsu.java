package assignment_220610;

import java.util.ArrayList;
import java.util.Scanner;


public class jumsu {

	public static void main(String[] args) {
		ArrayList<Student> as = new ArrayList<Student>();
		
		input(as);
		Student.sort(as);
		print(as);
	}

	private static void input(ArrayList<Student> as) {
		
		Scanner sc = new Scanner(System.in);
		for (;;) {

			System.out.println("�л��̸��� �Է��ϼ���");
			String name = sc.nextLine();

			System.out.println("���� ������ �Է��ϼ���");
			int kor = isNumber(sc);

			System.out.println("���� ������ �Է��ϼ���");
			int mat = isNumber(sc);
			System.out.println("���� ������ �Է��ϼ���");
			int eng = isNumber(sc);
			as.add(new Student(name, kor, eng, mat));
			System.out.println("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ���� �׿ܴ� ���)");
			String tmp = sc.nextLine();
			if (tmp.equals("Q") || tmp.equals("q"))
				break;

		}
		
	}
	static int isNumber(Scanner sc) {
		int num;
		
		while(true) {
			try {
			    num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
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
