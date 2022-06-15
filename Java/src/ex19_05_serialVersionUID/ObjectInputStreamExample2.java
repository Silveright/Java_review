package ex19_05_serialVersionUID;

import java.io.*;

public class ObjectInputStreamExample2 {
	public static void main(String[] args) {
//파일을 연다.
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			
				//객체를 역직렬화하는 부분
				
				Rectangle r = (Rectangle) in.readObject();
				
				System.out.println(r.toString());
//				System.out.println(r);
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException ioe) {
			//직렬화할 때 사용한 클래스와 역직렬화할 때사용한 클래스의 버전이 다를때 발생하는 에러메세지 출력
			System.out.println(ioe.getMessage());//local class incompatible:
		}catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}finally {
			try {
				in.close();//파일을 닫는다.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
