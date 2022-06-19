
package ex21_4_select_statement_dao_assignment;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class DAO {
	
	/*
	 * DAO(Data Access Object)Ŭ����
	 * -������ ���̽��� �����Ͽ� ���ڵ��� �߰�, ����, ���� �۾��� �̷������ Ŭ����
	 */
	public ArrayList<Map<String, Object>> selectAll() {
		ArrayList<Map<String, Object>> list = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
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
			
			
			int i =0;
			
			while(rs.next()) {//���̻� ���� �����Ͱ� ���������� �ݺ�
				//if (i==0)
				if(i++ ==0) {
					list = new ArrayList<Map<String, Object>>();//������ �ִ� ��� �� �ѹ��� ���������.
				}
				//i++;
				Map<String, Object> m = new HashMap<String, Object>();
				//value���� Ÿ���� ��� �ٸ��� ������ Object���� ��� �Ѵ�.
				m.put("empno", rs.getInt(1));
				m.put("ename", rs.getString(2));
				m.put("job", rs.getString(3));
				m.put("mgr", rs.getInt(4));
				m.put("hiredate", rs.getDate(5));
				m.put("sal", rs.getInt(6));
				m.put("comm", rs.getInt(7));
				m.put("deptno", rs.getInt(8));
				list.add(m);
			
			}
		} catch(ClassNotFoundException cnfe) {//ReferencedLibrary ojdbc6jar oracle.jdbc.driver.OracleDriver
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
		return list;
		//return null;
	}
	
}
