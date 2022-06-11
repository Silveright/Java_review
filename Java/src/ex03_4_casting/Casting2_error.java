package ex03_4_casting;

public class Casting2_error {
	public static void main(String[] args) {
		
//		float ft = 3.14; //더블형을 플로트형으로 전환할 수 없다
		float ft = (float) 3.14;
		float ft2 = 3.14f;
		System.out.println(ft);
		System.out.println(ft2);
	}

}
