package ex04_10_rel_logic_op;

public class LogicalExample1 {

	public static void main(String[] args) {
		String s1 = "java";
		
		String s2 = new String("java");
		System.out.println("s1=" + s1 + "s2=" + s2);
		
		if(s1==s2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		
		if (s1.equals(s2)) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
	}

}
