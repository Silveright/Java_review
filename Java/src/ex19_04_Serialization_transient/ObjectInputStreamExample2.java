package ex19_04_Serialization_transient;

import java.io.*;

public class ObjectInputStreamExample2 {
	public static void main(String[] args) {
//파일을 연다.
	/*ObjectInputStream 클래스는 스트림 형태로 읽어들인 객체를 프로그램에서 
	 * 사용할 수 있는 객체로 만드는 기능의 클래스이다.
	 * 이 클레스를 FileInputStream 클래스와 함께 사용하려면
	 * 파일에 저장된 객체를 프로그램에서 다시 읽어 사용할 수 있따.
	 * FileInputStream 객체를 생성해
	 * ObjectInputStream생성자 파라미터로 넘겨주어야 한다.
	 * 
	 */
		//직렬화 대상이 아닌 게시물의 수는 0이된다.
		//transient: 직렬화 대상에서 제외된다. (null값을 가지게 됨)
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while(true) {
				//객체를 역직렬화하는 부분
				
				BBSItem bi = (BBSItem) in.readObject();
				
				System.out.println( bi.toString());
//				System.out.println(bi);
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
