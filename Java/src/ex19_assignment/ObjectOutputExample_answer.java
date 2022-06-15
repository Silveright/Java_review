package ex19_assignment;
import java.io.*;
public class ObjectOutputExample_answer {
	/*
	 * 데이터를 모니터로 보낼때:system.out
	 * 데이터를 파일에 보낼 때: FileWriter&FileReader 2byte(문자단위로 데이터를 주고 받음)
	 * 					 InputStream&OutputStream byte 단위로 주고 받음(네트워크에서 쓰는 방식)
	 * Stream: 한 방향으로만 흐른다.
	 * 
	 * 객체를 주고받을 때 쓰이는 보조스트림 ObjectOutputStream에서 writeObject메서드가 객체를 스트림으로만든다.
	 */
	public static void main(String[] args) {
		write();

	}

	private static void write() {
		BufferedReader br = null;
		ObjectOutputStream out = null;
		try {
			br = new BufferedReader(new FileReader("jumsu.txt"));
			out = new ObjectOutputStream(new FileOutputStream("jumsu3.txt"));

			while (true) {
				String str = br.readLine();// 파일로부터 한 행씩 읽는다.
				if (str == null)
					break;
				
					String[] li = str.split(" ");
					out.writeObject(new Student(li[0], Integer.parseInt(li[1]), Integer.parseInt(li[2]),
							Integer.parseInt(li[3]))); 

					// 생성자에 써진 값들이 저장되어짐.

			
					}
				} catch (FileNotFoundException fnfe) {
					fnfe.printStackTrace();
					System.out.println("파일로 출력할 수 없습니다.");
		
				} catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("파일로 출력할 수 없습니다.");
				}	finally {
						try {
							if (br != null)
								br.close();
						} catch (IOException e) {
							System.out.println("파일 닫는 중 오류입니다.");
						}
						
						try {
							if (out != null)
								out.close();
						} catch (IOException e) {
							System.out.println("파일 닫는 중 오류입니다.");
						}
					}

	}
	
}

