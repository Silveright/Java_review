package ex07_object;

public class Student {
	//���� (�������)
	String name;
	int kor, eng, math;

	/*
	//������-
	 * �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ� ����Ǿ�� �� �۾��� ���ؼ��� ���
	 * �����ڵ� �����ε��� ���ɶ� �������� �����ڰ� ������ �� ����
	 *
	 * 
//	 ������ ����
	 �������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵ�
	 �����ڴ� ���� Ÿ���� ����
	 
//	 �Ű������� ���� ������ - �⺻ ������
	 Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� ���ǵǾ� �־�� �Ѵ�
	 �����ڰ� ���� ��� �ڵ����� �߰��Ǵ� ������
	 �Ű������� �ִ� �����ڰ� �Ѱ��� �ۼ��� ��� �⺻ �����ڴ� �ڵ� �߰����� �ʴ���
*/
	public Student(String name, int kor, int eng , int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	
	
	
	int getTotal() {
		
//		int sum = kor + eng + math;
//		return sum;
		return kor+eng+math;
	} 
	float getavrage() {
		return (getTotal()/3f);
		
	} 
	
} 
	
	


