//File 클래스: 파일 관리 기능을 갖는 클래스
//디렉토리 관리 기능도 가지고 있다.
//%-25s: 25칸을 왼쪽으로 정렬
//%1$tF: YYYY-mm-dd 포맷의 날짜
//%1$tT: HH:MM:SS포맷
package ex18_5_File;
import java.io.*;
import java.util.*;
public class FileExample1 {
	public static void main(String[] args) {
		//상위 디렉토리 경로명을 가지고 File객체 생성
		File file = new File(".");//현재 디렉토리(.)프로젝트 폴더, 상위 디렉토리(..)  (디렉토리=폴더)
		File arr[] = file.listFiles();//서브디렉토리와 파일목록을 가져온다. 반환형:파일의 배열
		
		for(int cnt =0; cnt<arr.length;cnt++) {
			String name = arr[cnt].getName();//이름을 리턴
			
			if(arr[cnt].isFile())//파일이면 true, 아니면 false (파일이 아니다=디렉토리)
				//arr[cnt].length():파일의 크기(바이트)
				System.out.printf("%-25s %7d \t", name, arr[cnt].length());
		
			else
				System.out.printf("%-25s   <DIR> \t", name);
			
			//1970년 1월 1일 0시 0분 0초 기점으로 경과한 밀리세컨드 값을 리턴
			//사람이 이해할 수 있는 날짜와 시간으로 변경해야한다.
			long time = arr[cnt].lastModified();//최종 수정일시를 리턴
//			System.out.printf("%d\n", time);
			
			GregorianCalendar calendar = new GregorianCalendar();
			//setTimeInMillis메서드는 객체가 가지고 있는 시각정보를 파라미터 값으로 갱신하는 메서드
			//이때 파라미터는 197-년 1월 1일 0시 0분 0초를 기점으로 경과한 밀리세컨드 값이어야 한다.
			calendar.setTimeInMillis(time);
			//%1$tF: YYYY-mm-dd 포맷의 날짜
			//%1$tT: HH:MM:SS포맷
			System.out.printf("%tF %tT \n", calendar, calendar);
			//동일 변수를 처리할 경우 $를 사용한다. 1: 첫번째 변수에 적용한다.
//			System.out.printf("%1$tF %1$tT \n", calendar);
		}
	}
}
