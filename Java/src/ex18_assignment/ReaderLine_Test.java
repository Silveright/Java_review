package ex18_assignment;
import java.io.*;
import java.util.StringTokenizer;
public class ReaderLine_Test {
//�׻� ��ü���� �ڵ带 �����ϱ� �� ���� �׽����� �غ��� ���� ����
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("jumsu.txt"));
			 while(true) {
				 String str = br.readLine();//���Ϸκ��� �� �྿ �д´�.
				 if (str == null) 
					 break;
				 //�̽±� 100 70 80 >> �и��ؼ� �����;� �Ѵ�. name, kor,eng, math
				
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
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch ( IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}finally {
			try {
				if(br != null)
					br.close();
			} catch(IOException e ) {
				System.out.println("���� �ݴ� �� ����");
			}
		}
	}
}
