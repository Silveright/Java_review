package ex06_1_array;


public class ArrayExample9_2�����迭8 {

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
		int r,c;
		for(c =0; c<subject.length; c++) {
			for (r = 0; r<student.length; r++) {
				student[c] += score[r][c];
			}
			System.out.print (+student[c]+"\t");
		}
		
		
	}
}
