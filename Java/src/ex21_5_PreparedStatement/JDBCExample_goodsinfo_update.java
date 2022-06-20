package ex21_5_PreparedStatement;
import java.sql.*;
public class JDBCExample_goodsinfo_update {
	public static void main(String[] args) {
		if(args.length !=2) {//A2000
			System.out.println("��ǰ�ڵ�,�����縦 �Է��ϼ���");
			return;
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			//delete from goodsinfo where code = 'args[0]�� ��'
			String update_sql = "update goodsinfo "
					+ "set maker = ?"  
					+ "where code = ?" ;
					
			pstmt = conn.prepareStatement(update_sql);
			pstmt.setString(1, args[1]);
			pstmt.setString(2, args[0]);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum+"���� ������Ʈ �Ǿ����ϴ�.");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(pstmt !=null)
					pstmt.close();
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

