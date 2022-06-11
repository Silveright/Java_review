package ex14_1_Wrapper;
public class Wrapper2_2_String_to_int {
//문자열로 입력된 값을 연산처리하기 위한 방법?
//Run configurations -> arguments에서 값 입력하기
	public static void main(String[] args) {
		int total =0;
		//방법1
		//String -> Integer 객체
		//Integer 객체-> int형 값
		
		
		for (int cnt =0; cnt<args.length; cnt++) {
			System.out.println("args["+cnt+"]="+args[cnt]);
			//인자로 받은 문자열을 가지고 Integer객체를 생성한다.
			Integer obj = Integer.valueOf(args[cnt]);
			
			//Integer 객체 안의 int값을 가져온다.
			total += obj.intValue();//연결된다 >String형인데 int형으로 넣어진다.
		}
		System.out.println("합 ="+total);
		
		//방법2**중요
		//String -> int
		int total2 = 0;
		for(int cnt=0; cnt<args.length;cnt++) {
			total2 += Integer.parseInt(args[cnt]);
		}
		System.out.println("합 ="+total2);
		
	}

}
