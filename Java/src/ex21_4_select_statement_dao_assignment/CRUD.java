package ex21_4_select_statement_dao_assignment;
import java.util.ArrayList;
import java.util.Map;


//emp�� ��� ������ ��ȸ�ϴ� Ŭ������ ���� ������ �����͸� ����Ѵ�.
public class CRUD {
	//CRUD: ��ǻ�� ����Ʈ��� ������ �⺻���� ������ ó�� ���
	//Create-insert, Read-select, Update-update, Delete-delete
	static String menus[] = {"�����ȣ","����̸�","����","�Ŵ���","�Ի�����","�޿�","Ŀ�̼�","�μ���ȣ","����"};
	public static void main(String[] args) {
		selectAll();
	}
	private static void selectAll() {
		DAO dao = new DAO();
		ArrayList<Map<String, Object>> e = dao.selectAll();
		
		if( e == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n",menus[0],menus[1],menus[2],menus[3],
					menus[4],menus[5],menus[6],menus[7]);
			
			for(Map<String, Object> s: e) {
				System.out.printf("%-8s%-8s%-16s%s\t%-16s%s\t%s\t%s\n",
						s.get("empno"),s.get("ename"),s.get("job"),s.get("mgr"),
						s.get("hiredate"),s.get("sal"),s.get("comm"),s.get("deptno"));
//				System.out.printf("%5d\t%-8s%-10s\t%-5d\t%-15s%-7d%7d%5d\n",
//						s.get("Empno"),s.get("Ename"),s.get("Job"),s.get("Mgr"),
//						s.get("Hiredate"),s.get("Sal"),s.get("Comm"),s.get("Deptno"));
			}
			
		}
	}
}
