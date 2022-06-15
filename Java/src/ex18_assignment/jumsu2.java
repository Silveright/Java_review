package ex18_assignment;
import java.io.*;
import java.util.ArrayList;
public class jumsu2 {

	public static void main(String[] args) {
		ArrayList<Student> as = new ArrayList<Student>();

		input(as);
		Student.sort(as);
		print(as);
	}

	private static void input(ArrayList<Student> as) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("jumsu.txt"));
			String str;

			while ((str = br.readLine()) != null) {
				String[] li = str.split(" ");

				Student s = new Student(li[0], Integer.parseInt(li[1]), Integer.parseInt(li[2]),
						Integer.parseInt(li[3]));
				as.add(s);
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void sort(ArrayList<Student> students) {
		Student imsi;
		for (int i = 0; i < students.size() - 1; i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).getTotal() < students.get(j).getTotal()) {
					imsi = students.get(i);
					students.set(i, students.get(j));
					students.set(j, imsi);

				}
			}
		}
	}

	static void print(ArrayList<Student> students) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student obj : students) {
			System.out.println(obj.toString());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.println(Student.korTotal + "\t" + Student.engTotal + "\t" + Student.mathTotal);
	}
}
