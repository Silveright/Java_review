package ex18_5_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy {
//File Ŭ������ Ȱ���� ���ο� ���丮 ���� �� ������ ���丮�� �����ϴ� ����
	public static void main(String[] args) {
		String originalFileName = "C:/temp/koala.jpg";
		String targetFileName = "C:/target/koala_copy.jpg";
		String target = "C:/target";
		
		File f2 = new File(target);
		if(!f2.exists()) {//C:/target ���丮�� ���� ���
			if(f2.mkdir()) {//���丮 ����- ���� �� true, ���н� false
				System.out.println("���� ���� ���丮 �̸�: " +f2.getPath());
			}else {
				System.out.println("���丮 ������ �����߽��ϴ�.");
			}
		}else {//C:/target ���丮�� �ִ� ���
			System.out.println("�̹� �ִ� ���丮 �̸�: " +f2.getPath());
		}
		
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(originalFileName);//������ ����
			out = new FileOutputStream(targetFileName);
			
			int readCount;
			byte[] readBytes = new byte[1024];
			
			while(true) {
				readCount = in.read(readBytes);
				//int java.io.FileInputstream.read(byte[] b) throws IOException
				
				if(readCount==-1)//�о�� �����Ͱ� -1�̸� �ݺ� �ߴ�
					break;
				out.write(readBytes);
			}
			System.out.println("�����");
		}catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
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
