package ex18_2_FileWriter;

import java.io.*;

public class FileReaderExample_gugudan {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("src/ex18_2_FileWriter/gugudan.txt");
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
									//IOexception과 NullPointerException처리 문장
				System.out.println("Exception");
			}
		}
	}
}
