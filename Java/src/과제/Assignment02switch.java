package 과제;

import java.util.Scanner;

public class Assignment02switch {

	public static void main(String[] args) {
		System.out.print("점수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		switch (num) {
		case 100: case 99: case 98: case 97: case 96: case 95:
			System.out.println("A+");
			break;
		case 94: case 93: case 92: case 91: case 90:
			System.out.println("A");
			break;
		case 89: case 88: case 87: case 86: case 85:
			System.out.println("B+");
			break;
		case 84: case 83: case 82: case 81: case 80:
			System.out.println("B");
			break;
		case 79: case 78: case 77: case 76: case 75:
			System.out.println("C+");
			break;
		case 74: case 73: case 72: case 71: case 70:
			System.out.println("C");
			break;
		case 69: case 68: case 67: case 66: case 65:
			System.out.println("D+");
			break;
		case 64: case 63: case 62: case 61: case 60:
			System.out.println("D");
			break;
		
		default :
			System.out.println("F");
		}
		sc.close();
	}
}
