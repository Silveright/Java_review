package ex19_assignment;
import java.io.*;
import java.util.*;
public class ObjectOutputExample2_1 {
	
	public static void main(String[] args) {
		ArrayList<Student2> as = new ArrayList<Student2>();
		write(as);

	}

	private static void write(ArrayList<Student2> as) {
	
		BufferedReader br = null;
		ObjectOutputStream out = null;
		try {
			br = new BufferedReader(new FileReader("jumsu.txt"));
			out = new ObjectOutputStream(new FileOutputStream("jumsu2.txt"));
			while (true) {
				String str = br.readLine();// ���Ϸκ��� �� �྿ �д´�.
				if (str == null)
					break;
				
				String[] li = str.split(" ");
				Student2 s = new Student2(li[0], Integer.parseInt(li[1]), Integer.parseInt(li[2]),
						Integer.parseInt(li[3]));
				as.add(s);
				
				System.out.println(s);
				for (int i = 0; i < as.size(); i++) {
					out.writeObject(as.get(i));// ��ü�� ����ȭ
					}	
				}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				System.out.println("���� �ݴ� �� ����");
			}
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
