package ex18_3_FileInputStream_FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamExample1 {

	public static void main(String[] args) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("output1.dat");
			byte arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
					10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
			
			//파일을 반복해서 byte 타입 데이터를 쓴다.
			for(int cnt =0; cnt<arr.length; cnt++)
				out.write(arr[cnt]);
			}
		catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				out.close();//파일을 닫는다.
				System.out.println("파일을 저장했습니다.");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
// 생성된 output1.dat 파일을 보면 읽을 수 없는 문자로 되어 있다. 
//작성한 것은 File InputStream을 통해 읽을 수 있다.