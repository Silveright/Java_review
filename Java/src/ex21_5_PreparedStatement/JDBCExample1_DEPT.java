package ex21_5_PreparedStatement;
import java.sql.*;
public class JDBCExample1_DEPT {

	public static void main(String[] args) {
		Connection conn = null;
		
		//SQL������ �̸� �����ϵǰ� ����ð����� �μ����� ���� ������ Ȯ���� �� �ִ�.
		//��  SQL������ Ʋ�� �̸� �����س��� ���� ���߿� �����Ѵ�.
		//���� �� ?(��ġȦ��-placeholder)�� ������ �ٲ��.
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1�ܰ�: JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ�: DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			String select_sql = "select * from dept";
			
			//PreparedStatement��ü ���
			pstmt = conn.prepareStatement(select_sql.toString());
			rs = pstmt.executeQuery(select_sql);
			
			/*
			 * Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸�����
			 * select���� �����ϴ� executeQuery��� �޼��尡 �ִ�.
			 * �� �޼��� �Ķ���ͷ� select ������ �Ѱ��־�� �Ѵ�.
			 * �� �޼���� �Ķ���ͷ� �Ѱ��� select ���� �����ͺ��̽��� ���� �����ϰ�
			 * �� ����� ResultSet ��ü�� �����Ѵ�.
			 */
			
			
			
			System.out.println("��ȣ\t�μ���ȣ\t�μ���\t\t����");
			System.out.println("-----------------------------------------------------");
			
			/*
			 * ResultSet��ü�κ��� select���� �������� ��� ���� ���� next()�޼��带 ȣ���ؾ� �Ѵ�.
			 * rs.next() - ���� �� ��ġ�� �̵��ϴ� �޼���
			 * 			   ���� ���� boolean���� ������ ���� �о�Դ����� ����
			 */
			
			int i =0;
			//rs.next() �����͸� ���پ� �̾Ƴ���.
			//������ ����� Ÿ���� ��ġ�ؾ� �Ѵ�.
			while(rs.next()) {//���̻� ���� �����Ͱ� ���������� �ݺ�
				//getInt("deptno"): �÷� deptno���� int������ �����ϴ� �޼���
				int deptno = rs.getInt("deptno");
				
				//getString("dname"): �÷� dname���� String������ �����ϴ� �޼���
				String dname = rs.getString("dname");
				
				String loc = rs.getString("loc");
				
				System.out.printf("%5d\t%5d\t%-15s%s\n",
									++i,deptno,dname,loc);
			}
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(rs!=null)
					rs.close(); //�� �������� ����ߴ� �� ���� �ݴ´�.
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
					conn.close();//DB������ ���´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}
}
