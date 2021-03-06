package ex22_board_07_selectpage;

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
			
		}catch(Exception ex) {
			System.out.println("boardModify() 에러:" + ex);
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
	}//메서드 end
	
	public Board getDetail(int num) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		Board board = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			String sel_where_sql =
					"select * "//나눠서 작성할 시 띄워쓰기 주의 (ex-makerfrom 으로 인식되지 않도록)
					+ "from board "
					+ "where BOARD_NUM = ?";
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());//toStrin()없애도 내부적으로 메서드를 사용해준다.
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));//비밀번호 확인에 사용된다.
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
			//	board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
			}
		} catch(Exception e) {
			System.out.println("getDetail()에러:" +e);
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
		return board;
	}//method end
	public int boardReply(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		int result =0;
		
		/*
		 * 답변을 할 원문 글 그룹 번호
		 * 답변을 달게되면 답변 글은 이 번호와 같은 관련글 번호를 갖게 처리되면서
		 * 같은 그룹에 속하게 된다. 글 목록에서 보여줄 때 하나의 그룹으로 묶어 출력된다.
		 */
		int re_ref = board.getBOARD_RE_REF();

		
		/*
		 * 답글의 깊이를 의미
		 * 원문에 대한 답글이 출력될 때 한 번 들여쓰기 처리가 되고 답글에 대한 답글은 들여쓰기가 두 번 처리되게한다.
		 * 원문인 경우에는 이 값이 0이고 원문의 답글은 1, 답글의 답글은 2가된다.
		 */
		int re_lev = board.getBOARD_RE_LEV();

		/*
		 * 같은 관련 글 중에서 해당 글이 출력되는 순서
		 */
		int re_seq = board.getBOARD_RE_SEQ();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			//트랜잭션을 이용하기 위해 setAutoCommit을 false로 설정
			conn.setAutoCommit(false);
			
			//BOARD_RE_REF, BOARD_RE_SEQ 값을 확인하여 원문 글에 다른 답글이 있으면
			//다른 답글들의 BOARD_RE_SEQ값을 1씩 증가
			//현재 글을 다른 답글보다 앞에 출력되게 하기 위해서
			sql = " update board " 
				     + "set    BOARD_RE_SEQ = BOARD_RE_SEQ + 1 " 
					 + "where  BOARD_RE_REF = ? "
				  	 + "and    BOARD_RE_SEQ > ?";
			
			pstmt = conn.prepareStatement(sql.toString());//toStrin()없애도 내부적으로 메서드를 사용해준다.
			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);
		    pstmt.executeUpdate();
			pstmt.close();
		    
			//등록할 답변 글의 BOARD_RE_LEV, BOARD_RE_REF값을 원문 글보다 1씩 증가시킨다.
			re_seq = re_seq +1;
			re_lev = re_lev +1;
			
			sql = "insert into board " 
				     + "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					 + " BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF," 
				     + " BOARD_RE_LEV, BOARD_RE_SEQ,"
					 + " BOARD_READCOUNT,BOARD_DATE) " 
				     + "values(board_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate)";   
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());
			pstmt.setString(5, "");//답변에는 파일을 업로드하지 않는다.
			pstmt.setInt(6, re_ref);
			pstmt.setInt(7, re_lev);
			pstmt.setInt(8, re_seq);
			pstmt.setInt(9, 0);//BOARD_READCOUNT(조회수)는 0
			
			result = pstmt.executeUpdate();
			conn.commit();//commit
		
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("boardReply() 에러:" + ex);
			try {
				if(conn !=null)
					conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} finally {
			try {
				if(pstmt != null)
					pstmt.close();
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}//finally
		return result;
	}//메서드 end
	
	public int boardDelete(Board board) {
		
		/*
		 * 삭제의 조건
		 * 1. 선택한 글과 같은 BOARD_RE_REF 값을 갖는다.
		 * 2. 선택한 글과 같거나 높은 BOARD_RE_LEV 값을 갖는다.
		 * 3. 선택한 글과 같거나 높은 BOARD_RE_SEQ 값을 갖는다.
		 * 	단, BOARD_RE_SEQ범위는 선택한 글과
		 * 		BOARD_RE_REF, BOARD_RE_LEV 값이 같고 선택한 글의 BOARD_RE_SEQ 보다 큰 것들 중
		 * 		가장 작은 값에서 1을 뺀 값을 가진다.
		 * 		만약 존재하지 않으면 BOARD_RE_REF값 중 가장 큰 BOARD_RE_SEQ값을 갖는다.
		 */
		
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String board_delete_sql =
		"delete from board "
		+ "				where  BOARD_RE_REF = ?"
		+ "				and    BOARD_RE_LEV >=?"
		+ "				and    BOARD_RE_SEQ >=?"
		+ "				and    BOARD_RE_SEQ <=(  nvl((SELECT min(board_re_seq)-1"
		+ "				                             FROM   BOARD"
		+ "				                             WHERE  BOARD_RE_REF=?"
		+ "				                             AND    BOARD_RE_LEV=?"
		+ "				                             AND    BOARD_RE_SEQ>?) , "
		+ "				                            (SELECT max(board_re_seq)"
		+ "				                             FROM   BOARD"
		+ "							                 WHERE  BOARD_RE_REF=? ))"
		+ "											 )";
	
		int result =0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			pstmt = conn.prepareStatement(board_delete_sql);
			pstmt.setInt(1, board.getBOARD_RE_REF());
			pstmt.setInt(2, board.getBOARD_RE_LEV());
			pstmt.setInt(3, board.getBOARD_RE_SEQ());
			pstmt.setInt(4, board.getBOARD_RE_REF());
			pstmt.setInt(5, board.getBOARD_RE_LEV());
			pstmt.setInt(6, board.getBOARD_RE_SEQ());
			pstmt.setInt(7, board.getBOARD_RE_REF());
			
			//쿼리 실행 후 삭제된 로우(레코드)개수가 반환됨
			result = pstmt.executeUpdate();
			
		}catch(Exception ex) {
			System.out.println("boardDelete() 에러:" + ex);
			ex.printStackTrace();
		} finally {
			if(pstmt !=null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			if(conn != null)
				try {
					conn.close();//DB연결을 끊는다.
				}catch (SQLException ex) {
					ex.printStackTrace();
				}
		}//finally
		return result;
	}
	public int count() {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		int count =0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			String sql =
					"select count(*) "//나눠서 작성할 시 띄워쓰기 주의 (ex-makerfrom 으로 인식되지 않도록)
					+ "from board ";
			
			pstmt = conn.prepareStatement(sql.toString());//toStrin()없애도 내부적으로 메서드를 사용해준다.
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch(Exception e) {
			System.out.println("count()에러:" +e);
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
		return count;
	}//method end
}
