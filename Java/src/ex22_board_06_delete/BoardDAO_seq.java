package ex22_board_06_delete;

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
			
			//���ο� ���� ����ϴ� �κ�
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBOARD_NAME());
				pstmt.setString(2, board.getBOARD_PASS());
				pstmt.setString(3, board.getBOARD_SUBJECT());
				pstmt.setString(4, board.getBOARD_CONTENT());
				
				//������ ��� BOARD_RE_LEV, BOARD_RE_SEQ �ʵ� ���� 0
				pstmt.setInt(5, 0);
				pstmt.setInt(6, 0);
				pstmt.setInt(7, 0);//BOARD_READCOUNT�ʵ�
				
				result = pstmt.executeUpdate();
				
			
		}catch(Exception ex) {
			System.out.println("boardInsert() ����:" + ex);
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
					conn.close();//DB������ ���´�.
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
		}//finally
		return result;
	}//boardInsert()�޼��� end

	public List<Board> getBoardList(int page, int limit) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//page: ������
		//limit : ������ �� ����� ��
		//BOARD_RE_REF desc, BOARD_RE_SEQ asc�� ���� ������ ����
		//�������� �´� rnum�� ���� ��ŭ �������� �������̴�.
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
		//�� �������� 10���� ����� ���							 1������, 2������, 3������, 4������
		int startrow = (page -1) * limit +1; //�б� ������ row��ȣ (1	11	   21	  31...
		int endrow = startrow + limit -1;//���� ������ row��ȣ     (10	20	   30	  40...
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			
			pstmt = conn.prepareStatement(board_list_sql.toString());//toStrin()���ֵ� ���������� �޼��带 ������ش�.
			pstmt.setInt(1, endrow);
			pstmt.setInt(2, startrow);
			pstmt.setInt(3, endrow);
			rs = pstmt.executeQuery();
			
			
			int count =0;
			while(rs.next()) {//���̻� ���� �����Ͱ� ���������� �ݺ�
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
				list.add(board);//���� ���� ��ü�� ����Ʈ�� ����
			}
		return list;// ����Ʈ�� ȣ���� ������ ��������.( finally�� ������ ��)
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("getBoardList() ����: " +e);
		} finally {
			try {
				if(rs!=null)
					rs.close(); //�� �������� ����ߴ� �� ���� �ݴ´�.
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
					conn.close();//DB������ ���´�.
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
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());//toStrin()���ֵ� ���������� �޼��带 ������ش�.
			pstmt.setString(1, board.getBOARD_SUBJECT());
			pstmt.setString(2, board.getBOARD_CONTENT());
			pstmt.setString(3, board.getBOARD_PASS());
			pstmt.setInt(4, board.getBOARD_NUM());
			
			 result = pstmt.executeUpdate();
			
		}catch(Exception ex) {
			System.out.println("boardModify() ����:" + ex);
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
					conn.close();//DB������ ���´�.
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
		}//finally
		return result;
	}//�޼��� end
	
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
					"select * "//������ �ۼ��� �� ������� ���� (ex-makerfrom ���� �νĵ��� �ʵ���)
					+ "from board "
					+ "where BOARD_NUM = ?";
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());//toStrin()���ֵ� ���������� �޼��带 ������ش�.
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));//��й�ȣ Ȯ�ο� ���ȴ�.
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
			System.out.println("getDetail()����:" +e);
		} finally {
			try {
				if(rs!=null)
					rs.close(); //�� �������� ����ߴ� �� ���� �ݴ´�.
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
					conn.close();//DB������ ���´�.
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
		 * �亯�� �� ���� �� �׷� ��ȣ
		 * �亯�� �ްԵǸ� �亯 ���� �� ��ȣ�� ���� ���ñ� ��ȣ�� ���� ó���Ǹ鼭
		 * ���� �׷쿡 ���ϰ� �ȴ�. �� ��Ͽ��� ������ �� �ϳ��� �׷����� ���� ��µȴ�.
		 */
		int re_ref = board.getBOARD_RE_REF();

		
		/*
		 * ����� ���̸� �ǹ�
		 * ������ ���� ����� ��µ� �� �� �� �鿩���� ó���� �ǰ� ��ۿ� ���� ����� �鿩���Ⱑ �� �� ó���ǰ��Ѵ�.
		 * ������ ��쿡�� �� ���� 0�̰� ������ ����� 1, ����� ����� 2���ȴ�.
		 */
		int re_lev = board.getBOARD_RE_LEV();

		/*
		 * ���� ���� �� �߿��� �ش� ���� ��µǴ� ����
		 */
		int re_seq = board.getBOARD_RE_SEQ();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"board","1234");
			
			//Ʈ������� �̿��ϱ� ���� setAutoCommit�� false�� ����
			conn.setAutoCommit(false);
			
			//BOARD_RE_REF, BOARD_RE_SEQ ���� Ȯ���Ͽ� ���� �ۿ� �ٸ� ����� ������
			//�ٸ� ��۵��� BOARD_RE_SEQ���� 1�� ����
			//���� ���� �ٸ� ��ۺ��� �տ� ��µǰ� �ϱ� ���ؼ�
			sql = " update board " 
				     + "set    BOARD_RE_SEQ = BOARD_RE_SEQ + 1 " 
					 + "where  BOARD_RE_REF = ? "
				  	 + "and    BOARD_RE_SEQ > ?";
			
			pstmt = conn.prepareStatement(sql.toString());//toStrin()���ֵ� ���������� �޼��带 ������ش�.
			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);
		    pstmt.executeUpdate();
			pstmt.close();
		    
			//����� �亯 ���� BOARD_RE_LEV, BOARD_RE_REF���� ���� �ۺ��� 1�� ������Ų��.
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
			pstmt.setString(5, "");//�亯���� ������ ���ε����� �ʴ´�.
			pstmt.setInt(6, re_ref);
			pstmt.setInt(7, re_lev);
			pstmt.setInt(8, re_seq);
			pstmt.setInt(9, 0);//BOARD_READCOUNT(��ȸ��)�� 0
			
			result = pstmt.executeUpdate();
			conn.commit();//commit
		
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("boardReply() ����:" + ex);
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
	}//�޼��� end
	
	public int boardDelete(Board board) {
		
		/*
		 * ������ ����
		 * 1. ������ �۰� ���� BOARD_RE_REF ���� ���´�.
		 * 2. ������ �۰� ���ų� ���� BOARD_RE_LEV ���� ���´�.
		 * 3. ������ �۰� ���ų� ���� BOARD_RE_SEQ ���� ���´�.
		 * 	��, BOARD_RE_SEQ������ ������ �۰�
		 * 		BOARD_RE_REF, BOARD_RE_LEV ���� ���� ������ ���� BOARD_RE_SEQ ���� ū �͵� ��
		 * 		���� ���� ������ 1�� �� ���� ������.
		 * 		���� �������� ������ BOARD_RE_REF�� �� ���� ū BOARD_RE_SEQ���� ���´�.
		 */
		
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String board_delete_sql =
		"delete from board\r\n"
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
			
			//���� ���� �� ������ �ο�(���ڵ�)������ ��ȯ��
			result = pstmt.executeUpdate();
			
		}catch(Exception ex) {
			System.out.println("boardDelete() ����:" + ex);
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
					conn.close();//DB������ ���´�.
				}catch (SQLException ex) {
					ex.printStackTrace();
				}
		}//finally
		return result;
	}
}
