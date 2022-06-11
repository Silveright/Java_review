package °úÁ¦;

import java.util.Scanner;

public class Assignment3_2_paging3 {

	public static void main(String[] args) {
		
		System.out.print("listcount");
		Scanner sc = new Scanner(System.in);
		int listcount = sc.nextInt();
		System.out.print("limit");
		int limit = sc.nextInt();
		int maxpage;
		
		maxpage= (listcount-1)/limit +1;
		
			System.out.println("maxpage=" + maxpage);

			sc.close();
		}
	}

