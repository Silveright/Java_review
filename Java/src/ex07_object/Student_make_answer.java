package ex07_object;

public class Student_make_answer {
	public static void main(String args[]) {
		Student s = new Student ("��ȣ��" , 85, 60, 70);
		Student s1 = new Student ("�̽±�" , 90, 95, 80);
		Student s2 = new Student ("���缮" , 75, 80 , 100);
		Student s3 = new Student ("����" , 80 , 70, 95);
		Student s4 = new Student ("�̱���" , 100 , 65, 80);
		
		int total[]  = new int[3];
		System.out.println("===========�л��� / ���� ���� ���ϱ�===========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
		System.out.print(s.name+"\t"+s.kor+"\t"+s.eng+"\t"+s.math+"\t"+ s.getTotal() +"\t");
		System.out.printf("%.1f\n", s.getavrage());
		
		System.out.print(s1.name+"\t"+s1.kor+"\t"+s1.eng+"\t"+s1.math+"\t"+ s1.getTotal() +"\t");
		System.out.printf("%.1f\n", s1.getavrage());
		
		System.out.print(s2.name+"\t"+s2.kor+"\t"+s2.eng+"\t"+s2.math+"\t"+ s2.getTotal() +"\t");
		System.out.printf("%.1f\n", s2.getavrage());
		
		System.out.print(s3.name+"\t"+s3.kor+"\t"+s3.eng+"\t"+s3.math+"\t"+ s3.getTotal() +"\t");
		System.out.printf("%.1f\n", s3.getavrage());
		
		System.out.print(s4.name+"\t"+s4.kor+"\t"+s4.eng+"\t"+s4.math+"\t"+ s4.getTotal() +"\t");
		System.out.printf("%.1f\n", s4.getavrage());
		
		
		total[0] =s.kor + s1.kor + s2.kor + s3.kor + s4.kor;
		total[1]=s.eng+ s1.eng + s2.eng +s3.eng +s4.eng;
		total[2] = s.math +s1.math +s2.math +s3.math +s4.math;
		
		for(int j=0;j<45;j++) {
		 System.out.print("=");
		}
		System.out.print("\n" +"����" + "\t");
		for (int i =0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
		}	
	}
} 
	
	
