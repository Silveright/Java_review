package ex07_object;
/*
 �ٸ� Ŭ������ �ִ� �ʵ峪 �޼��带 ����Ϸ��� ���� ��ü�� �����ؾ� �Ѵ�.
 ������ ��ü ����� �����Ϸ��� ��ħǥ �����ڸ� ����Ѵ�
 �� ��������. ����, ��������.�޼���()
*/
public class Saram_make5 {
	
	public static void main(String[] args) {
		
		Saram5 s = new Saram5( "����", 47.4);
//		s.name="����";
//		s.w=47.4;
		s.ki=168;
		s.age=27;
		s.eat();
		s.walk();
		
		Saram5 s2= new Saram5( 65, "�ں���");
//		s2.name = "�ں���";
		s2.age=24;
//		s2.w=65;
		s2.ki=182;
		s2.eat();
		s2.sesu();
		s2.walk();
	
	}
}
