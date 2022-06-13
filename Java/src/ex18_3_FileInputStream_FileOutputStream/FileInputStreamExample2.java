package ex18_3_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample2 {

	public static void main(String[] args) {
		String originalFileName = "C:/temp/koala.jpg";
		String targetFileName = "C:/temp2/koala_copy.jpg";
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
