package ����;


public class Assignment4_2�����迭_����4 {

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
		int[] student = new int[5];//�л�����
		
	
		System.out.println();
		for (int i =0; i<10; i++)
			System.out.print("=");
		
		System.out.print("�л���  /  ���� ���� ���ϱ�  ");
		for(int i=0; i<10; i++)
			System.out.print("=");
		
		System.out.print("\n\t");
	
		for (int c=0; c<3; c++)
			System.out.print(sub_name[c]+"\t");
		
		System.out.println("����\t���");
		
		for (int i =0; i<3; i++) {
			for (int j=0; j<5; j++) {
				student[j]=score[j][i] +student[j];
				subject[i]=score[j][i] +subject[i];
			}
		}
			int rank[] = {1,1,1,1,1};
			for(int i =0; i<5;++i)
				for(int j=0; j<5; ++j) {
					if(student[i]>student[j])
						rank[j]++;
				}
//				
		for (int i =0; i<student.length-1; i++) {
			for (int j = i+1; j<student.length; j++) {
				if(student[i]>student[j]) {
					String imsi_name;
					
					imsi_name =name[i];
					name[i] =name[j];
					name[j]=imsi_name;
					
					int imsi2[] = score[i];
					score[i] = score[j];
					score[j] =imsi2;
					
					int imsi= student[i];
					student[i]=student[j];
					student[j] = imsi;
					
					imsi=rank[i];
					rank[i]=rank[j];
					rank[j]=imsi;
				}
	}
}
for(int i=0;i<5;i++) {
	System.out.print(name[i]+"\t");
	for(int j =0; j<3; j++) {
		System.out.print(score[i][j]+"\t");
	}
	System.out.print(student[i]+"\t" +(student[i]/3.0)+"\t");
	System.out.println();
				}
		
		
		System.out.println("====================================");
		System.out.print("����"+"\t");
		for(int i=0;i<3;i++) {
			System.out.print(subject[i]+"\t");
		
	}
	}
	}







