package ex18_assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class jumsu2_answer {

	public static void main(String[] args) {
		ArrayList<Student> as = new ArrayList<Student>();
		
		input(as);
		Student.sort(as);
		print(as);
	}

	private static void input(ArrayList<Student> as) {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("jumsu.txt"));
			 while(true) {
				 String str = br.readLine();//파일로부터 한 행씩 읽는다.
				 if (str == null) 
					 break;
//				 방법1. StringTokenizer이용해 담는 방법
				 StringTokenizer li = new StringTokenizer(str, " ");
					
						Student s = new Student(
								li.nextToken(), Integer.parseInt(li.nextToken()), Integer.parseInt(li.nextToken()), 
								Integer.parseInt(li.nextToken()));
						as.add(s);
					//파일에 데이터가 직접 입력되어있어 몇개의 데이터들이 있는지 알기 때문에 hasmoretokens 쓸 필요가 없음
						
//				 방법2. split을 이용해 담는 방법
//				 String[] li = str.split(" ");
//				 
//				Student s = new Student(li[0], Integer.parseInt(li[1]), Integer.parseInt(li[2]),
//						Integer.parseInt(li[3]));
//				as.add(s);
				
			 }
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch ( IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {//만약 read() 메서드에서 오류가 발생하면
			//close()메서드가 실행 되지 않은 채 프로그램이 끝난다.>>finally 블럭에 넣어줘야 함.
			try {
				if(br != null)
					br.close();
			} catch(IOException e ) {
				System.out.println("파일 닫는 중 오류");
			}
		}
	}
	
	static void sort(ArrayList<Student> students) {
		Student imsi;
		for (int i = 0; i < students.size()-1 ; i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).getTotal() < students.get(j).getTotal()) {
					imsi = students.get(i);
					students.set(i,students.get(j));
					students.set(j,imsi);
					
					}
				}
		}
	}
	
	static void print(ArrayList<Student> students) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student obj : students) {
			System.out.println(obj.toString());
		}
		for(int j=0;j<45;j++){
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.println(Student.korTotal+"\t"
		                  +Student.engTotal+"\t"
				          +Student.mathTotal);		
	}

}
