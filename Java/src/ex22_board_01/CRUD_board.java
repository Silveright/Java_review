package ex22_board_01;
import java.util.Scanner;


//emp의 모든 정보를 조회하는 클래스를 통해 가져온 데이터를 출력한다.
public class CRUD_board {
	//CRUD: 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
	//Create-insert, Read-select, Update-update, Delete-delete
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			int menu = menuselect(sc);
			System.out.println(menu);
		} while (true);
	}
	
	private static int menuselect(Scanner sc) {
		String menus[] = {"글쓰기","수정","답변달기","글삭제","조회","페이지 선정","종료"};
		int i =0;
		System.out.println("================================================");
		for(String m: menus) {
			System.out.println(++i + "." + m);
		}
		System.out.println("================================================");
		System.out.println("메뉴를 선택하세요>");
		return inputNumber(sc,1,menus.length);
	}

	private static int inputNumber(Scanner sc, int start, int end) {
		int input =0;
		while(true) 
			try {
				input = Integer.parseInt(sc.nextLine());
				if(input<=end && input>=start) {
					break;
				} else {
					System.out.println(start+"~"+end+"사이 숫자를 입력하세요>");
				}
			} catch (NumberFormatException e) {
				System.out.print("숫자로 입력하세요>");
			}
		return input;
	}
}

