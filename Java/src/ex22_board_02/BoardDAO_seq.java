package ex22_board_02;

import java.sql.*;
public class BoardDAO_seq {
	
	/*
	 * DAO(Data Access Object)클래스
	 * -데이터 베이스와 연동하여 레코드의 추가, 수정, 삭제 작업이 이루어지는 클래스
	 */
	public int boardinsert(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="";
		int result =0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			sql = "insert into board "
					+ "	   (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					+ " 	BOARD_CONTENT ,BOARD_RE_REF,"
					+ "		BOARD_RE_LEV, BOARD_RE_SEQ, BOARD_READCOUNT,"
					+ "		BOARD_DATE)"
					+ "  values(board_seq.nextval, ?, ?, ?,"
					+ "		    ?, board_seq.nextval,"
					+ "		    ?,?,?,"//0,0,0
					+ "		    sysdate)";
			
			//새로운 글을 등록하는 부분
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBOARD_NAME());
				pstmt.setString(2, board.getBOARD_PASS());
				pstmt.setString(3, board.getBOARD_SUBJECT());
				pstmt.setString(4, board.getBOARD_CONTENT());
				
				//원문의 경우 BOARD_RE_LEV, BOARD_RE_SEQ 필드 값은 0
				pstmt.setInt(5, 0);
				pstmt.setInt(6, 0);
				pstmt.setInt(7, 0);//BOARD_READCOUNT필드
				
				result = pstmt.executeUpdate();
				
			
		}catch(Exception ex) {
			System.out.println("boardInsert() 에러:" + ex);
			ex.printStackTrace();
//		} catch(SQLException se) {
//			System.out.println(se.getMessage());
		} finally {
			try {
				if(pstmt !=null)
					pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if(conn != null)
					conn.close();//DB연결을 끊는다.
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
		}//finally
		return result;
	}//boardInsert()메서드 end
	
}
