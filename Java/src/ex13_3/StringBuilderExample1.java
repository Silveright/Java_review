package ex13_3;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("동해물과 백두산이 마르고 ");
		StringBuffer sb2 = new StringBuffer("동해물과 백두산이 마르고 ");
	
		if(sb == sb2)
			System.out.println("sb==sb2 같다");
		else
			System.out.println("sb==sb2 다르다");
		//StringBuffer클래스는 equals()메서드를 오버라이딩 하지 않았다. >>sb==sb2와 같은 결과 boolean java.lang.Object.equals(Object obj)
		if(sb.equals(sb2))
			System.out.println("sb.equals(sb2) 같다");
		else	
			System.out.println("sb.equals(sb2) 다르다");
		
		if(sb.toString().equals(sb2.toString()))//String의 equals메서드를 호출하면 같다는 결과를 얻을 수 있다.
			System.out.println("sb.toString().equals(sb2.toString())같다");
		else	
			System.out.println("sb.toString().equals(sb2.toString())다르다");
	}
}
