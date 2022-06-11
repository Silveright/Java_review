package ex04_06;

public class Oper01_0 {
	public static void main(String[] args) {
		
		int a = 10, b= 4, c;
		
		c = a + b;
		System.out.println(a + "+" + b + "=" + c);
		
		c = a - b;
		System.out.println(a + "-" + b + "=" + c);
		
		c = a * b;
		System.out.println(a + "*" + b + "=" + c);
		
		c = a / b;
		System.out.println(a + "/" + b + "=" + c);

		c = a % b;
		System.out.println(a + "%" + b + "=" + c);
		System.out.printf("%d %% %d = %d%n" , a,b, c);
		
	     double d = (double)a / b;
		System.out.println(a + "/" + b + "=" + d);

		System.out.println("a/b=" + a/b);
		System.out.println("(double)(a/b)=" + (double) (a/b));
		System.out.println("(double)(a)=" + (double) (a));
		System.out.println("(double)a/b=" + (double) a/b);
		System.out.println("a/(double)b=" + a/(double)b);
		System.out.println("(double)a/(double)b=" + (double)a/ (double)b);
		System.out.println(a + "/" + b + "=" + (double) a/b);
	
		
		
	
	}

}
