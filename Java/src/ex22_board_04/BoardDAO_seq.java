package ex22_board_04;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class BoardDAO_seq {
	
	public BoardDAO_seq() {
		
	}
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

	public List<Board> getBoardList(int page, int limit) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//page: 페이지
		//limit : 페이지 당 목록의 수
		//BOARD_RE_REF desc, BOARD_RE_SEQ asc에 의해 정렬한 것을
		//조건절에 맞는 rnum의 범위 만큼 가져오는 쿼리문이다.
		String board_list_sql = 
				  "select * "
				+ "from "
				+ " (select rownum rnum,BOARD_NUM, BOARD_NAME, "
				+ " BOARD_SUBJECT, BOARD_CONTENT,BOARD_FILE, "
				+ " BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV,  BOARD_RE_SEQ, "
				+ " BOARD_READCOUNT, BOARD_DATE from "
				+ " (SELECT * FROM BOARD"
				+ " ORDER BY BOARD_RE_REF DESC, "
				+ " BOARD_RE_SEQ ASC)"
				+ " where rownum<=?) "
				+ " where rnum>=? and rnum<=?";
		List<Board> list = null;
		//한 페이지당 10개씩 목록인 경우							 1페이지, 2페이지, 3페이지, 4페이지
		int startrow = (page -1) * limit +1; //읽기 시작할 row번호 (1	11	   21	  31...
		int endrow = startrow + limit -1;//읽을 마지막 row번호     (10	20	   30	  40...
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			
			pstmt = conn.prepareStatement(board_list_sql.toString());//toStrin()없애도 내부적으로 메서드를 사용해준다.
			pstmt.setInt(1, endrow);
			pstmt.setInt(2, startrow);
			pstmt.setInt(3, endrow);
			rs = pstmt.executeQuery();
			
			
			int count =0;
			while(rs.next()) {//더이상 읽을 데이터가 없을때까지 반복
				if(count++ ==0)
					list = new ArrayList<Board>();
				Board board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
				list.add(board);//값을 담은 객체를 리스트에 저장
			}
		return list;// 리스트를 호출한 곳으로 가져간다.( finally를 실행한 후)
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("getBoardList() 에러: " +e);
		} finally {
			try {
				if(rs!=null)
					rs.close(); //맨 마지막에 사용했던 것 부터 닫는다.
			} catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt !=null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null)
					conn.close();//DB연결을 끊는다.
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}//finally
		return null;
	}
	public int boardModify(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result =0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			String sel_where_sql =
					"update board set "
					+ "BOARD_SUBJECT =?,"
					+ "BOARD_CONTENT =?,"
					+ "BOARD_PASS =?"
					+ "where BOARD_NUM = ?";
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());//toStrin()없애도 내부적으로 메서드를 사용해준다.
			pstmt.setString(1, board.getBOARD_SUBJECT());
			pstmt.setString(2, board.getBOARD_CONTENT());
			pstmt.setString(3, board.getBOARD_PASS());
			pstmt.setInt(4, board.getBOARD_NUM());
			
			 result = pstmt.executeUpdate();
			
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
		return result;
	}
	
	public Board getDetail(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Board board = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			String sel_where_sql =
					"select BOARD_NUM,"
					+ "BOARD_NAME,"
					+ "BOARD_SUBJECT,"
					+ "BOARD_CONTENT,"
					+ "BOARD_FILE,"
					+ "BOARD_RE_REF,"
					+ "BOARD_RE_LEV,"
					+ "BOARD_RE_SEQ,"
					+ "BOARD_DATE DATE "//나눠서 작성할 시 띄워쓰기 주의 (ex-makerfrom 으로 인식되지 않도록)
					+ "from board "
					+ "where BOARD_NUM = ?";
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());//toStrin()없애도 내부적으로 메서드를 사용해준다.
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			
			
			while(rs.next()) {//더이상 읽을 데이터가 없을때까지 반복
				board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
			}
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(rs!=null)
					rs.close(); //맨 마지막에 사용했던 것 부터 닫는다.
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
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
		return board;
	}
}
