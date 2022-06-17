
package ex21_4_select_statement_search_1;

import java.sql.*;
import java.util.ArrayList;
public class DAO {//�����͸� ��� ������ ���� ���Ҹ� ����
	
	/*
	 * DAO(Data Access Object)Ŭ����
	 * -������ ���̽��� �����Ͽ� ���ڵ��� �߰�, ����, ���� �۾��� �̷������ Ŭ����
	 */
	public ArrayList<Emp> search(int menu, String word) {
		ArrayList<Emp> list = null;
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
			String[] column_name = {"empno","ename","job","mgr","hiredate","sal","comm","deptno","end"};
			String select_sql;
			if (column_name[menu].equals("ename") || column_name[menu].equals("job")
					|| column_name[menu].equals("hiredate")) {
				String single = "'";
				System.out.println("select * from emp " + 
								"where " + column_name[menu] + 
								" = " + single + word + single);
				select_sql = "select * from emp " + 
								"where " + column_name[menu] + 
								" = " + single + word+ single;
			} else if (column_name[menu].equals("end")) {
				System.out.println("select * from emp");
				select_sql = "select * from emp";
				
			}
			else {
				System.out.println("select * from emp " + "where " + column_name[menu] + " = " + word);
				select_sql = "select * from emp " + "where " + column_name[menu] + " = " + word;
			}
			rs = stmt.executeQuery(select_sql);
			
			int i =0;
			
			while(rs.next()) {//���̻� ���� �����Ͱ� ���������� �ݺ�
				//if (i==0)
				if(i++ ==0) {
					list = new ArrayList<Emp>();//������ �ִ� ��� �� �ѹ��� ���������.
				}
				//i++;
				Emp st = new Emp();
				st.setEmpno(rs.getInt(1));
				st.setEname(rs.getString(2));
				st.setJob(rs.getString(3));
				st.setMgr(rs.getInt(4));
				st.setHiredate(rs.getDate(5));
				st.setSal(rs.getInt(6));
				st.setComm(rs.getInt(7));
				st.setDeptno(rs.getInt(8));
				list.add(st);
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
		return list;
		//return null;
	}
	
}
