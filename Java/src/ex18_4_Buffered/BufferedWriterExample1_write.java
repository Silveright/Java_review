package ex18_4_Buffered;
import java.io.*;
public class BufferedWriterExample1_write {

	public static void main(String[] args) {
		String message = "하하입니다.\n오늘도 화이팅";
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("src/ex18_4_Buffered/output2.dat"));
			writer.write(message);
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch (IOException ioe) {//Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {//파일 닫는 명령문을 에러와 상관없이 처리
			try {
				writer.close();//파일 닫는 명령문
			}catch(Exception e) {//close메서드가 발생하는 예외 처리
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}
}
