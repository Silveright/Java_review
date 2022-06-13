package ex18_1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample4_try_with_resource {

	public static void main(String[] args) {
		char arr[] = new char[64];//���Ͽ� �ִ� ���ڸ� ���� char�迭
		/*1.try-with-resource������ try() ��ȣ �ȿ� ����� �ڿ���
		 *  try���� ���� �� �ڵ����� colse()�޼��带 ȣ���Ѵ�.
		 *  
		 *2. try-with-resource���� ���� �ڵ����� ��ü�� close()�� ȣ��� �� ��������
		 *	 Ŭ������ AutoCloseable�̶�� �������̽��� ������ ���̾�� �Ѵ�.
		 *����) try() {
		 * .....
		 * } catch(){
		 * 
		 * } finally{}
		 * 
		 */
		try(FileReader reader = new FileReader("������ ��.txt");
				) {
			//
			while(true) {
				//Returns: The number of characters read
				//arr�� �迭 ũ�⸸ŭ ���ڸ� �о� arr�� ���� �� ���� ���� ��ȯ
				int num = reader.read(arr);//��ȯ�� ����
				if(num == -1)//�� �̻� ���� ���ڰ� ���� ��� -1 ���� 
					break;
				System.out.println(new String(arr,0,num));
			}//while end
		}//try end 
		catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("���� ���� �� ����.");
		} finally {
			System.out.println("final�Դϴ�.");
		}
	}
}
