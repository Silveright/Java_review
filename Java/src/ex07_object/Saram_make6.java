package ex07_object;
/*
 �ٸ� Ŭ������ �ִ� �ʵ峪 �޼��带 ����Ϸ��� ���� ��ü�� �����ؾ� �Ѵ�.
 ������ ��ü ����� �����Ϸ��� ��ħǥ �����ڸ� ����Ѵ�
 �� ��������. ����, ��������.�޼���()
*/
public class Saram_make6 {
	
	public static void main(String[] args) {
		
		Saram6 s = new Saram6( "����",47.4,168,27 );
//		s.name="����";
//		s.w=47.4;
//		s.ki=168;
//		s.age=27;
		s.eat();
		s.walk();
		
		Saram6 s2= new Saram6("�ں���", 65,182,23);
//		s2.name = "�ں���";
//		s2.age=24;
//		s2.w=65;
//		s2.ki=182;
		s2.eat();
		s2.sesu();
		s2.walk();
		
		Saram6 s3= new Saram6("ȫ�浿", 80.5);
		s3.age=18;
	
	}
}
