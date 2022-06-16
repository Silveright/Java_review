package ex21_3_dml_insert_delete_update;
import java.sql.*;
public class JDBCExample_goodsinfo_update {
	public static void main(String[] args) {
		if(args.length !=2) {//A2000
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
			String update_sql = "update goodsinfo "
					+ "set maker ="   +single + args[1] + single
					+ "where code = " +single + args[0] + single;
					
			
			System.out.println(update_sql);
			int rowNum = stmt.executeUpdate(update_sql);
			System.out.println(rowNum+"���� ������Ʈ �Ǿ����ϴ�.");
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

