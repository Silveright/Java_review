package ex18_1_FileReader;

import java.io.*;

public class FileReaderExample2_2 {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("poem2.txt");
			//
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
		} finally {
			try {
				reader.close();
			} catch (Exception e) {//close 메서드가 발생하는 예외 처리
									//IOexception과 NullPointerException처리 문장(Exception이 부모기 때문에 모두 처리 가능하다.)
				System.out.println("Exception");
			}
		}
	}
}
