package ex18_4_Buffered;
import java.io.*;
public class BufferedReaderExample1_read {

	public static void main(String[] args) {
		BufferedReader reader = null;
		char arr[] = new char[64];
		int num = -1;
		try {
			reader = new BufferedReader(
					new FileReader("src/ex18_4_Buffered/output2.dat"));
			while((num = reader.read(arr)) != -1) {
				System.out.println(new String(arr,0,num));
			}
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch ( IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		finally {
			try {
				reader.close();
			}
			catch(Exception e ) {
				System.out.println(e.getStackTrace());
			}
		}
	}
}
