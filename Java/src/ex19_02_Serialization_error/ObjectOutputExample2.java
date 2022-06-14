package ex19_02_Serialization_error;
import java.io.*;
public class ObjectOutputExample2 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
			out.writeObject(new GoodsStock("70101", 100));
			out.writeObject(new GoodsStock("70102", 50));
			out.writeObject(new GoodsStock("70103", 200));
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
//java.io.NotSerializableException: ex19_02_Serialization_error.GoodsStock
//at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1185)
//at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:349)
//at ex19_02_Serialization_error.ObjectOutputExample2.main(ObjectOutputExample2.java:8)
//���Ϸ� ����� �� �����ϴ�.