package ����;

import java.util.Scanner;

public class Assignment3_6_paging {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			int limit, listcount;
			System.out.print("limit�� �Է� �ϼ���.>");
			limit = sc.nextInt();
			System.out.println("listcount�� �Է� �ϼ���.>");
			listcount = sc.nextInt();

			int num= listcount/limit;
			if(listcount%limit == 0) {
				System.out.println("max page=" +(num));
			} else {
				System.out.println("max page=" +(num+1));
			}
			sc.close();
		} 
		
	}

