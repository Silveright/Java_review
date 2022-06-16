package ex21_1_Connect_test;
import java.sql.*;
public class JDBCExample1_DEPT_index2 {
//index�� �÷� ��������
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
			
			String select_sql = "select loc, dname, deptno from dept";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("��ȣ\t�μ���ȣ\t�μ���\t\t����");
			System.out.println("-----------------------------------------------------");
			
			/*
			 * ResultSet��ü�κ��� select���� �������� ��� ���� ���� next()�޼��带 ȣ���ؾ� �Ѵ�.
			 * rs.next() - ���� �� ��ġ�� �̵��ϴ� �޼���
			 * 			   ���� ���� boolean���� ������ ���� �о�Դ����� ����
			 */
			
			int i =0;
			//rs.next() �����͸� ���پ� �̾Ƴ���.
			//������ ����� Ÿ���� ��ġ�ؾ� �Ѵ�.
			while(rs.next()) {//���̻� ���� �����Ͱ� ���������� �ݺ�
				int deptno = rs.getInt(3);
				String dname = rs.getString(2);
				String loc = rs.getString(1);
				//String select_sql = "select loc, dname, deptno from dept"; ������ ���߾� �ε�������
				System.out.printf("%5d\t%5d\t%-15s%s\n",
									++i,deptno,dname,loc);
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
