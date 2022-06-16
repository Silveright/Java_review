package ex21_3_dml_insert_delete_update;
import java.sql.*;
public class JDBCExample_goodsinfo_delete {
	public static void main(String[] args) {
		if(args.length !=1) {//A2000
			System.out.println("��ǰ�ڵ带 �Է��ϼ���");
			return;
		}
		
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			stmt = conn.createStatement();
			
			//delete from goodsinfo where code = 'args[0]�� ��'
			String single = "'";
			String del_sql = "delete from goodsinfo "
					+ "where code = " +single + args[0] + single;
					
			
			System.out.println(del_sql);
			int rowNum = stmt.executeUpdate(del_sql);
			System.out.println(rowNum+"���� �����Ǿ����ϴ�.");
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

