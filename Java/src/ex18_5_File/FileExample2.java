package ex18_5_File;
import java.io.*;
public class FileExample2 {
//File 클래스를 통해 디렉토리 생성
//실행 한 번 후: 새로 만든 디렉토리 이름
//실행 두 번 후: 이미 있는 디렉토리 이름
	public static void main(String[] args) {
		String dir = "C:\\newDirectory";
		//File 인스턴스를 생성했다고 해서 파일이나 디렉토리가 생성되는 것이 아니다.
		//먼저 인스턴스 생성후 mkdir()메서드를 통해 디렉토리를 생성할 수 있다.
		File f2 = new File(dir);
		if(!f2.exists()) {//C:\\newDirectory 디렉토리가 없는 경우
			if(f2.mkdir()) {//디렉토리 생성- 생성 시 true, 실패시 false
				System.out.println("새로 만든 디렉토리 이름: " +f2.getPath());
			//getPath()-파일 경로를 String으로 반환한다.
			}else {
				System.out.println("디렉토리 생성에 실패했습니다.");
			}
		}else {//C:\\newDirectory 디렉토리가 있는 경우
			System.out.println("이미 있는 디렉토리 이름: " +f2.getPath());
		}
	}
}
