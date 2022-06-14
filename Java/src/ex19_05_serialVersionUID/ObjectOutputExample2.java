package ex19_05_serialVersionUID;
import java.io.*;
public class ObjectOutputExample2 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(10,10);
			//�����ڿ� ���� ������ ����Ǿ���.
			System.out.println(obj);
			out.writeObject(obj);//��ü�� ����ȭ
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		finally {
			try {
				out.close();
			}
			catch(Exception e) {
				System.out.println("������ �ݴ� �� ������ �߻��߽��ϴ�.");
				System.out.println(e.getMessage());
			}
		}
	}
}
