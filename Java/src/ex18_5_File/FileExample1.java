//File Ŭ����: ���� ���� ����� ���� Ŭ����
//���丮 ���� ��ɵ� ������ �ִ�.
//%-25s: 25ĭ�� �������� ����
//%1$tF: YYYY-mm-dd ������ ��¥
//%1$tT: HH:MM:SS����
package ex18_5_File;
import java.io.*;
import java.util.*;
public class FileExample1 {
	public static void main(String[] args) {
		//���� ���丮 ��θ��� ������ File��ü ����
		File file = new File(".");//���� ���丮(.)������Ʈ ����, ���� ���丮(..)  (���丮=����)
		File arr[] = file.listFiles();//������丮�� ���ϸ���� �����´�. ��ȯ��:������ �迭
		
		for(int cnt =0; cnt<arr.length;cnt++) {
			String name = arr[cnt].getName();//�̸��� ����
			
			if(arr[cnt].isFile())//�����̸� true, �ƴϸ� false (������ �ƴϴ�=���丮)
				//arr[cnt].length():������ ũ��(����Ʈ)
				System.out.printf("%-25s %7d \t", name, arr[cnt].length());
		
			else
				System.out.printf("%-25s   <DIR> \t", name);
			
			//1970�� 1�� 1�� 0�� 0�� 0�� �������� ����� �и������� ���� ����
			//����� ������ �� �ִ� ��¥�� �ð����� �����ؾ��Ѵ�.
			long time = arr[cnt].lastModified();//���� �����Ͻø� ����
//			System.out.printf("%d\n", time);
			
			GregorianCalendar calendar = new GregorianCalendar();
			//setTimeInMillis�޼���� ��ü�� ������ �ִ� �ð������� �Ķ���� ������ �����ϴ� �޼���
			//�̶� �Ķ���ʹ� 197-�� 1�� 1�� 0�� 0�� 0�ʸ� �������� ����� �и������� ���̾�� �Ѵ�.
			calendar.setTimeInMillis(time);
			//%1$tF: YYYY-mm-dd ������ ��¥
			//%1$tT: HH:MM:SS����
			System.out.printf("%tF %tT \n", calendar, calendar);
			//���� ������ ó���� ��� $�� ����Ѵ�. 1: ù��° ������ �����Ѵ�.
//			System.out.printf("%1$tF %1$tT \n", calendar);
		}
	}
}
