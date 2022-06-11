//문자열 추출 메소드
//substring(int beginIndex): beginIndex부터 문자열 끝까지 부분 문자열 리턴
//substring(int beginIndex, int endIndext): 
// 				beginIndex부터 endIndex-1까지 부분 문자열 리턴
package ex11_1_String;
public class StringExample6 {

	public static void main(String[] args) {
		String str = "나를 사랑하는 자바";
		
		for(int cnt =0; cnt<str.length(); cnt++) {
			char ch = str.charAt(cnt); //charAt메서드 호출
			System.out.println("index = " + cnt + " 문자 = " + ch);
		}
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,6));
		
		
	}
}
