//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ� ���α׷�
package ex08_15_01_interface_polymorphism;
public class InterfaceExample2 {
	public static void main(String[] args) {
		Lendable arr0, arr1, arr2;
		//arr0=new Lendable(); ���� �߻�
		arr0 = new SeparateVolume("883��", "Ǫ���� ����", "����");
		arr1 = new SeparateVolume("609.2", "����̼���", "���긮ġ");
		arr2 = new AppCDInfo("02-17","����ũ�μ��񽺸� ���� �ڹ� ���α׷���");
		
		//���� ����� ���� ��¥�� ���ົ 2�ǰ� �η� CD�� ������ ���
		checkOut(arr0, "����", "2022-06-02");
		checkOut(arr1, "����", "2022-06-02");
		checkOut(arr2, "����", "2022-06-02");
		
	
	}
	
	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼��峪 �ʵ� ���� ���θ� üũ�ϱ� ������
	//Lendable �������̽��� checkOut�޼��尡 �־�� ������ ������ ����.
	 static void checkOut(Lendable arr, String borrower, String date) {
		arr.checkOut(borrower, date);
	}
}
