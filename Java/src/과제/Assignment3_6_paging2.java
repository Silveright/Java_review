package 과제;

import java.util.Scanner;

public class Assignment3_6_paging2 {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			int limit, listcount;
			System.out.print("limit를 입력 하세요.>");
			limit = sc.nextInt();
			System.out.println("listcount를 입력 하세요.>");
			listcount = sc.nextInt();

			int maxpage1 = (listcount -1)/limit +1;
			System.out.println(listcount + "=>" + maxpage1);
			sc.close();

			int maxpage2 = (listcount -1 +limit)/limit;
			System.out.println(listcount + "=>" + maxpage1);
			sc.close();
		} 
		
	}

