package ex19_03_Serializable_interface;

import java.io.*;

public class ObjectInputStreamExample2 {
	public static void main(String[] args) {

		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			while(true) {
				GoodsStock gs = (GoodsStock) in.readObject();
				System.out.println(gs.toString());
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
