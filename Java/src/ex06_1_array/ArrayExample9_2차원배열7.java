package ex06_1_array;


public class ArrayExample9_2�����迭7 {

	public static void main(String[] args) {
		
		String name[] = {  "��ȣ��", "�̽±�", "���缮", "����" , "�̱���" };
		String sub_name[] =	 { "����", "����", "����" };
						
		int [][] score = { {85, 60, 70},
							{90, 95, 80},
							{75, 80, 100},
							{80,70,95},
							{100,65,80}
							};
		System.out.println("=======�л��� / ���� �������ϱ�======");
		int[] subject=new int[3]; //���� ������ ������ ����
		int[] student=new int[5]; //�л��� ������ ������ ����
		for(int i =0; i<student.length; i++) {
			for (int j = 0; j<subject.length; j++) {
				student[i] += score[i][j];
			}
			System.out.println(name[i] + "����:" + student[i]);
		}
		System.out.println("==================");
		for (int j =0; j<subject.length;j++) {
		for(int i =0; i<student.length; i++) {
			subject[j] += score[i][j];
		}
		System.out.println(sub_name[j] + "���� : " + subject[j]);
		
	}
}
}