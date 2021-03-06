//StringTokenizer를 이용해 문자열로부터 토큰을 분리하는 프로그램
//공백 문자를 기준으로 토큰을 구분합니다.

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample1_4 {

	public static void main(String[] args) {
		//구분자- 콤마와 수직선
		StringTokenizer stock = new StringTokenizer("사과,배|복숭아", ",|");
		
		
		while(stock.hasMoreTokens()) { //토큰이 있는 동안 반복한다.
			String str = stock.nextToken();//문자열로부터 토큰을 추출
			System.out.println(str);
		}
	}
}
