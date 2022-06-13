package ex18_1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample4_try_with_resource {

	public static void main(String[] args) {
		char arr[] = new char[64];//파일에 있는 문자를 담을 char배열
		/*1.try-with-resource문으로 try() 괄호 안에 선언된 자원은
		 *  try문이 끝날 때 자동으로 colse()메서드를 호출한다.
		 *  
		 *2. try-with-resource문에 의해 자동으로 객체의 close()가 호출될 수 있으려면
		 *	 클래스가 AutoCloseable이라는 인터페이스를 구현한 것이어야 한다.
		 *형식) try() {
		 * .....
		 * } catch(){
		 * 
		 * } finally{}
		 * 
		 */
		try(FileReader reader = new FileReader("거위의 꿈.txt");
				) {
			//
			while(true) {
				//Returns: The number of characters read
				//arr의 배열 크기만큼 문자를 읽어 arr에 저장 후 읽은 개수 반환
				int num = reader.read(arr);//반환형 정수
				if(num == -1)//더 이상 읽을 문자가 없는 경우 -1 리턴 
					break;
				System.out.println(new String(arr,0,num));
			}//while end
		}//try end 
		catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일 읽을 수 없음.");
		} finally {
			System.out.println("final입니다.");
		}
	}
}
