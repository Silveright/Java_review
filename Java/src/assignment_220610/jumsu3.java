package assignment_220610;

import java.util.ArrayList;
import java.util.Scanner;


public class jumsu3 {

	public static void main(String[] args) {
		ArrayList<Student> as = new ArrayList<Student>();
		
		input(as);
		Student.sort(as);
		print(as);
	}

	private static void input(ArrayList<Student> as) {
		String pandan ="";
		String name;
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		while(!pandan.equalsIgnoreCase("q")) {

			System.out.print("�л��̸��� �Է��ϼ���");
			name = sc.nextLine();

			System.out.print("���� ������ �Է��ϼ���");
			kor = isNumber(sc,0,100);//���� ���� ����

			System.out.print("���� ������ �Է��ϼ���");
			math = isNumber(sc,0,100);
			
			System.out.print("���� ������ �Է��ϼ���");
			eng = isNumber(sc,0,100);
			
			Student s = new Student(name,kor,math,eng);
			as.add(s);
			//as.add(new Student(name,kor,math,eng)); ��ü�� �����Ǹ� �ּҰ��� ����.
			
			System.out.print("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ���� �׿ܴ� ���)");
			pandan = sc.nextLine();
		}sc.close();
		
	}
	static int isNumber(Scanner sc, int min, int max) {
		int num;
		
		while(true) {
			
			try {
			    num = Integer.parseInt(sc.nextLine());
				if(!(min<=num&& max>=num)) {
					System.out.println("�߸��� �����Է��Դϴ�.(0~100�� �ʰ�) �ٽ� �Է�>");
					continue;
				}
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
