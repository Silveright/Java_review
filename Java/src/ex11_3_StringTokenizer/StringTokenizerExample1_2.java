//StringTokenizer�� �̿��� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� �����մϴ�.

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample1_2 {

	public static void main(String[] args) {
		StringTokenizer stock = new StringTokenizer("��� �� ������");
		
		
		while(stock.hasMoreTokens()) { //��ū�� �ִ� ���� �ݺ��Ѵ�.
			System.out.println(stock.nextToken());
		}
	}
}
