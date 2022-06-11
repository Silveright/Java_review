package ex06_2_sort;


public class MethodEx18_�������� {

	public static void main(String args[]) {
		
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
		
		cal(subject, student,score);
//		System.out.println("\n\n\n");
		
		sort(name,score,student);
		print(sub_name,name,score,student,subject);
	}


private static void print(String[] sub_name, String[] name, 
							int[][] score, int[] student, int[] subject) {
	int c,r;
	System.out.println();
	for(int i=0;i<10;i++)
		System.out.print("=");
	
	System.out.print("�л���  /  ���� ���� ���ϱ�  ");
	for(int i=0; i<10; i++)
		System.out.print("=");
	
	System.out.print("\n\t");
	for (c=0; c<3; c++)
		System.out.print(sub_name[c]+"\t");
	
	System.out.print("����\t���");
	
	for (r =0; r<score.length; r++) {
		System.out.print("\n" + name[r] + "\t");
		
		for (c=0; c<score[r].length; c++) {
			System.out.print(score[r][c] + "\t");
//			student[r] += score[r][c]; 
//			subject[c] += score[r][c]; 
		}
		System.out.printf("%d\t%.1f" , student[r], student[r]/3.0);
//		System.out.print(student[r] + "\t" + student[r]/3);
	}

	System.out.println();
	for (int i =0; i<45; i++)
		System.out.print("=");
	
	System.out.print("\n" +"����" + "\t");
	for (c=0; c<3; c++)
		System.out.print(subject[c] + "\t");
}


private static void sort(String[] name, int[][] score, int[] student){
	for (int i =0; i<student.length-1; i++) {
		for (int j = i+1; j<student.length; j++) {
			if(student[i]>student[j]) {
				
				int imsi= student[i];
				student[i]=student[j];
				student[j] = imsi;
				
				int imsi2[] = score[i];
				score[i] = score[j];
				score[j] =imsi2;
				
				String imsi3= name[i];
				name[i] =name[j];
				name[j]=imsi3;
			}
		}
	}
}


public static void cal(int[] subject, int[] student, int[][] score) {
	for (int r =0; r<score.length; r++) {
		
		for (int c=0; c<score[r].length; c++) {
			student[r] += score[r][c]; 
			subject[c] += score[r][c]; 
			}
		}
	}
}
