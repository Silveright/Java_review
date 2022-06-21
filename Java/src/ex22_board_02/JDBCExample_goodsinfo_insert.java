package ex22_board_search2;
import java.sql.*;
public class JDBCExample_goodsinfo_insert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			/*
			 * 1.직접 데이터를 입력하는 경우
			 * insert into goodsinfo
			 * values('A100', '고급 핸드폰', 100, 'LG');
			 */
			String sql = "insert into goodsinfo "
					+ "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					+ " BOARD_CONTENT ,BOARD_RE_REF,"
					+ "	BOARD_RE_LEV, BOARD_RE_SEQ, BOARD_READCOUNT,"
					+ "	BOARD_DATE)"
					+ "values(?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A1000");
			pstmt.setString(2, "고급 핸드폰");
			pstmt.setInt(3, 100);
			pstmt.setString(4, "LG");
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum+"행이 추가되었습니다.");
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

