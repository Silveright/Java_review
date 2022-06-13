package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample3_gugudan {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/ex18_2_FileWriter/gugudan.txt");
			
			for (int dan =2; dan <=9; dan++) {
				writer.write("[" + dan + "��]"+"\t");
			}
			writer.write("\n");
			for (int i = 1; i <= 9; i++) {
				for (int j=2; j<=9; j++) {
					
						writer.write(j+"*"+i+"="+(j*i)+"\t");
				}
					writer.write("\n");
			}
			
		}
		catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}

