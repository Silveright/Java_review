package ����;


public class Assignment4_2�����迭Ȱ��_���� {

	public static void main(String[] args) {
		
		String name[] = { "��ȣ��", "�̽±�", "���缮", "����", "�̱���" };
		String sub_name[] = { "����", "����", "����" };

		int[][] score = { 
							{ 85, 60, 70 }, 
							{ 90, 95, 80 }, 
							{ 75, 80, 100 }, 
							{ 80, 70, 95 }, 
							{ 100, 65, 80 } };
		int[] subject = new int[3]; 
		int[] student = new int[5]; 
		System.out.println("==========�л��� / ���� �������ϱ�============");
		System.out.print("       ");
		for (String sub : sub_name) {
			System.out.print(sub + "\t");
		}
		System.out.println("���");
		System.out.println();

		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");

				subject[j] += score[i][j];
			}

			int avr = 0;
			for (int j = 0; j < score[i].length; j++) {
				avr += score[i][j];
			}
			System.out.println((float) avr / sub_name.length + "\t");
			System.out.println();

		}
		System.out.println("==========================================");
		System.out.print("��÷\t");
		int i, j;
		for (j = 0; j < subject.length; j++) {
			for (i = 0; i < student.length; i++) {
				student[j] += score[i][j];
			}
			System.out.print(+student[j] + "\t");
		}
	}

}
