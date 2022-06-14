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
				 String str = br.readLine();//���Ϸκ��� �� �྿ �д´�.
				 if (str == null) 
					 break;
//				 ���1. StringTokenizer�̿��� ��� ���
				 StringTokenizer li = new StringTokenizer(str, " ");
					
						Student s = new Student(
								li.nextToken(), Integer.parseInt(li.nextToken()), Integer.parseInt(li.nextToken()), 
								Integer.parseInt(li.nextToken()));
						as.add(s);
					//���Ͽ� �����Ͱ� ���� �ԷµǾ��־� ��� �����͵��� �ִ��� �˱� ������ hasmoretokens �� �ʿ䰡 ����
						
//				 ���2. split�� �̿��� ��� ���
//				 String[] li = str.split(" ");
//				 
//				Student s = new Student(li[0], Integer.parseInt(li[1]), Integer.parseInt(li[2]),
//						Integer.parseInt(li[3]));
//				as.add(s);
				
			 }
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch ( IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}finally {//���� read() �޼��忡�� ������ �߻��ϸ�
			//close()�޼��尡 ���� ���� ���� ä ���α׷��� ������.>>finally ���� �־���� ��.
			try {
				if(br != null)
					br.close();
			} catch(IOException e ) {
				System.out.println("���� �ݴ� �� ����");
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
		System.out.print("==========    �л���   /  ���� �������ϱ�  ==========\n\t");
		System.out.print("����\t����\t����\t����\t���\n");
		for (Student obj : students) {
			System.out.println(obj.toString());
		}
		for(int j=0;j<45;j++){
			System.out.print("=");
		}
		System.out.print("\n����\t");
		System.out.println(Student.korTotal+"\t"
		                  +Student.engTotal+"\t"
				          +Student.mathTotal);		
	}

}
