package ex07_object;

public class Saram6 {
	//���� (�������)
	String name;
	double w;
	double ki;
	int age;
	
	//������-�ݵν� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� ��
	Saram6(String name, double w, double ki, int age){
		/*
		 * this�� 
		 * 
		*/
		
		this.name=name;
		this.w= w;
		this.ki=ki;
		this.age = age;
	}
	
	Saram6( double w,String name){
		this.name=name;
		this.w= w;
		
	}
	
	//������-�ݵν� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� ��
	
	Saram6(String name2, double w2){
		this.name=name2;
		this.w= w2;
		
	}
	
	
	
	//�޼���
	public void eat() {
		System.out.println(this.name+"��(��) ���� �Դ´�.");
	} //this ��������
	
	//�޼���
	public void walk() {
		System.out.println(this.name+"��(��) �ȱ��� �����Դ� " +w +"�Դϴ�.");
	}
	
	//�޼���
	
	public void sesu() {
		System.out.println(this.name+"��(��) �����Ѵ�.");
	}
	
	
	
}
