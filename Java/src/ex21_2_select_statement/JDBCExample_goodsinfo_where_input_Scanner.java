package ex21_2_select_statement;
import java.sql.*;
import java.util.Scanner;
public class JDBCExample_goodsinfo_where_input_Scanner {
//데이터베이스의 테이블로부터 조건에 맞는 데이터를 입력받아 처리하는 프로그램
	public static void main(String[] args) {
		
		System.out.println("상품명 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
			
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			stmt = conn.createStatement();
			
			String sel_where_sql = "select code, name, price, maker "//나눠서 작성할 시 띄워쓰기 주의 (ex-makerfrom 으로 인식되지 않도록)
					+ "from goodsinfo "
					+ "where name = '" +str+"'";
			
			System.out.println(sel_where_sql+"\n");
			rs = stmt.executeQuery(sel_where_sql);
			
			System.out.println("번호\t상품코드\t상품명\t\t가격\t제조사");
			System.out.println("------------------------------------------------------");
			
			
			int i =0;

			while(rs.next()) {//더이상 읽을 데이터가 없을때까지 반복
				String code = rs.getString("code");
				
				String name = rs.getString("name");
				//
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				
				System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n",++i,code,name,price,maker);
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

