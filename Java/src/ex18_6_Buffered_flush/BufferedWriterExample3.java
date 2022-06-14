package ex18_6_Buffered_flush;
import java.io.*;
public class BufferedWriterExample3 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("src/ex18_6_Buffered_flush/output.txt");
			//두번째 인자는 버퍼 사이즈를 의미한다. - 버퍼에 5개의 문자를 저장할 수 있다.
			bw = new BufferedWriter(fw,5);//보조스트림, 속도를 향상시킨다.
			
			char arr[] = {'내','꺼','인','1','듯',
						  '2','내','꺼','3','아',
						  '닌','4','내','꺼','5',
						  '같','은','6','너'};
			//파일에 반복해서 문자들을 쓴다.
			for(int cnt =0; cnt<arr.length; cnt++)
				bw.write(arr[cnt]);
			
		}catch (IOException ioe) {//Exception - IOException
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {//파일 닫는 명령문을 에러와 상관없이 처리
			try {
				bw.close();
				//보조기반 스트림이 정상적으로 닫힐 때
				//자동으로 flush() 메서드를 호출한다.
				//fw 또한, 자동으로 닫힌다.
			}
			catch(Exception e) {//close메서드가 발생하는 예외 처리
				System.out.println(e.getMessage());
			}
		}
	}
}
