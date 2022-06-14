package ex19_01_Serialization;
import java.io.*;
import java.util.*;
public class ObjectOutputExample {
//��ü�� ����ȭ�ϴ� ���α׷�
//����ȭ: ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���� ��ü�� ��Ʈ������ ����� �۾��� �ʿ��ϴ�.
//�̷� �۾��� �ڹٿ��� ��ü�� ����ȭ(serialization)�̶�� �Ѵ�.
	public static void main(String[] args) {
		//������ ����.
		//ObjectOutputStream Ŭ������ ��ü�� ��Ʈ������ ����� ����ϴ� ����� �ִ� Ŭ����
		//�� Ŭ�������� �����͸� ���Ͽ� �����ϴ� ����� ����
		//FileOutputstream Ŭ������ �Բ� ����ؾ� �Ѵ�.
		//FileOutputStream ��ü�� �����ؼ�
		//ObjectOutputStream Ŭ������ ������ �Ķ���ͷ� �Ѱ��־���Ѵ�.
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output.dat"));
			
			//��ü�� ����ȭ �ϴ� �κ�(��ü�� �����ͽ�Ʈ������ �����. ��ü�� ����� �����͸� ��Ʈ���� �������� �������� �����ͷ� ��ȯ�ϴ� ���� �ǹ��Ѵ�.)
			//writeObject �޼���: �Ķ���ͷ� �Ѱ��� ��ü�� ��Ʈ������ ���� ����ϴ� �޼���
			//�Ķ���ͷ� �Ѱ��� ��ü�� ���Ͽ� ����ȴ�.
			//GregorianCalendar ��ü�� ������ ���Ͽ� ����.
			out.writeObject(new GregorianCalendar(2019,0,14));
			out.writeObject(new GregorianCalendar(2019,0,15));
			out.writeObject(new GregorianCalendar(2019,0,16));
			//� Ŭ������ ����� � ��ü�� ��Ʈ������ ���� ����� ������, ����� �����ʹ� ��������(������ ��ü�� �����Ͱ� �������� �� ��.)
		
		}catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		finally {
			try {
				out.close();
			}
			catch(Exception e) {
				System.out.println("������ �ݴ� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
