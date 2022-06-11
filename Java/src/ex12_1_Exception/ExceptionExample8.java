//상속 관계에 있는 두 종류의 Exception을 처리하는 try~catch문
//예외 처리 순서는 자식에서 부모순으로 작성
//FileNotFoundException-> IOException
//이 중 발생한 예외의 종류와 일치하는 단 한 개의 catch블럭만 수행한다.
package ex12_1_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일을 읽어들여라
		try {
			FileReader reader = new FileReader("some.txt");//>>some.txt파일을 찾는다.
			reader.close();//자원을 썼으면 반납한다. 도중에 에러가 나면 수행되지 않음
			//반드시 수행되도록 finally에 넣어준다.
		} catch(FileNotFoundException e) {//자식부터 온다.
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}
		
	}

}
