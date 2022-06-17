package ex21_5_PreparedStatement;
import java.sql.*;
public class JDBCExample1_DEPT {

	public static void main(String[] args) {
		Connection conn = null;
		
		//SQL문장이 미리 컴파일되고 실행시간동안 인수값을 위한 공간을 확보할 수 있다.
		//즉  SQL쿼리의 틀을 미리 생성해놓고 값을 나중에 지정한다.
		//실행 전 ?(위치홀더-placeholder)가 값으로 바뀐다.
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1단계: JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계: DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			String select_sql = "select * from dept";
			
			//PreparedStatement객체 얻기
			pstmt = conn.prepareStatement(select_sql.toString());
			rs = pstmt.executeQuery(select_sql);
			
			/*
			 * Statement 타입은 java.sql 패키지에 속하는 인터페이스 이름으로
			 * select문을 실행하는 executeQuery라는 메서드가 있다.
			 * 이 메서드 파라미터로 select 문장을 넘겨주어야 한다.
			 * 이 메서드는 파라미터로 넘겨준 select 문을 데이터베이스로 보내 실행하고
			 * 그 결과로 ResultSet 객체를 리턴한다.
			 */
			
			
			
			System.out.println("번호\t부서번호\t부서명\t\t지역");
			System.out.println("-----------------------------------------------------");
			
			/*
			 * ResultSet객체로부터 select문의 실행결과를 얻기 위해 먼저 next()메서드를 호출해야 한다.
			 * rs.next() - 다음 행 위치로 이동하는 메서드
			 * 			   리턴 값은 boolean으로 실제로 행을 읽어왔는지의 여부
			 */
			
			int i =0;
			//rs.next() 데이터를 한줄씩 뽑아낸다.
			//가져올 값들과 타입이 일치해야 한다.
			while(rs.next()) {//더이상 읽을 데이터가 없을때까지 반복
				//getInt("deptno"): 컬럼 deptno값을 int형으로 리턴하는 메서드
				int deptno = rs.getInt("deptno");
				
				//getString("dname"): 컬럼 dname값을 String형으로 리턴하는 메서드
				String dname = rs.getString("dname");
				
				String loc = rs.getString("loc");
				
				System.out.printf("%5d\t%5d\t%-15s%s\n",
									++i,deptno,dname,loc);
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
	}
}
