package ex19_assignment;

import java.io.*;
import java.util.*;


public class ObjectInputStreamExample2 {
	public static void main(String[] args) {
//������ ����.
		ArrayList<Student> as = new ArrayList<Student>();
		input(as);
	}

	private static void input(ArrayList<Student> as) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("jumsu2.txt"));
			while (true) {

				// ��ü�� ������ȭ�ϴ� �κ�

				Student r = (Student) in.readObject();

				System.out.println(r.toString());
//				System.out.println(r);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (EOFException eofe) {// ���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� �ͼ��� ó��
			System.out.println("��");

		} catch (IOException ioe) {
			// ����ȭ�� �� ����� Ŭ������ ������ȭ�� ������� Ŭ������ ������ �ٸ��� �߻��ϴ� �����޼��� ���
			System.out.println(ioe.getMessage());// local class incompatible:
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				in.close();// ������ �ݴ´�.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
