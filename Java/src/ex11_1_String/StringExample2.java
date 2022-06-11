//String 생성자는

package ex11_1_String;
public class StringExample2 {

	public static void main(String[] args) {
		String str1 = new String("자바");
		String str2 = new String("자바");
		
		if(str1 == str2)
			System.out.println("str1 == str2 같다.");
	 else 
		System.out.println("str1 == str2 다르다.");
		
	}
}
