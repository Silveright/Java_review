//문자열 내용을 비교하는 equals메서드

package ex11_1_String;
public class StringExample4 {

	public static void main(String[] args) {
		String str1 = new String("자바");
		String str2 = new String("자바");
		
		if(str1.equals(str2))
			System.out.println("str1.equals(str2) 같다.");
	 else 
		System.out.println("str1.equals(str2) 다르다.");
		
	}
}
