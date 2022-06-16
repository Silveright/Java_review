package ex21_2_select_statement;
import java.sql.*;
import java.util.Scanner;
public class JDBCExample_goodsinfo_where_input_Scanner {
//�����ͺ��̽��� ���̺�κ��� ���ǿ� �´� �����͸� �Է¹޾� ó���ϴ� ���α׷�
	public static void main(String[] args) {
		
		System.out.println("��ǰ�� �Է��ϼ���");
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
			
			String sel_where_sql = "select code, name, price, maker "//������ �ۼ��� �� ������� ���� (ex-makerfrom ���� �νĵ��� �ʵ���)
					+ "from goodsinfo "
					+ "where name = '" +str+"'";
			
			System.out.println(sel_where_sql+"\n");
			rs = stmt.executeQuery(sel_where_sql);
			
			System.out.println("��ȣ\t��ǰ�ڵ�\t��ǰ��\t\t����\t������");
			System.out.println("------------------------------------------------------");
			
			
			int i =0;

			while(rs.next()) {//���̻� ���� �����Ͱ� ���������� �ݺ�
				String code = rs.getString("code");
				
				String name = rs.getString("name");
				//
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				
				System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n",++i,code,name,price,maker);
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

