//StringTokenizer�� �̿��� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� �����մϴ�.

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample1_5 {

	public static void main(String[] args) {
		//true: �����ڵ� ��ū���� �����ϵ��� ����� ����
		StringTokenizer stock = new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		
		
		while(stock.hasMoreTokens()) { //��ū�� �ִ� ���� �ݺ��Ѵ�.
			String str = stock.nextToken();//���ڿ��κ��� ��ū�� ����
			System.out.println(str);
		}
	}
}
