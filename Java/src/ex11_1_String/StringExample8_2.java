package ex11_1_String;

public class StringExample8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Java program creates many objects.";
		String message2 = "Java programaaaaaaa many objects.";
		
		
		//������ ���ڰ� ���������� ��ġ�� �ε����� ���մϴ�.
		//�������� �ʴ� ��� -1�� ����
		//���ڿ� �������� �˻�
		
		int index1 = message.lastIndexOf('a');
		System.out.println("a�� ��ġ�� " +index1);
	
		//�ƽ�Ű�ڵ� 97�� �ҹ��� 'a'
		int index2 = message.lastIndexOf(97);
		System.out.println("a�� ��ġ�� " +index2);
		
		//�ƽ�Ű�ڵ� 65�� �빮�� 'A'
		int index23 = message.lastIndexOf(65);
		//'A'�� ���� ���� index���� -1�� ��ȯ
		System.out.println("A�� ��ġ�� " +index23);
		
		//index��ȣ 13��° ���� 'a'�� ã�´�.
		int index3 = message.lastIndexOf('a',13);
		System.out.println("13�� ���� a�� ��ġ�� " +index3);

		
		//index��ȣ 13��° ���� 'a'�� ã�´�.
		int index33 = message2.lastIndexOf('a',13);
		System.out.println("13�� ���� a�� ��ġ�� " +index33);
		
		//"av"�� ���� index�� ã�´�.
		int index4 = message.lastIndexOf("av");
		System.out.println("av�� �����ϴ� index�� " +index4);
		
//		//index��ȣ 12�� °���� "man"�� ���� index�� ã�´�.
//		int index5 = message.lastIndexOf("man",12);
//		System.out.println("12�� ���� man�� ��ġ�� " +index5);
//		
//		int index6 = message.lastIndexOf("java");
//		System.out.println("java ��ġ�� " +index6);
//		
		
		
		
	}

}