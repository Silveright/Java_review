package ex18_5_File;

import java.io.File;
//FileŬ������ �̿��� ����, ���丮 ���� �� ���� ����
public class FileExample2_3 {

	public static void main(String[] args) {
		//���丮 ����
		/*
		 * boolean java.io.File.delete() ���丮 ����
		 * ��, ���丮 �ȿ� ������ ������ �������� ���Ѵ�.
		 * �̶� ��ȯ���� false�� �ȴ�.
		 */
		File f4 = new File("C:\\newDirectory");
		if(f4.exists()) {
			if(f4.delete()) {//���丮 ����
				System.out.println(f4.getPath()+" �����߽��ϴ�.");
			}else {
				System.out.println(f4.getPath()+" �������� ���߽��ϴ�.");
			}
		}else {
			System.out.println(f4.getPath()+"�� �����ϰ��� �ϴ� ������ �����ϴ�.");
		}
	}
}
