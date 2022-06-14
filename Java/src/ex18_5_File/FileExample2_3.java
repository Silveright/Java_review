package ex18_5_File;

import java.io.File;
//File클래스를 이용해 파일, 디렉토리 생성 및 삭제 변경
public class FileExample2_3 {

	public static void main(String[] args) {
		//디렉토리 삭제
		/*
		 * boolean java.io.File.delete() 디렉토리 삭제
		 * 단, 디렉토리 안에 파일이 있으면 삭제하지 못한다.
		 * 이때 반환값은 false가 된다.
		 */
		File f4 = new File("C:\\newDirectory");
		if(f4.exists()) {
			if(f4.delete()) {//디렉토리 삭제
				System.out.println(f4.getPath()+" 삭제했습니다.");
			}else {
				System.out.println(f4.getPath()+" 삭제하지 못했습니다.");
			}
		}else {
			System.out.println(f4.getPath()+"에 삭제하고자 하는 파일이 없습니다.");
		}
	}
}
