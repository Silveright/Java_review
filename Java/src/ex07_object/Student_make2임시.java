package ex07_object;

public class Student_make2�ӽ� {
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
		
		int c ,r;
		for (r =0; r<5; r++) {
			
		for (c=0; c<3; c++) {
			
			student[r] += score[r][c]; 
			subject[c] += score[r][c]; 
		}
		
//		System.out.print(student[r] + "\t" + student[r]/3);
	

	
	
		 
	}
		System.out.print("\n" +"����" + "\t");
		for (c=0; c<3; c++)
			System.out.print(subject[c] + "\t");
	
	}
} 
	
	
