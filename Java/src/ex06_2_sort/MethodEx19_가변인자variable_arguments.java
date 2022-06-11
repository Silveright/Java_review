package ex06_2_sort;

public class MethodEx19_가변인자variable_arguments {
	/*
	 * 가변인자 (variable arguments)
	 	: 매개 변수의 개수를 고정적이 아닌 동적으로 지정해 줄 수 있다
		형식) 타입...변수면
		규칙) 가변인자 이외 또 다른 매개 변수가 있는 경우 가변인자를 매개변수 중에서 제일 마지막에 선언해야 함
	*
	*/
	
	public static String concatenate(String delim, String...str) {
		String result = "";
		
		for (String imsi : str)
			result+= imsi +delim;
		return result;
	}
	public static void main (String args[]) {
		System.out.println(concatenate(",", "사과","배"));
		System.out.println(concatenate(",", "사과","배","멜론"));
		System.out.println(concatenate(",", "사과","배","멜론","키위"));
		System.out.println(concatenate(",",
			new String[] {"사과", "배", "멜론", "키위"}));
			}
		}

