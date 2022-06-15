package ex19_assignment;
import java.io.*;
import java.util.*;
public class ObjectOutputExample2 {
	
	public static void main(String[] args) {
		ArrayList<Student2> as = new ArrayList<Student2>();
		write(as);

	}

	private static void write(ArrayList<Student2> as) {
	
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("jumsu.txt"));
			while (true) {
				String str = br.readLine();// 파일로부터 한 행씩 읽는다.
				if (str == null)
					break;
				
				//직렬화
				ObjectOutputStream out = null;
				try {
					String[] li = str.split(" ");
					Student2 s = new Student2(li[0], Integer.parseInt(li[1]), Integer.parseInt(li[2]),
							Integer.parseInt(li[3]));
					as.add(s);

					out = new ObjectOutputStream(new FileOutputStream("jumsu2.txt"));
					// 생성자에 써진 값들이 저장되어짐.

					System.out.println(s);
					for (int i = 0; i < as.size(); i++) {
						out.writeObject(as.get(i));// 객체를 직렬화
					}
				} catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("파일로 출력할 수 없습니다.");
				} finally {
					try {
						out.close();
					} catch (Exception e) {
						System.out.println("파일을 닫는 중 오류가 발생했습니다.");
						System.out.println(e.getMessage());
					}
				}//

			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				System.out.println("파일 닫는 중 오류");
			}
		}
	}
}
