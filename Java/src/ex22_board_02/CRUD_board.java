package ex22_board_02;
import java.util.Scanner;

//emp의 모든 정보를 조회하는 클래스를 통해 가져온 데이터를 출력한다.
public class CRUD_board {
	//CRUD: 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
	//Create-insert, Read-select, Update-update, Delete-delete
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO_seq dao = new BoardDAO_seq();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			
			case 7:
				sc.close();
				return;
			}
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
	
	private static void insert(Scanner sc, BoardDAO_seq dao) {
		Board board = new Board();

		System.out.println("작성자>");
		String name = sc.nextLine();
		board.setBOARD_NAME(name);
		//board.setBOARD_NAME(sc.nextLine());
		
		System.out.println("비밀번호>");
		String pw = sc.nextLine();
		board.setBOARD_PASS(pw);
		
		System.out.println("제목>");
		String sj = sc.nextLine();
		board.setBOARD_SUBJECT(sj);
		
		System.out.println("글내용>");
		String content = sc.nextLine();
		board.setBOARD_CONTENT(content);
		
		if(dao.boardinsert(board)==1) {
			System.out.println("글이 작성되었습니다.");
		} else {
			System.out.println("오류가 발생되었습니다.");
		}
		
	}

}

