package ex18_3_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample2 {

	public static void main(String[] args) {
		String originalFileName = "C:/temp/koala.jpg";
		String targetFileName = "C:/temp2/koala_copy.jpg";
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(originalFileName);//파일을 연다
			out = new FileOutputStream(targetFileName);
			
			int readCount;
			byte[] readBytes = new byte[1024];
			
			while(true) {
				readCount = in.read(readBytes);
				//int java.io.FileInputstream.read(byte[] b) throws IOException
				
				if(readCount==-1)//읽어온 데이터가 -1이면 반복 중단
					break;
					out.write(readBytes);
			}
			System.out.println("복사됨");
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			try {
				if(out != null) out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(in != null) 
					in.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
