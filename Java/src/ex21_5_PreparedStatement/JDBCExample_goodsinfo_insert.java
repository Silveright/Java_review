package ex21_5_PreparedStatement;
import java.sql.*;
public class JDBCExample_goodsinfo_insert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			/*
			 * 1.���� �����͸� �Է��ϴ� ���
			 * insert into goodsinfo
			 * values('A100', '��� �ڵ���', 100, 'LG');
			 */
			String sql = "insert into goodsinfo "
					+ "values(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A1000");
			pstmt.setString(2, "��� �ڵ���");
			pstmt.setInt(3, 100);
			pstmt.setString(4, "LG");
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum+"���� �߰��Ǿ����ϴ�.");
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

