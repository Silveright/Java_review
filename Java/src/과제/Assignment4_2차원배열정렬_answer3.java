package ����;


public class Assignment4_2�����迭����_answer3 {

	public static void main(String[] args) {
		
		String name[] = { "��ȣ��", "�̽±�", "���缮", "����", "�̱���" };
		String sub_name[] = { "����", "����", "����" };

		int[][] score = { 
				{ 85, 60, 70 }, 
				{ 90, 95, 80 }, 
				{ 75, 80, 100 }, 
				{ 80, 70, 95 }, 
				{ 100, 65, 80 } 
		};
		int[] subject = new int[3];
		int[] student = new int[5];
		
		int r,c;
		
		System.out.println();
		for (int i =0; i<10; i++)
			System.out.print("=");
		
		System.out.print("�л���  /  ���� ���� ���ϱ�  ");
		for(int i=0; i<10; i++)
			System.out.print("=");
		
		System.out.print("\n\t");
		for (c=0; c<3; c++)
			System.out.print(sub_name[c]+"\t");
		
		System.out.print("����\t���");
		
		for (r =0; r<5; r++) {
			System.out.print("\n" + name[r] + "\t");
			
			for (c=0; c<3; c++) {
				System.out.print(score[r][c] + "\t");
				student[r] += score[r][c]; 
				subject[c] += score[r][c]; 
			}
			System.out.printf("%d\t%.1f" , student[r], student[r]/3.0);
//			System.out.print(student[r] + "\t" + student[r]/3);
		}
	
		System.out.println();
		for (int i =0; i<45; i++)
			System.out.print("=");
		
		System.out.print("\n" +"����" + "\t");
		for (c=0; c<3; c++)
			System.out.print(subject[c] + "\t");
	}
	}


		
	

