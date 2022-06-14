package ex18_5_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy_answer {

	public static void main(String[] args) {
		String origialdir = "C:/temp";
		String targetdir = "C:/target";
		String origialFileName = "koala.jpg";
		String targetFileName = "koala_copy.jpg";
		
		//보조스트림 버퍼를 활용해 효율을 높인다. 
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		
		try {
			in = new BufferedInputStream(new FileInputStream(origialdir +"\\"+origialFileName));//파일을 연다
			File to = new File(targetdir);
			
			if(!to.exists()) {//C:/target 디렉토리가 없는 경우
				if(to.mkdir()) {//디렉토리 생성- 생성 시 true, 실패시 false
					System.out.println("새로 만든 디렉토리 이름: " +to.getPath());
				}else {
					System.out.println("디렉토리 생성에 실패했습니다.");
					return;//더이상 수행 할 필요가 없어짐
				}
			}
			
			out = new BufferedOutputStream(
					new FileOutputStream(targetdir+"\\" + targetFileName));
					
			int readCount;
			byte[] readBytes = new byte[1024];
			
			while((readCount = in.read(readBytes))!=-1) {
				//int java.io.FileInputstream.read(byte[] b) throws IOException
				out.write(readBytes);
			}
			System.out.println("복사됨");
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			try {
				if(in != null) in.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(out != null) 
					out.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
