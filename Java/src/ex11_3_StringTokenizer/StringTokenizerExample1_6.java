//StringTokenizer�� �̿��� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� �����մϴ�.

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample1_6 {

	public static void main(String[] args) {
		//true: �����ڵ� ��ū���� �����ϵ��� ����� ����
		StringTokenizer stock = new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		System.out.println("��ǰ�̸�\t��ǰ ��");
		
		while(stock.hasMoreTokens()) { //��ū�� �ִ� ���� �ݺ��Ѵ�.
			String str = stock.nextToken();//���ڿ��κ��� ��ū�� ����
			if(str.equals("=")) {
				System.out.print('\t');
			}else if(str.equals("|")) {
				System.out.println();
			}else {
				System.out.print(str);
			}
		}
	}
}
