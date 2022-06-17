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
						+ "values(" + i + ",'ȫ�浿')";//�ҿ�ð�: 2787ms
				
				result = stmt.executeUpdate(sql);
				count += result;
			}
			long end = System.currentTimeMillis();
			
			System.out.println("�ҿ�ð�: " + (end - start) + "ms");//1219ms
			if(count == 10000)
				System.out.println("���ԿϷ�");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
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
					conn.close();//DB������ ���´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}

}
