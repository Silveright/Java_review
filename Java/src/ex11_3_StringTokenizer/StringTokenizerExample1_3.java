//StringTokenizer�� �̿��� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� �����մϴ�.

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample1_3 {

	public static void main(String[] args) {
		StringTokenizer stock = new StringTokenizer("���,��,������", ",");
		
		
		while(stock.hasMoreTokens()) { //��ū�� �ִ� ���� �ݺ��Ѵ�.
			String str = stock.nextToken();//���ڿ��κ��� ��ū�� ����
			System.out.println(str);
		}
	}
}
