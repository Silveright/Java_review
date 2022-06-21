package ex22_board_04_answer;
import java.util.List;
import java.util.Scanner;


//emp�� ��� ������ ��ȸ�ϴ� Ŭ������ ���� ������ �����͸� ����Ѵ�.
public class CRUD_board {
	//CRUD: ��ǻ�� ����Ʈ��� ������ �⺻���� ������ ó�� ���
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
				
			case 2:
				update(sc, dao);
				break;
				
			case 5:
				selectAll(dao);
				break;
			
			case 7:
				sc.close();
				return;
			}
		} while (true);
	}
	

	private static void update(Scanner sc, BoardDAO_seq dao) {
		System.out.print("������ �� ��ȣ�� �Է��ϼ���>");
		int num= inputNumber(sc);
		 Board board = select(dao, num);
		 if(board !=null) {
			 System.out.print("����>");
			 board.setBOARD_SUBJECT(sc.nextLine());
			 
			 System.out.print("�� ����>");
			 board.setBOARD_CONTENT(sc.nextLine());
			 
			 System.out.print("��й�ȣ>");
			 String pass = sc.nextLine();
			 
			 //���� �Է��� ��й�ȣ�� DB�� ����� ��й�ȣ ���ϱ�
			 if(pass.equals(board.getBOARD_PASS())) {
				int result = dao.boardModify(board);
				 if(result==1) {
					System.out.println("������ �����߽��ϴ�.");
				} else {
					System.out.println("������ �����߽��ϴ�.");
				}
			 } else {
				 System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			 }
		 }
	}


	private static int inputNumber(Scanner sc) {
		int input =0;
		while(true) 
			try {
				input = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print("���ڷ� �Է��ϼ���>");
			}
		return input;
	}


	private static Board  select(BoardDAO_seq dao, int num) {
		Board board = dao.getDetail(num);
		if(board != null) {
			printTitle();
			System.out.println(board.toString());
		} else {
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
		}
		return board;//���� ���� �� ��й�ȣ Ȯ���� ���� �ʿ�
					//�亯�� ��� �������� BOARD_RE_REF, BOARD_RE_LEV,BOARD_RE_SEQ���� �ʿ�
	}



	private static int menuselect(Scanner sc) {
		String menus[] = {"�۾���","����","�亯�ޱ�","�ۻ���","��ȸ","������ ����","����"};
		int i =0;
		System.out.println("================================================");
		for(String m: menus) {
			System.out.println(++i + "." + m);
		}
		System.out.println("================================================");
		System.out.println("�޴��� �����ϼ���>");
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
					System.out.println(start+"~"+end+"���� ���ڸ� �Է��ϼ���>");
				}
			} catch (NumberFormatException e) {
				System.out.print("���ڷ� �Է��ϼ���>");
			}
		return input;
	}
	
	private static void insert(Scanner sc, BoardDAO_seq dao) {
		Board board = new Board();

		System.out.println("�ۼ���>");
		String name = sc.nextLine();
		board.setBOARD_NAME(name);
		//board.setBOARD_NAME(sc.nextLine());
		
		System.out.println("��й�ȣ>");
		String pw = sc.nextLine();
		board.setBOARD_PASS(pw);
		
		System.out.println("����>");
		String sj = sc.nextLine();
		board.setBOARD_SUBJECT(sj);
		
		System.out.println("�۳���>");
		String content = sc.nextLine();
		board.setBOARD_CONTENT(content);
		
		if(dao.boardinsert(board)==1) {
			System.out.println("���� �ۼ��Ǿ����ϴ�.");
		} else {
			System.out.println("������ �߻��Ǿ����ϴ�.");
		}
		
	}
	
	private static void printTitle() {
		System.out.printf("%s\t%s\t\t%s\t\t\t%s\t\t\t%s\t%s\t%s\t%s\n", 
		        "�۹�ȣ", "�ۼ���", "����", "����", "ref", "lev", "seq",	"date");
	}
	
	private static void selectAll(BoardDAO_seq dao) {
		//1-������
		//10-������ �� ����� ��(limit)
		List<Board> arrs = dao.getBoardList(1, 10);
		if(arrs!= null) {
			printTitle();
			for (Board b : arrs) {
				System.out.println(b.toString());
			}
		} else {
			System.out.println("���̺� �����Ͱ� �����ϴ�.");
		}
	}
}

