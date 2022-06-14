package ex19_04_Serialization_transient;

import java.io.*;

public class ObjectInputStreamExample2 {
	public static void main(String[] args) {
//������ ����.
	/*ObjectInputStream Ŭ������ ��Ʈ�� ���·� �о���� ��ü�� ���α׷����� 
	 * ����� �� �ִ� ��ü�� ����� ����� Ŭ�����̴�.
	 * �� Ŭ������ FileInputStream Ŭ������ �Բ� ����Ϸ���
	 * ���Ͽ� ����� ��ü�� ���α׷����� �ٽ� �о� ����� �� �ֵ�.
	 * FileInputStream ��ü�� ������
	 * ObjectInputStream������ �Ķ���ͷ� �Ѱ��־�� �Ѵ�.
	 * 
	 */
		//����ȭ ����� �ƴ� �Խù��� ���� 0�̵ȴ�.
		//transient: ����ȭ ��󿡼� ���ܵȴ�. (null���� ������ ��)
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while(true) {
				//��ü�� ������ȭ�ϴ� �κ�
				
				BBSItem bi = (BBSItem) in.readObject();
				
				System.out.println( bi.toString());
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