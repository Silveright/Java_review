package ex07_object;

public class Student_make_array {
	public static void main(String args[]) {
		
	
		Student[] students = {new Student ("��ȣ��" , 85, 60, 70),
							  new Student ("�̽±�" , 90, 95, 80),
							  new Student ("���缮" , 75, 80 , 100),
							  new Student ("����" , 80 , 70, 95),
							  new Student ("�̱���" , 100 , 65, 80) }; //1���� �迭
	
		printInfo(students);
		
	}//main
		
		

	 static void printInfo(Student[] objs) {
		 //Student[] objs = {Student �迭�� �Ѿ��}
		
		 int total[]  = new int[3];
		
		 System.out.println("===========�л��� / ���� ���� ���ϱ�===========");
		 System.out.println("�̸�\t����\t����\t����\t����\t���");
		
		
		for(Student obj : objs) {

			System.out.print(obj.name+"\t"+obj.kor+"\t"
					+obj.eng+"\t"+obj.math+"\t"+ obj.getTotal() +"\t");
			System.out.printf("%.1f\n", obj.getavrage());
//			System.out.println(obj); //�ּҰ��� ��ȯ
			total[0] += obj.kor;
			total[1] += obj.eng;
			total[2] += obj.math;
		}
		
		for (int j =0; j<45; j++) {
			System.out.print("=");
		}
		
		System.out.print("\n" +"����" + "\t");
		for (int i =0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
		}
	 }
}

	
	
