package ex19_assignment;
import java.io.*;
import java.util.*;
public class ObjectOutputExample2 {
	
	public static void main(String[] args) {
		ArrayList<Student> as = new ArrayList<Student>();
		write(as);

	}

	private static void write(ArrayList<Student> as) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("jumsu.txt"));
			while (true) {
				String str = br.readLine();// ���Ϸκ��� �� �྿ �д´�.
				if (str == null)
					break;

				ObjectOutputStream out = null;
				try {
					String[] li = str.split(" ");
					Student s = new Student(li[0], Integer.parseInt(li[1]), Integer.parseInt(li[2]),
							Integer.parseInt(li[3]));
					as.add(s);

					out = new ObjectOutputStream(new FileOutputStream("jumsu2.txt"));
					// �����ڿ� ���� ������ ����Ǿ���.

					System.out.println(s);
					for (int i = 0; i < as.size(); i++) {
						out.writeObject(as.get(i));// ��ü�� ����ȭ
					}
				} catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("���Ϸ� ����� �� �����ϴ�.");
				} finally {
					try {
						out.close();
					} catch (Exception e) {
						System.out.println("������ �ݴ� �� ������ �߻��߽��ϴ�.");
						System.out.println(e.getMessage());
					}
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
		}

	}
}
