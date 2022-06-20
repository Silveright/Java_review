package ex21_5_PreparedStatement;
import java.sql.*;
public class JDBCExample_goodsinfo_update {
	public static void main(String[] args) {
		if(args.length !=2) {//A2000
			System.out.println("상품코드,제조사를 입력하세요");
			return;
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			//delete from goodsinfo where code = 'args[0]의 값'
			String update_sql = "update goodsinfo "
					+ "set maker = ?"  
					+ "where code = ?" ;
					
			pstmt = conn.prepareStatement(update_sql);
			pstmt.setString(1, args[1]);
			pstmt.setString(2, args[0]);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum+"행이 업데이트 되었습니다.");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
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
					conn.close();//DB연결을 끊는다.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}
}

