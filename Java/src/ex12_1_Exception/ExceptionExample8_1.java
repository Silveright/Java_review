//상속 관계에 있는 두 종류의 Exception을 처리하는 try~catch문
//예외 처리 순서는 자식에서 부모순으로 작성
//FileNotFoundException-> IOException
//이 중 발생한 예외의 종류와 일치하는 단 한 개의 catch블럭만 수행한다.
package ex12_1_Exception;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample8_1 {

	public static void main(String[] args) {
		//파일을 읽어들여라
		try {
			FileReader reader = new FileReader("some.txt");//>>some.txt파일을 찾는다.
			reader.close();
		} catch(IOException e) {
			System.err.println("입출력 에러가 발생했습니다."); //in,out,err
		} 
		//원래 발생한 오류는 FileNotFoundException
		//이미 부모 IOException에서 자식 FileNotFoundException 도 처리할 수 있어 이 부분이 필요없어진다.
		//자바의 다형성 때문에 발생한 오류(부모는 자식을 품는다.)>> exception도 상속관계가 있다.
		//Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
		
		
//		catch(FileNotFoundException e) {//자식부터 온다.
//			System.out.println("파일을 찾을 수 없습니다.");
//		}
		
	}

}
