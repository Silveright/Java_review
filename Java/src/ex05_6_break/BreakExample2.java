package ex05_6_break;

public class BreakExample2 {

	public static void main(String[] args) {

		for (int i = 0; i <3; i++) {
			for (int j = 0; j <5; j++) {
				System.out.println("(" + i + "," + j + ")");
				if((i==1)&&(j==2))
					break;
//				System.out.printf("(%d,%d)\n",  i ,j );

			}

		}
		System.out.println("³¡.");
	}
}


