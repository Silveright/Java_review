package ex17_03_Runnable_Interface;
//Runnable �������̽��� �̿��� ��Ƽ ������ ���α׷�
class SmallLetters implements Runnable {
 public void run() {
	 for (char ch = 'a'; ch<='z' ; ch++)
		 System.out.print(ch);
	
	}
}
