package assignment_220610;

import java.util.Scanner;

public class next_nextLine {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
       System.out.println("���� �Է��ϼ���"); 
       String value1 = scanner.next();
       System.out.println(value1);
       scanner.nextLine();
       System.out.println("���� �Է��ϼ���"); 
       String value2 = scanner.nextLine();
       System.out.println(value2);
scanner.close();


	}

}
