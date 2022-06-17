package ex21_5_PreparedStatement;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_different_insert2 {

	public static void main(String[] args) {
		// create table test( no number(10), name varchar2(20) )
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			int result =0, count =0;
			long start = System.currentTimeMillis();
			
			stmt = conn.createStatement();
			for(int i =0; i<10000; i++) {
				String sql = "insert into test(no, name) "
						+ "values(" + i + ",'홍길동')";//소요시간: 2787ms
				
				result = stmt.executeUpdate(sql);
				count += result;
			}
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간: " + (end - start) + "ms");//1219ms
			if(count == 10000)
				System.out.println("삽입완료");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(stmt !=null)
					stmt.close();
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
