/*
 * StringTokenizer�� ��ɰ� ������ String�� split�޼��� ����
  *** StringTokenizer :010-1234-5678 ��ū �и� ***"
  010
  1234
  5678
  
 String�� split�޼��� �̿�: 010-1234-5678 ��ū�и�
 * 
 */

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample2 {

	public static void main(String[] args) {
		String phone = "010-1234-5678";
		
		StringTokenizer str = new StringTokenizer(phone, "-");
		System.out.println("*** StringTokenizer : "
							+ phone + " ��ū �и� ***");
		String a= str.nextToken();
		String b= str.nextToken();
		String c= str.nextToken();
		System.out.println(a +""+ b+""+ c);
		
//		while (str.hasMoreTokens()) {
//			System.out.println(str.nextToken());
//		}
		
		System.out.println("*** String�� split�޼��� : "
				+ phone + " ��ū �и� ***");
		
//		String a[] = phone.split("-");
//		for(String token: a) {
//			System.out.println(token);
//		}
	}
}
