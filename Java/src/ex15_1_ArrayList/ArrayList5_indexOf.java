package ex15_1_ArrayList;
/*
 * ArrayList�� �ִ� ������ �˻��ϴ� ��
 * -indexOf(data): ���ڿ� ���� ���� ���� ù ��° �����͸� ã�� �� ��ġ�� �ε��� ����
 * -lastIndexOf(data): ���ڿ� ���� ���� �������� ������� �����͸� ã�� �� ��ġ�� �ε��� ����
 * -���ڿ� ���� ���� ������ -1 ����
 */
import java.util.ArrayList;

public class ArrayList5_indexOf {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();//�պκп��� �ڷ����� �����ϸ� �޺κ��� ���� ����
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		
		int index1 = list.indexOf("���");
		int index2 = list.lastIndexOf("���");
		System.out.println("ù��° ���: " +index1);
		System.out.println("������ ���: " +index2);
	}

}
