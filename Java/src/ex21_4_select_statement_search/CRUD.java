package ex21_4_select_statement_search;
import java.util.Scanner;


//emp�� ��� ������ ��ȸ�ϴ� Ŭ������ ���� ������ �����͸� ����Ѵ�.
public class CRUD {
	//CRUD: ��ǻ�� ����Ʈ��� ������ �⺻���� ������ ó�� ���
	//Create-insert, Read-select, Update-update, Delete-delete
	static String menus[] = {"�����ȣ","����̸�","����","�Ŵ���","�Ի�����","�޿�","Ŀ�̼�","�μ���ȣ","����"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = menuselect(sc);
		System.out.println(menu);//������ �޴��� ����� 
		sc.close();
	}
	private static int menuselect(Scanner sc) {
		int i =0;
		for(String m: menus) {
			System.out.println(++i + "." + m);
		}
		System.out.println("��ȸ�� �÷��� �����ϼ���>");
		return inputNumber(sc);
	}
	
	private static int inputNumber(Scanner sc) {
		int input =0;
		int lowNumber =1;
		int hiNumber =menus.length;//9
		
		while(true) 
			try {
			    input = Integer.parseInt(sc.nextLine());
				if(input<=hiNumber && input>=lowNumber) {
					break;
				} else {
					System.out.println(lowNumber+"~"+hiNumber+"���� ���ڸ� �Է��ϼ���>");
				}
			} catch (NumberFormatException e) {
				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
			}
			return input;
		}
	}

