package ex19_04_Serialization_transient_no;

import java.io.*;

public class ObjectInputStreamExample2 {
	public static void main(String[] args) {
		//����ȭ ����� �ƴ� �Խù��� ���� 0�̵ȴ�.
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while(true) {
				BBSItem bi = (BBSItem)in.readObject();
				System.out.println(bi.toString());
//				System.out.println(bi);
			}
		}catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}catch(EOFException eofe) {//���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� �ͼ��� ó��
			System.out.println("��");
		}catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		}finally {
			try {
				in.close();//������ �ݴ´�.
			}catch (Exception e) {
				System.out.println("���� �ݴ� �� ����");
			}
		}
	}
}
