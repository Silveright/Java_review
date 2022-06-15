package ex19_05_serialVersionUID;

import java.io.*;

public class ObjectInputStreamExample2 {
	public static void main(String[] args) {
//������ ����.
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			
				//��ü�� ������ȭ�ϴ� �κ�
				
				Rectangle r = (Rectangle) in.readObject();
				
				System.out.println(r.toString());
//				System.out.println(r);
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}catch(IOException ioe) {
			//����ȭ�� �� ����� Ŭ������ ������ȭ�� ������� Ŭ������ ������ �ٸ��� �߻��ϴ� �����޼��� ���
			System.out.println(ioe.getMessage());//local class incompatible:
		}catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		}finally {
			try {
				in.close();//������ �ݴ´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
