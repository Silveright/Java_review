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
		
		//������Ʈ�� ���۸� Ȱ���� ȿ���� ���δ�. 
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		
		try {
			in = new BufferedInputStream(new FileInputStream(origialdir +"\\"+origialFileName));//������ ����
			File to = new File(targetdir);
			
			if(!to.exists()) {//C:/target ���丮�� ���� ���
				if(to.mkdir()) {//���丮 ����- ���� �� true, ���н� false
					System.out.println("���� ���� ���丮 �̸�: " +to.getPath());
				}else {
					System.out.println("���丮 ������ �����߽��ϴ�.");
					return;//���̻� ���� �� �ʿ䰡 ������
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
			System.out.println("�����");
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
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
