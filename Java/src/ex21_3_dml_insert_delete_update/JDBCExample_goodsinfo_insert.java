package ex21_3_dml_insert_delete_update;
import java.sql.*;
public class JDBCExample_goodsinfo_insert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			stmt = conn.createStatement();
			
			/*
			 * 1.���� �����͸� �Է��ϴ� ���
			 * insert into goodsinfo
			 * values('A100', '��� �ڵ���', 100, 'LG');
			 */
			String sql = "insert into goodsinfo "
					+ "values('A100', '��� �ڵ���', 100, 'LG')";
			
			System.out.println(sql);
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum+"���� �߰��Ǿ����ϴ�.");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
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

