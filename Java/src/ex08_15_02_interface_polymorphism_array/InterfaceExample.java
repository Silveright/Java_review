//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ� ���α׷�
package ex08_15_02_interface_polymorphism_array;
public class InterfaceExample {
	public static void main(String[] args) {
//		Lendable arr0, arr1, arr2;
		//arr0=new Lendable(); ���� �߻�
		
		Lendable arr[] = new Lendable[3];
		arr[0] = new SeparateVolume("883��", "Ǫ���� ����", "����");
		arr[1] = new SeparateVolume("609.2", "����̼���", "���긮ġ");
		arr[2] = new AppCDInfo("02-17","����ũ�μ��񽺸� ���� �ڹ� ���α׷���", "������");
		
		//���� ����� ���� ��¥�� ���ົ 2�ǰ� �η� CD�� ������ ���
		checkOutAll(arr, "����", "2022-06-02");
		
	
	}
	
	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼��峪 �ʵ� ���� ���θ� üũ�ϱ� ������
	//Lendable �������̽��� checkOut�޼��尡 �־�� ������ ������ ����.
	 static void checkOutAll(Lendable[] arr, String borrower, String date) {
	for(Lendable a : arr) {
	    a.checkOut(borrower, date);
	}
		  
	}
}
