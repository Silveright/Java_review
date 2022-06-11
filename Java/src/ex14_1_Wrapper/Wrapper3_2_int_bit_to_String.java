package ex14_1_Wrapper;
/*프리미티브 타입의 비트 패턴을 문자열로 리턴하는 메서드
 * 1.toBinaryString 메서드:2진수
 * 2. toOctalString 메서드: 8진수
 * 3. toHexString 메서드: 16진수
 * 
 */

public class Wrapper3_2_int_bit_to_String {

	public static void main(String[] args) {
		int num =0;
		
		for(int cnt =0; cnt< args.length;cnt++) {
			//인자로 받은 문자열을 int타입의 값으로 바꾸어 합산
			num += Integer.parseInt(args[cnt]);
		}
		System.out.println("합은 = "+num);
		System.out.println("10진수 : " +num + "\t 2진수 :"
				+ Integer.toBinaryString(num));

		System.out.println("10진수 : " +num + "\t 8진수 :"
				+ Integer.toOctalString(num));
		
		System.out.println("10진수 : " +num + "\t 16진수 :"
				+ Integer.toHexString(num));
		//F 색상 2진수 1111-> cs 적용
		
	}

}
