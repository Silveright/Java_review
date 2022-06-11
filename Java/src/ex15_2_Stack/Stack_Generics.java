package ex15_2_Stack;
import java.util.Stack;
public class Stack_Generics {

	public static void main(String[] args) {
		//LIFO(last input first out) ���� - �������� �Էµ� �ڷᰡ ���� ���� ��µǴ� ����
		//Stack ��ü ����
		Stack<String> s = new Stack<String>();
		System.out.println("�������?" + s.empty());//true: ������� �Ǵ�
		
		//Stack�� ���� ����
		s.push("���ƿ�");
		s.push("�ڹ�");

		System.out.println("�������?" + s.empty());//false: ������� �Ǵ�
		
		//������ ������ �������� �޼���
		System.out.println("�� ������ ������: "+s.peek());
		
		//Stack�� ���� ���
		while(!s.empty()) {//���� �ִ� ���ȸ� �ݺ�
			System.out.println("������ ���: " +s.pop());
			System.out.println("���� ������ ����: "+ s.size());
		}
		System.out.println("�������?" + s.empty());//true- ������� �Ǵ�
	}

}
