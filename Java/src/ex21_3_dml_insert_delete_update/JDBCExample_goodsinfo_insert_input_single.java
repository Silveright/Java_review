package ex21_3_dml_insert_delete_update;
import java.sql.*;
public class JDBCExample_goodsinfo_insert_input_single {
	public static void main(String[] args) {
		//"A2000" "�����" 200 "�Ｚ"
		if(args.length !=4) {
			System.out.println("��ǰ�ڵ� ��ǰ�� ���� �����縦 �Է��ϼ���");
			return;
		}
		
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			stmt = conn.createStatement();
			
			/*
				INSERT,UPDATE,DELETE���� �����ϴ� �޼���� executeUpdate()�̴�.
				executeUpdate()�� ���ϰ��� INSERT,UPDATE,DELETE ���� �� row�� ��
				
				1.���� �����͸� �Է��ϴ� ���
				insert into goodsinfo
				values ('A1000', '��� �ڵ���', 100, 'LG')
				
				2.������ �̿��ؼ� �Է��ϴ� ���
				insert into goodsinfo (code, name, price, maker)
				values( 'args[0]�� ��' , 'args[1]�� ��' , 'args[2]�� ��' , 'args[3]�� ��')
			 
			 */
			String single = "'";
			String sql = "insert into goodsinfo "
					+ "values"
					+ "(" +single + args[0] + single+", "
					+	   single + args[1] + single+", "
					+ 				args[2] +		 ", " 
					+	   single + args[3] + single+ ")";
					
			
			System.out.println(sql+"\n");
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum+"���� �߰��Ǿ����ϴ�.");
		} catch(ClassNotFoundException cnfe) {
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

