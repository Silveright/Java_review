package ex21_5_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*PreparedStatement
 * 
 * 1.PreparedStatement�� �θ�� Statement�̴�.
 * 2.SQL ������ ������ ���ؼ� �������� �ʿ��ѵ� PreparedStatement�� ������ �������� �Ѵ�.
 * 	 ex)psmt = conn.prepatedStatement(sql);
 * 3. PreparedStatement�� SQL������ �̸� �������� �Ǳ� ������ ���ǹ��� �ٲ��� �ʰ�
 * 	  ���ǰ��� �ٲ�� ���, ������ �����͸� �ٲ�� ��� � ����ϸ� ����.
 * 	  ��, �� �� �̸� �������� �صθ� ���� ������ ���� �������� ���� �ʰ� ���� �����ؼ� �����Ѵ�.
 * 	  Statement�� ���� ������� �ص� �Ź� ������ ������ ��ģ��.
 * 	  ���� ���� ������ �����ϴ��� PreparedStatement�� Statement���� ����ӵ��� ������.
 * 	 			��)insert into test(no, ename) values(1,'ȫ�浿');
 * 	 			��)insert into test(no, ename) values(2,'ȫ�浿');
 * 	 			��)insert into test(no, ename) values(3,'ȫ�浿');
 * 
 * 4. 3���� �����ϱ� ���� ������ ������ ���� �����Ѵ�.
 *	  �ٲ�� ���� ���ؼ� ?(��ġȦ��-placeholder, �Է¸Ű�����)�� ǥ���Ѵ�.
 *		��) insert into test(no, ename) values(?,?);
 *
 *5. ?�� ���� ���� �����ϱ� ���� set�ڷ���()�޼��带 ����Ѵ�.
 *		��) ù��° ?�� ���ǰ��� ������ 1�� ��� setInt(1,1)
 *		��) �ι�° ?�� ���ǰ��� ������ 'ȫ�浿'�� ��� setString(2, "ȫ�浿")
 *			Statement�� SQL���忡�� single quotation(')�� �ʿ��� ��� ���� �ۼ��� �־�����
 * 			PreparedStatement�� �ڷ����� ���� �˾Ƽ� single quotation�� ó�����ش�.
 * 
 * 6. ���� ������ ������ �����ϴ� executeUpdate() ȣ���Ѵ�.
 */
public class JDBC_different_insert {

	public static void main(String[] args) {
		// create table test( no number(10), name varchar2(20) )
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"SCOTT","TIGER");
			
			int result =0, count =0;
			long start = System.currentTimeMillis();
			String sql = "insert into test(no, name) "
					+ "values(?,?)";
			pstmt = conn.prepareStatement(sql);
			for(int i =0; i<10000; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "ȫ�浿");
				result = pstmt.executeUpdate();
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
