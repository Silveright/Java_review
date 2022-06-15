package ex18_assignment;
import java.io.*;
import java.util.StringTokenizer;
public class ReaderLine_Test {
//항상 전체적인 코드를 실행하기 전 따로 테스팅을 해보는 것이 좋음
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("jumsu.txt"));
			 while(true) {
				 String str = br.readLine();//파일로부터 한 행씩 읽는다.
				 if (str == null) 
					 break;
				 //이승기 100 70 80 >> 분리해서 꺼내와야 한다. name, kor,eng, math
				
				 String[] li = str.split(" ");
				 for(String a: li) {
						System.out.println(a);
					}
//				 StringTokenizer li = new StringTokenizer(str, " ");
//					while (li.hasMoreTokens()) {
//						Student s = new Student(
//								li.nextToken(), Integer.parseInt(li.nextToken()), Integer.parseInt(li.nextToken()), 
//								Integer.parseInt(li.nextToken()));
//						as.add(s);
//					}
			 }
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch ( IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			try {
				if(br != null)
					br.close();
			} catch(IOException e ) {
				System.out.println("파일 닫는 중 오류");
			}
		}
	}
}
