package ex18_1_FileReader;
import java.io.*;
public class FileReaderExample2 {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("poem2.txt");
			//FileReader reader = new FileReader("D:/eclipse-workspace/Java/poem.txt");
			//FileReader reader = new FileReader("D:\\eclipse-workspace\\Java\\poem.txt");
			while(true) {
				int data = reader.read();//반환형 정수
				if(data == -1)//더 이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일 읽을 수 없음.");
		} finally {//파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용한다.
			try {
				reader.close();//파일을 닫는 명령문
				//읽을 파일이 존재하지 않는 파일일 경우 객체가 생성되지 않아 null상태 유지 >>nullpointexception이 발생함 >>처리 필요
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
