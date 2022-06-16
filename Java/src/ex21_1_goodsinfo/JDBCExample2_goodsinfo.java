package ex21_1_goodsinfo;
import java.sql.*;
public class JDBCExample2_goodsinfo {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//select(��ȸ) �� ���� resultset�� �ʿ���
		//row���� �޾� ȭ�鿡 ����Ѵ�.
		try {
			//1�ܰ�: JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ�: DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			/*
			 * ������ ���̽��� �ִ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ��ϴ�.
			 * 2�ܰ迡�� ���� Connection ��ü�� ���� createStatement �޼��带 ȣ���ؼ� ��´�.
			 */
			
			//������ conn��ü�� ���� statement ��ü ���� >> ������ �����ϴ� ������ ��
			stmt = conn.createStatement();
			
			/*
			 * Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸�����
			 * select���� �����ϴ� executeQuery��� �޼��尡 �ִ�.
			 * �� �޼��� �Ķ���ͷ� select ������ �Ѱ��־�� �Ѵ�.
			 * �� �޼���� �Ķ���ͷ� �Ѱ��� select ���� �����ͺ��̽��� ���� �����ϰ�
			 * �� ����� ResultSet ��ü�� �����Ѵ�.
			 */
			
			String select_sql = "select * from goodsinfo";
			//select code,name, price,maker from goodsinfo
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("��ȣ\t��ǰ�ڵ�\t��ǰ��\t\t����\t������");
			System.out.println("------------------------------------------------------");
			
			/*
			 * ResultSet��ü�κ��� select���� �������� ��� ���� ���� next()�޼��带 ȣ���ؾ� �Ѵ�.
			 * rs.next() - ���� �� ��ġ�� �̵��ϴ� �޼���
			 * 			   ���� ���� boolean���� ������ ���� �о�Դ����� ����
			 */
			
			int i =0;
			//rs.next() �����͸� ���پ� �̾Ƴ���.
			//������ ����� Ÿ���� ��ġ�ؾ� �Ѵ�.
			while(rs.next()) {//���̻� ���� �����Ͱ� ���������� �ݺ�
				String code = rs.getString("code");
				
				String name = rs.getString("name");
				//
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				
				System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n",++i,code,name,price,maker);
//				System.out.printf("%3d\t %s\t %-10s\t  %d   %-10s\n",
//									++i, code,  name,     price,     maker);
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

