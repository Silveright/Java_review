package ex19_04_Serialization_transient_no;
import java.io.*;
public class ObjectOutputExample2 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
			BBSItem obj = new BBSItem("ȫ�浿", "HTA-L2","7�� ����", "������ �� �� �ִ� ���");
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
			}
		}
	}
}
