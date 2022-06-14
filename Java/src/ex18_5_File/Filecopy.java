package ex18_5_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy {
//File 클래스를 활용해 새로운 디렉토리 생성 후 파일을 디렉토리에 복사하는 예제
	public static void main(String[] args) {
		String originalFileName = "C:/temp/koala.jpg";
		String targetFileName = "C:/target/koala_copy.jpg";
		String target = "C:/target";
		
		File f2 = new File(target);
		if(!f2.exists()) {//C:/target 디렉토리가 없는 경우
			if(f2.mkdir()) {//디렉토리 생성- 생성 시 true, 실패시 false
				System.out.println("새로 만든 디렉토리 이름: " +f2.getPath());
			}else {
				System.out.println("디렉토리 생성에 실패했습니다.");
			}
		}else {//C:/target 디렉토리가 있는 경우
			System.out.println("이미 있는 디렉토리 이름: " +f2.getPath());
		}
		
		
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
