package ex21_5_PreparedStatement;
import java.sql.*;
public class JDBCExample_goodsinfo_insert_input_single {
	public static void main(String[] args) {
		//"A2000" "�����" 200 "�Ｚ"
		if(args.length !=4) {
			System.out.println("��ǰ�ڵ� ��ǰ�� ���� �����縦 �Է��ϼ���");
			return;
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
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
			String sql = "insert into goodsinfo "
					+ "values"
					+ "(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, args[0]);
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum+"���� �߰��Ǿ����ϴ�.");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
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
					conn.close();//DB������ ���´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}
}

