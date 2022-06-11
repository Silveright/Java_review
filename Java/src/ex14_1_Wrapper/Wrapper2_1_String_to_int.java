package ex14_1_Wrapper;
//문자열로 입력된 값을 연산처리하기 위한 방법?
public class Wrapper2_1_String_to_int {

	public static void main(String[] args) {
		int total =0;
		//에러발생(String->int형변환 요구)
		for (int cnt =0; cnt<args.length; cnt++) {
			total = args[cnt] + total;//연결된다 >String형인데 int형으로 넣어진다.
		}
		System.out.println(total);
	}

}
