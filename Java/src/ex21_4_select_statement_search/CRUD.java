package ex21_4_select_statement_search;
import java.util.Scanner;


//emp의 모든 정보를 조회하는 클래스를 통해 가져온 데이터를 출력한다.
public class CRUD {
	//CRUD: 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
	//Create-insert, Read-select, Update-update, Delete-delete
	static String menus[] = {"사원번호","사원이름","직급","매니저","입사일자","급여","커미션","부서번호","종료"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = menuselect(sc);
		System.out.println(menu);//선택한 메뉴를 출력함 
		sc.close();
	}
	private static int menuselect(Scanner sc) {
		int i =0;
		for(String m: menus) {
			System.out.println(++i + "." + m);
		}
		System.out.println("조회할 컬럼을 선택하세요>");
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
					System.out.println(lowNumber+"~"+hiNumber+"사이 숫자를 입력하세요>");
				}
			} catch (NumberFormatException e) {
				System.out.print("숫자로 다시 입력하세요>");
			}
			return input;
		}
	}

