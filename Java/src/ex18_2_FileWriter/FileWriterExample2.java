package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			//true: append(원래 있던 파일 내용 뒤에 추가로 쓴다.)
			//false: ovewrite(덮어 쓰기 한다.)
			writer = new FileWriter("output.txt",true);//파일을 연다.
			//public FileWriters(String fileName)throws IOException
			//FileWriter 생성자는 IOException에러를 발생하기 때문에
			//IOException 처리문이 있어야 한다.
			char arr[] = {'너','를',' ','사','랑','해'};
			//파일에 반복해서 문자들을 쓴다.
			for(int cnt =0; cnt<arr.length; cnt++)
				writer.write(arr[cnt]);
			//위 두 문장과 같은 의미
			//writer.write(arr);
			writer.write("\n");
		}
		catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}
	}
}
