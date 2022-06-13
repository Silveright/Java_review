package ex18_1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample3_1 {

	public static void main(String[] args) {
		FileReader reader = null;
		char arr[] = new char[64];//파일에 있는 문자를 담을 char배열
		try {
			reader = new FileReader("거위의 꿈.txt");
			//
			while(true) {
				//Returns: The number of characters read
				//arr의 배열 크기만큼 문자를 읽어 arr에 저장 후 읽은 개수 반환
				int num = reader.read(arr);//반환형 정수
				if(num == -1)//더 이상 읽을 데이터가 없는 경우 -1 리턴 
					break;
				System.out.println(new String(arr,0,num));
			}//while end
		}//try end 
		catch (FileNotFoundException fnfe) {
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
