package ex19_04_Serialization_transient_no;

import java.io.*;

public class ObjectInputStreamExample2 {
	public static void main(String[] args) {
		//직렬화 대상이 아닌 게시물의 수는 0이된다.
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while(true) {
				BBSItem bi = (BBSItem)in.readObject();
				System.out.println(bi.toString());
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
