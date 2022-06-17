
package ex21_4_select_statement_search_1;

import java.sql.*;
import java.util.ArrayList;
public class DAO {//데이터를 담아 가지고 오는 역할만 수행
	
	/*
	 * DAO(Data Access Object)클래스
	 * -데이터 베이스와 연동하여 레코드의 추가, 수정, 삭제 작업이 이루어지는 클래스
	 */
	public ArrayList<Emp> search(int menu, String word) {
		ArrayList<Emp> list = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1단계: JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계: DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			/*
			 * 데이터 베이스에 있는 테이블의 데이터를 읽어오기 위해 Statement 객체가 필요하다.
			 * 2단계에서 얻은 Connection 객체에 대해 createStatement 메서드를 호출해서 얻는다.
			 */
			
			//연결한 conn객체를 통해 statement 객체 생성 >> 쿼리를 수행하는 역할을 함
			stmt = conn.createStatement();
			
			/*
			 * Statement 타입은 java.sql 패키지에 속하는 인터페이스 이름으로
			 * select문을 실행하는 executeQuery라는 메서드가 있다.
			 * 이 메서드 파라미터로 select 문장을 넘겨주어야 한다.
			 * 이 메서드는 파라미터로 넘겨준 select 문을 데이터베이스로 보내 실행하고
			 * 그 결과로 ResultSet 객체를 리턴한다.
			 */
			String[] column_name = {"empno","ename","job","mgr","hiredate","sal","comm","deptno","end"};
			String select_sql;
			if (column_name[menu].equals("ename") || column_name[menu].equals("job")
					|| column_name[menu].equals("hiredate")) {
				String single = "'";
				System.out.println("select * from emp " + 
								"where " + column_name[menu] + 
								" = " + single + word + single);
				select_sql = "select * from emp " + 
								"where " + column_name[menu] + 
								" = " + single + word+ single;
			} else if (column_name[menu].equals("end")) {
				System.out.println("select * from emp");
				select_sql = "select * from emp";
				
			}
			else {
				System.out.println("select * from emp " + "where " + column_name[menu] + " = " + word);
				select_sql = "select * from emp " + "where " + column_name[menu] + " = " + word;
			}
			rs = stmt.executeQuery(select_sql);
			
			int i =0;
			
			while(rs.next()) {//더이상 읽을 데이터가 없을때까지 반복
				//if (i==0)
				if(i++ ==0) {
					list = new ArrayList<Emp>();//데이터 있는 경우 딱 한번만 만들어진다.
				}
				//i++;
				Emp st = new Emp();
				st.setEmpno(rs.getInt(1));
				st.setEname(rs.getString(2));
				st.setJob(rs.getString(3));
				st.setMgr(rs.getInt(4));
				st.setHiredate(rs.getDate(5));
				st.setSal(rs.getInt(6));
				st.setComm(rs.getInt(7));
				st.setDeptno(rs.getInt(8));
				list.add(st);
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
		return list;
		//return null;
	}
	
}
