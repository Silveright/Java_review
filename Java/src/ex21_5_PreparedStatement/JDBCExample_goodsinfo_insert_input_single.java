package ex21_5_PreparedStatement;
import java.sql.*;
public class JDBCExample_goodsinfo_insert_input_single {
	public static void main(String[] args) {
		//"A2000" "모니터" 200 "삼성"
		if(args.length !=4) {
			System.out.println("상품코드 상품명 가격 제조사를 입력하세요");
			return;
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			/*
				INSERT,UPDATE,DELETE문을 실행하는 메서드는 executeUpdate()이다.
				executeUpdate()의 리턴값은 INSERT,UPDATE,DELETE 수행 된 row의 수
				
				1.직접 데이터를 입력하는 경우
				insert into goodsinfo
				values ('A1000', '고급 핸드폰', 100, 'LG')
				
				2.변수를 이용해서 입력하는 경우
				insert into goodsinfo (code, name, price, maker)
				values( 'args[0]의 값' , 'args[1]의 값' , 'args[2]의 값' , 'args[3]의 값')
			 
			 */
			String sql = "insert into goodsinfo "
					+ "values"
					+ "(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, args[0]);
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
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

