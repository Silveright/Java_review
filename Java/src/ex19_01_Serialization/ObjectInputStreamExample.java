package ex19_01_Serialization;

import java.io.*;
import java.util.*;

public class ObjectInputStreamExample {
	public static void main(String[] args) {
//파일을 연다.
	/*ObjectInputStream 클래스는 스트림 형태로 읽어들인 객체를 프로그램에서 
	 * 사용할 수 있는 객체로 만드는 기능의 클래스이다.
	 * 이 클레스를 FileInputStream 클래스와 함께 사용하려면
	 * 파일에 저장된 객체를 프로그램에서 다시 읽어 사용할 수 있다.
	 * FileInputStream 객체를 생성해
	 * ObjectInputStream생성자 파라미터로 넘겨주어야 한다.
	 * 
	 */
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while(true) {//이전과 다른 방식 (모든 객체를 읽게되면 예외가 발생하게 된다>예외 처리로 끝마칠 수 있음)
				
				//객체를 역직렬화하는 부분(스트림으로부터 데이터를 읽어 객체를 만든다.)
				//readObject 메서드: 입력된 스트림으로부터 객체를 만들어 리턴하는 메서드로 리턴타입은 Object
				//리턴 타입 Object를 원래의 클래스 타입으로 사용하기 위해 캐스트 연산을 해야한다.
				//readObject()가 Object형이므로 GregorianCalendar타입으로 형변환한다.
				GregorianCalendar calendar = (GregorianCalendar) in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH)+1;
				int date = calendar.get(Calendar.DATE);
				System.out.println(year + "/" +month + "/" + date);
			}
		}catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(EOFException eofe) {//파일로부터 더 이상 읽을 객체가 없을 때 발생하는 익셉션 처리
			System.out.println("끝");
		}catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}finally {
			try {
				in.close();//파일을 닫는다.
			}catch (Exception e) {
				System.out.println("파일 닫는 중 오류");
			}
		}
	}
}
