/*
 *Queue �������̽�
 *-LinkedList (Queue �������̽��� ������ Ŭ����)�� ���
 *-FIFO(First Input First Output) ����
 *	���� �Էµ� �ڷᰡ ���� ��µǴ� ����
 */
package ex15_3_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		//ť�� ����� LinkedList ��ü ����
		//LinkedList<String> queue = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();
		System.out.println("�������? " +queue.isEmpty());//true: ������� �Ǵ�
		
		//offer() �޼���: ť�� 3���� �����͸� �߰�
		queue.offer("�䳢");
		queue.offer("�罿");
		queue.offer("ȣ����");
	
		//peek() �޼���: ó�� �����͸� �״�� �� ���·� �����´�.
		System.out.println(queue.peek());
		System.out.println("�������? " + queue.isEmpty());//false- ������� �Ǵ�
		System.out.println("���� = "+ queue.size());
		
		System.out.println("poll() ���");
		while(!queue.isEmpty()) {
			String str = queue.poll();
			//poll()�޼���� ť�� �ִ� �����͸� �����ϸ鼭 �����´�.
			System.out.println(str);
		}
		System.out.println("�������? " + queue.isEmpty());//false- ������� �Ǵ�
		
	}

}
