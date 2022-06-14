package ex19_05_serialVersionUID;
import java.io.*;
public class ObjectOutputExample2 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(10,10);
			//생성자에 써진 값들이 저장되어짐.
			System.out.println(obj);
			out.writeObject(obj);//객체를 직렬화
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				out.close();
			}
			catch(Exception e) {
				System.out.println("파일을 닫는 중 오류가 발생했습니다.");
				System.out.println(e.getMessage());
			}
		}
	}
}
