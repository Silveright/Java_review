package ex19_assignment;

import java.io.*;


public class ObjectInputStreamExample_answer {
	public static void main(String[] args) {
//파일을 연다.
		input();
	}

	private static void input() {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("jumsu3.txt"));
			while (true) {

				// 객체를 역직렬화하는 부분

				Student r = (Student) in.readObject();

				System.out.println(r.toString());
//				System.out.println(r);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (EOFException eofe) {// 파일로부터 더 이상 읽을 객체가 없을 때 발생하는 익셉션 처리
			System.out.println("끝");
		} catch (IOException ioe) {
			// 직렬화할 때 사용한 클래스와 역직렬화할 때사용한 클래스의 버전이 다를때 발생하는 에러메세지 출력
			System.out.println(ioe.getMessage());// local class incompatible:
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				if(in!=null)
				in.close();// 파일을 닫는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
