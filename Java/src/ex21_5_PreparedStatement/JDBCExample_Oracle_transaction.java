package ex21_5_PreparedStatement;
//처음실행-db반영
//두번 실행-db 취소
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample_Oracle_transaction {

	public static void main(String[] args) {
		//transaction: 논리적인 작업 단위
		//insert, delete, update등의 작업들을 하나의 논리적인 작업단위로 묶어
		//쿼리 실행시 모든 작업이 정상처리된 경우에는 commit을 실행해서
		//db에 반영하고 쿼리 실행중 하나라도 정상처리되지 않는 경우
		//rollback 을 실행해서 작업단위 내의 모든 작업을 취소한다.
		
		
		//SQL문 작성하기
		StringBuilder sql1 = new StringBuilder();
		sql1.append("insert into goodsinfo ");
		sql1.append("values(?,?,?,?) ");
		
		StringBuilder sql2 = new StringBuilder();
		sql2.append("update goodsinfo ");
		sql2.append("set price =? ");
		sql2.append("where code = ? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//transaction 시작
			//하나의 논리적인 작업 단위 시작
			//1단계: JDBC드라이버를 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계: DB 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			//autoCommit기능 비활성화
			conn.setAutoCommit(false);
			
			//1번작업 시작
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql1.toString());
			
			//쿼리의 ?에 대체될 실제값 지정하기
			pstmt.setString(1, "10006");
			pstmt.setString(2, "공기청정기");
			pstmt.setInt(3, 500000);
			pstmt.setString(4, "코웨이");
			int result1 = pstmt.executeUpdate();
			pstmt.close();
			//--------1번 작업 종료--------

			//--------2번 작업 시작--------
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql2.toString());
		
			//쿼리의 ?에 대체될 실제값 지정하기
			pstmt.setInt(1, 12345);
			pstmt.setString(2, "10001");
			int result2 = pstmt.executeUpdate();
			//--------2번 작업 종료--------
			
			//쿼리가 정상적으로 실행된 경우 db에 반영
			if(result1 ==1 && result2 ==1) {
				conn.commit();
				System.out.println("db에 반영됨 . . . . . ");
			}else {
				conn.rollback();
				System.out.println("db  반영이 취소 됨 .....");
			}
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch(SQLException se) {
			try {
				System.out.println(se.getMessage());
				conn.rollback();
				System.out.println("db 반영이 취소 됨.....");
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				//Note: When a Statement object is closed, its current ResultSet object,
				//if one exists, is also closed
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
			///transaction 종료
		}
	}

}
