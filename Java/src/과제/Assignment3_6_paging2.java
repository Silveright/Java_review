package ����;

import java.util.Scanner;

public class Assignment3_6_paging2 {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			int limit, listcount;
			System.out.print("limit�� �Է� �ϼ���.>");
			limit = sc.nextInt();
			System.out.println("listcount�� �Է� �ϼ���.>");
			listcount = sc.nextInt();

			int maxpage1 = (listcount -1)/limit +1;
			System.out.println(listcount + "=>" + maxpage1);
			sc.close();

			int maxpage2 = (listcount -1 +limit)/limit;
			System.out.println(listcount + "=>" + maxpage1);
			sc.close();
		} 
		
	}

