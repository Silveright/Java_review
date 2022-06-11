package ex08_Exception;
public class Exceptionex01 {
	public static void main(String[] args) {
		int sum=1 + -2;
		if (sum <0) {
			new Exception ("俊矾惯积");//exception 按眉 积己
		}
		System.out.println(sum);
	}
}
