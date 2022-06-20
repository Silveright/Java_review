package ex22_board_search;
import java.util.ArrayList;
import java.util.Scanner;


//emp�� ��� ������ ��ȸ�ϴ� Ŭ������ ���� ������ �����͸� ����Ѵ�.
public class CRUD_board {
	//CRUD: ��ǻ�� ����Ʈ��� ������ �⺻���� ������ ó�� ���
	//Create-insert, Read-select, Update-update, Delete-delete
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			int menu = menuselect(sc);
			System.out.println(menu);
		} while (true);
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

	
	
//	private static String searchData(Scanner sc, int menu) {
//		System.out.println("��ȸ �� " +menus[menu-1]+"��(��) �Է��ϼ���>");
//		return sc.nextLine();
//	}

//	private static void search(int menu, String search_word) {
//		DAO dao = new DAO();
//		
//		ArrayList<Emp> e = dao.search(menu - 1, search_word);
//
//		if (e == null) {
//			System.out.println("�˻� ����� �����ϴ�.");
//		} else {
//			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0], menus[1], menus[2], menus[3],
//					menus[4], menus[5], menus[6], menus[7]);
//			for (Emp s : e) {
//				System.out.println(s.toString());
//			}
//		}
//	}
}

