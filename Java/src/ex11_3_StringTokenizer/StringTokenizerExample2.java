/*
 * StringTokenizer의 기능과 유사한 String의 split메서드 사용법
  *** StringTokenizer :010-1234-5678 토큰 분리 ***"
  010
  1234
  5678
  
 String의 split메서드 이용: 010-1234-5678 토큰분리
 * 
 */

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample2 {

	public static void main(String[] args) {
		String phone = "010-1234-5678";
		
		StringTokenizer str = new StringTokenizer(phone, "-");
		System.out.println("*** StringTokenizer : "
							+ phone + " 토큰 분리 ***");
		String a= str.nextToken();
		String b= str.nextToken();
		String c= str.nextToken();
		System.out.println(a +""+ b+""+ c);
		
//		while (str.hasMoreTokens()) {
//			System.out.println(str.nextToken());
//		}
		
		System.out.println("*** String의 split메서드 : "
				+ phone + " 토큰 분리 ***");
		
//		String a[] = phone.split("-");
//		for(String token: a) {
//			System.out.println(token);
//		}
	}
}
