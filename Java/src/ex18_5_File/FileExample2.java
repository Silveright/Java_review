package ex18_5_File;
import java.io.*;
public class FileExample2 {
//File Ŭ������ ���� ���丮 ����
//���� �� �� ��: ���� ���� ���丮 �̸�
//���� �� �� ��: �̹� �ִ� ���丮 �̸�
	public static void main(String[] args) {
		String dir = "C:\\newDirectory";
		//File �ν��Ͻ��� �����ߴٰ� �ؼ� �����̳� ���丮�� �����Ǵ� ���� �ƴϴ�.
		//���� �ν��Ͻ� ������ mkdir()�޼��带 ���� ���丮�� ������ �� �ִ�.
		File f2 = new File(dir);
		if(!f2.exists()) {//C:\\newDirectory ���丮�� ���� ���
			if(f2.mkdir()) {//���丮 ����- ���� �� true, ���н� false
				System.out.println("���� ���� ���丮 �̸�: " +f2.getPath());
			//getPath()-���� ��θ� String���� ��ȯ�Ѵ�.
			}else {
				System.out.println("���丮 ������ �����߽��ϴ�.");
			}
		}else {//C:\\newDirectory ���丮�� �ִ� ���
			System.out.println("�̹� �ִ� ���丮 �̸�: " +f2.getPath());
		}
	}
}
