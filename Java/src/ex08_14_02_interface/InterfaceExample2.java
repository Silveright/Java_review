//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ� ���α׷�
package ex08_14_02_interface;
public class InterfaceExample2 {
	public static void main(String[] args) {
		SeparateVolume obj1
			= new SeparateVolume("863��774��", "����", "��������");
		obj1.checkOut("ȫ�浿", "2021-10-25");
		obj1.checkIn();
		
		AppCDInfo obj2
		= new AppCDInfo("2005-7001", "Redhat Fedora");
		obj2.checkOut("ȫ�浿", "2021-10-25");
		obj2.checkIn();
	}
}
