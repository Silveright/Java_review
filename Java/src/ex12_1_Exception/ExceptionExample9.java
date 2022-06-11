//상속 관계에 있는 두 종류의 Exception을 처리하는 try~catch문
//예외 처리 순서는 자식에서 부모순으로 작성
//FileNotFoundException-> IOException
//이 중 발생한 예외의 종류와 일치하는 단 한 개의 catch블럭만 수행한다.
package ex12_1_Exception;

import java.io.*;


public class ExceptionExample9 {
	public static void main(String[] args) {
		// 파일을 읽어들여라
		FileReader reader = null;// >>some.txt파일을 찾는다.
		try {
			reader = new FileReader("some.txt");// 객체가 제대로 생성되어야만 주소값이 대입됨 파일이 없어 생성 안됨
		} catch (IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		} finally {

			try {
				if (reader != null)
					reader.close();

			} catch (IOException e) {
				System.err.println("파일 닫는 중 오류 발생");
			} // 자원을 썼으면 반납한다. 도중에 에러가 나면 수행되지 않음
				// 반드시 수행되도록 finally에 넣어준다.
		}
	}
}
