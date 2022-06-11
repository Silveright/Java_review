package ex17_03_Runnable_Interface;
//Runnable 인터페이스를 이용한 멀티 스레드 프로그램
class SmallLetters implements Runnable {
 public void run() {
	 for (char ch = 'a'; ch<='z' ; ch++)
		 System.out.print(ch);
	
	}
}
