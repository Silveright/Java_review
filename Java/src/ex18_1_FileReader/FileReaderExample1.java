package ex18_1_FileReader;
import java.io.*;
//FileReader 생성자, read method 예외 처리
public class FileReaderExample1 {

	public static void main(String[] args) {
		/*1.파일을 연다
		 * 생성자 인자값으로 파일의 위치를 지정
		 * 지정방법: 상대경로와 절대경로
		 * 1)상대 경로:프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정함
		 * 2)절대 경로:드라이브명부터 차례대로 파일의 위치를 지정
		 * 	예) D:/작업폴더/프로젝트/poem.txt 의미
		 * 
		 */
		
		try {
			FileReader reader;
			reader = new FileReader("poem.txt");
			//절대 경로 지정
			//FileReader reader = 
			//new FileReader("D:/workspace_java/java/poem.txt");
			
			//2.파일을 읽어서 처리한다.
			while(true) {
				//read():파일에 있는 문자 하나를 읽어 리턴하는 메서드
				int data = reader.read();//반환형이 정수
				if(data == -1)//더 이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			//3.파일을 닫는다.
			reader.close();//만약 read() 메서드에서 오류가 발생하면
			//close()메서드가 실행 되지 않은 채 프로그램이 끝난다.>>finally 블럭에 넣어줘야 함.
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException e) {
			System.out.println("파일 읽을 수 없음.");
		}
	}
}
