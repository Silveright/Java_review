package ex05_6_break;

public class BreakExample4 {

	public static void main(String[] args) {
		
		outerLoop:
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <5; j++) {
				System.out.println("(" + i + "," + j + ")");
//				System.out.printf("(%d,%d)\n",  i ,j );
				if((i==1)&&(j==2))
					break outerLoop;

			}

		}
		System.out.println("³¡.");
	}
}


