package ex21_1_Connect_test;
import java.sql.*;
public class JDBCExample2_EMP {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//select(��ȸ) �� ���� resultset�� �ʿ���
		//row���� �޾� ȭ�鿡 ����Ѵ�.
		try {
			//1�ܰ�: JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ�: DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			/*
			 * ������ ���̽��� �ִ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ��ϴ�.
			 * 2�ܰ迡�� ���� Connection ��ü�� ���� createStatement �޼��带 ȣ���ؼ� ��´�.
			 */
			
			//������ conn��ü�� ���� statement ��ü ���� >> ������ �����ϴ� ������ ��
			stmt = conn.createStatement();
			
			/*
			 * Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸�����
			 * select���� �����ϴ� executeQuery��� �޼��尡 �ִ�.
			 * �� �޼��� �Ķ���ͷ� select ������ �Ѱ��־�� �Ѵ�.
			 * �� �޼���� �Ķ���ͷ� �Ѱ��� select ���� �����ͺ��̽��� ���� �����ϰ�
			 * �� ����� ResultSet ��ü�� �����Ѵ�.
			 */
			
			String select_sql = "select * from emp";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("��ȣ\t�����ȣ\t����̸�\t����\t\t���\t�Ի���\t\t�޿�\tĿ�̼�\t�μ���ȣ");
			System.out.println("---------------------------------------------------------------------------------------");
			
			/*
			 * ResultSet��ü�κ��� select���� �������� ��� ���� ���� next()�޼��带 ȣ���ؾ� �Ѵ�.
			 * rs.next() - ���� �� ��ġ�� �̵��ϴ� �޼���
			 * 			   ���� ���� boolean���� ������ ���� �о�Դ����� ����
			 */
			
			int i =0;
			//rs.next() �����͸� ���پ� �̾Ƴ���.
			//������ ����� Ÿ���� ��ġ�ؾ� �Ѵ�.
			while(rs.next()) {//���̻� ���� �����Ͱ� ���������� �ݺ�
				int empno = rs.getInt("empno");
				
				//getString("dname"): �÷� dname���� String������ �����ϴ� �޼���
				String ename = rs.getString("ename");
				//
				String job = rs.getString("job");
				int manager = rs.getInt("mgr");
				//java.util.Date�� �����
				java.util.Date hd = rs.getDate("hiredate");//1980-12-17
				//java.sql.Date hiredate�� �� ���� �ִ�. 
				//String hiredate = res.gerString("hiredate").substring(0,10);//1980-12-17 00:00:00
//				String hd = rs.getString("hiredate").substring(0,10);
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				
				//%3d\t%5d\t%-8s%-10s\t%-5d\t%-15s%7d%7d%5\n
				System.out.printf("%3d\t%5d\t%-8s%-10s\t%-5d\t%-15s%7d%7d%5d\n",
									++i, empno, ename,    job,     manager, hd,      sal,comm,deptno);
//				System.out.printf("%d\t %6d\t %-6s\t %-10s\t %5d\t %-5s\t %5d\t %5d\t %5d\n ",
//						++i, empno, dname,    job,     manager, hd,      sal,comm,deptno);
			}
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(rs!=null)
					rs.close(); //�� �������� ����ߴ� �� ���� �ݴ´�.
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(stmt !=null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(conn != null)
					conn.close();//DB������ ���´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}
}

