package assignment_220610;

import java.util.Scanner;

public class next_nextLine {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
       System.out.println("값을 입력하세요"); 
       String value1 = scanner.next();
       System.out.println(value1);
       scanner.nextLine();
       System.out.println("값을 입력하세요"); 
       String value2 = scanner.nextLine();
       System.out.println(value2);
scanner.close();


	}

}
