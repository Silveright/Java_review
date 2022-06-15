package ex19_01_Serialization;

import java.io.*;
import java.util.*;

public class ObjectInputStreamExample {
	public static void main(String[] args) {
//������ ����.
	/*ObjectInputStream Ŭ������ ��Ʈ�� ���·� �о���� ��ü�� ���α׷����� 
	 * ����� �� �ִ� ��ü�� ����� ����� Ŭ�����̴�.
	 * �� Ŭ������ FileInputStream Ŭ������ �Բ� ����Ϸ���
	 * ���Ͽ� ����� ��ü�� ���α׷����� �ٽ� �о� ����� �� �ִ�.
	 * FileInputStream ��ü�� ������
	 * ObjectInputStream������ �Ķ���ͷ� �Ѱ��־�� �Ѵ�.
	 * 
	 */
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while(true) {//������ �ٸ� ��� (��� ��ü�� �аԵǸ� ���ܰ� �߻��ϰ� �ȴ�>���� ó���� ����ĥ �� ����)
				
				//��ü�� ������ȭ�ϴ� �κ�(��Ʈ�����κ��� �����͸� �о� ��ü�� �����.)
				//readObject �޼���: �Էµ� ��Ʈ�����κ��� ��ü�� ����� �����ϴ� �޼���� ����Ÿ���� Object
				//���� Ÿ�� Object�� ������ Ŭ���� Ÿ������ ����ϱ� ���� ĳ��Ʈ ������ �ؾ��Ѵ�.
				//readObject()�� Object���̹Ƿ� GregorianCalendarŸ������ ����ȯ�Ѵ�.
				GregorianCalendar calendar = (GregorianCalendar) in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH)+1;
				int date = calendar.get(Calendar.DATE);
				System.out.println(year + "/" +month + "/" + date);
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
