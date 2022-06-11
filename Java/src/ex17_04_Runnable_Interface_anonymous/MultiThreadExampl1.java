package ex17_04_Runnable_Interface_anonymous;
//Runnable 인터페이스를 이용한 멀티 스레드 프로그램
public class MultiThreadExampl1 {
//익명 클래스- 클래스 이름을 만들지 않고 필요한 기능만을 수행하는 클래스 객체 생성
	public static void main(String[] args) {
//Runnable 인터페이스를 구현하는 클래스의 객체를 생성해서 Thread 생성자의 파라미터로 사용한다.
		
		//SmallLetters small = new SmallLetters();
		//Thread thread = new Thread(small);//스레드 생성
		//클래스 이름 없이 객체 생성하기
		Thread thread  = new Thread(new Runnable(){

		    public void run() {
		            for (char ch = 'a'; ch <= 'z'; ch++)
		               System.out.print(ch);
		    }
		   });
		
		thread.start();
		
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ',
					'ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		
		for(char ch: arr)
			System.out.print(ch);
	}
}
