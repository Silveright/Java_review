//StringTokenizer�� �̿��� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� �����մϴ�.

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample1_1 {

	public static void main(String[] args) {
		StringTokenizer stock = new StringTokenizer("��� �� ������");
		
		
		String s1 = stock.nextToken();
		System.out.println(s1);
		String s2 = stock.nextToken();
		System.out.println(s2);
		String s3 = stock.nextToken();
		System.out.println(s3);
		
//		String s4 = stock.nextToken();
//		System.out.println(s4);
		//��Ÿ�� ���� �߻� - ������ ��ū�� �� �̻� ����
		
		System.out.println("=========================");
		
		
		
	
	}

}
