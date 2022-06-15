package ex19_assignment;
import java.io.*;
public class ObjectOutputExample_answer {
	/*
	 * �����͸� ����ͷ� ������:system.out
	 * �����͸� ���Ͽ� ���� ��: FileWriter&FileReader 2byte(���ڴ����� �����͸� �ְ� ����)
	 * 					 InputStream&OutputStream byte ������ �ְ� ����(��Ʈ��ũ���� ���� ���)
	 * Stream: �� �������θ� �帥��.
	 * 
	 * ��ü�� �ְ���� �� ���̴� ������Ʈ�� ObjectOutputStream���� writeObject�޼��尡 ��ü�� ��Ʈ�����θ����.
	 */
	public static void main(String[] args) {
		write();

	}

	private static void write() {
		BufferedReader br = null;
		ObjectOutputStream out = null;
		try {
			br = new BufferedReader(new FileReader("jumsu.txt"));
			out = new ObjectOutputStream(new FileOutputStream("jumsu3.txt"));

			while (true) {
				String str = br.readLine();// ���Ϸκ��� �� �྿ �д´�.
				if (str == null)
					break;
				
					String[] li = str.split(" ");
					out.writeObject(new Student(li[0], Integer.parseInt(li[1]), Integer.parseInt(li[2]),
							Integer.parseInt(li[3]))); 

					// �����ڿ� ���� ������ ����Ǿ���.

			
					}
				} catch (FileNotFoundException fnfe) {
					fnfe.printStackTrace();
					System.out.println("���Ϸ� ����� �� �����ϴ�.");
		
				} catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("���Ϸ� ����� �� �����ϴ�.");
				}	finally {
						try {
							if (br != null)
								br.close();
						} catch (IOException e) {
							System.out.println("���� �ݴ� �� �����Դϴ�.");
						}
						
						try {
							if (out != null)
								out.close();
						} catch (IOException e) {
							System.out.println("���� �ݴ� �� �����Դϴ�.");
						}
					}

	}
	
}

