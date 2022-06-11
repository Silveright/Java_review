//StringTokenizer를 이용해 문자열로부터 토큰을 분리하는 프로그램
//공백 문자를 기준으로 토큰을 구분합니다.

package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample1_5 {

	public static void main(String[] args) {
		//true: 구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stock = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);
		
		
		while(stock.hasMoreTokens()) { //토큰이 있는 동안 반복한다.
			String str = stock.nextToken();//문자열로부터 토큰을 추출
			System.out.println(str);
		}
	}
}
