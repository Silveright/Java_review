package ex19_01_Serialization;
import java.io.*;
import java.util.*;
public class ObjectOutputExample {
//객체를 직렬화하는 프로그램
//직렬화: 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해 객체를 스트림으로 만드는 작업이 필요하다.
//이런 작업을 자바에서 객체의 직렬화(serialization)이라고 한다.
	public static void main(String[] args) {
		//파일을 연다.
		//ObjectOutputStream 클래스는 객체를 스트림으로 만들어 출력하는 기능이 있는 클래스
		//이 클래스에는 데이터를 파일에 저장하는 기능이 없어
		//FileOutputstream 클래스와 함께 사용해야 한다.
		//FileOutputStream 객체를 생성해서
		//ObjectOutputStream 클래스의 생성자 파라미터로 넘겨주어야한다.
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output.dat"));
			
			//객체를 직렬화 하는 부분(객체를 데이터스트림으로 만든다. 객체에 저장된 데이터를 스트림에 쓰기위해 연속적인 데이터로 변환하는 것을 의미한다.)
			//writeObject 메서드: 파라미터로 넘겨준 객체를 스트림으로 만들어서 출력하는 메서드
			//파라미터로 넘겨진 객체가 파일에 저장된다.
			//GregorianCalendar 객체를 생성해 파일에 쓴다.
			out.writeObject(new GregorianCalendar(2019,0,14));
			out.writeObject(new GregorianCalendar(2019,0,15));
			out.writeObject(new GregorianCalendar(2019,0,16));
			//어떤 클래스를 사용해 어떤 객체를 스트림으로 만들어서 출력할 것인지, 출력할 데이터는 무엇인지(생성된 객체의 데이터가 읽혀지게 될 것.)
		
		}catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				out.close();
			}
			catch(Exception e) {
				System.out.println("파일을 닫는 중 오류가 발생했습니다.");
			}
		}
	}
}
