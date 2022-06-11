/*
 * private �ʵ带 ���� Ŭ������ ��
 * 
 * ��ü ���� ���α׷����� �ֿ� Ư¡ �� �ϳ��� �ν�ȭ�� Ŭ���� ����� Ŭ���� ���ο� ���ߴ� ��
 * Ŭ���� ����� �ܺο��� ������ �� ������ �����ϱ� ���� private�� ���
 * ������ �Ϻ� ����� �ܺ� Ŭ������ ����� �� �ֵ��� ���� �ؾ� �Ѵ�
 * ���� �������� ������ ���� ȸ�θ� ĸ��ȭ�ؼ� ���������� ���� ��ư, �������� ��ư ���� 
 * �ܺο� �����ؼ� ����� �� �ְ� �Ѵ�
 * ��ó�� Ŭ���� ���ο� ������ �ʵ带 �ܺο��� ����� �� �ֵ��� 
 * Getter �� Setter�� �����Ѵ�
 * �Ϲ������� Getter�� get Setter�� set���� �����ϴ� �̸��� ����Ѵ�
 * radius �ʵ忡 �����ϱ� ���ؼ� getRadius(), setRadius()�޼��带 �����
*/

package ex07_object_circle_private_field.copy;

public class Circle2 {
	//���� (�������)
	// ���������� private�� Ŭ���� ���ο����� ��밡���ϴ� -> ������ ����
	private double radius;
	
	final double PI = 3.14;
	Circle2(double radius) {
		this.radius = radius;
	}

	//getter�޼���
	double getArea() {
		return radius *radius *PI;
	}
	public double getRadius() {
		return radius;
	}
	
	//setter �޼���
	public void setRadius(double radius) {
		this.radius = radius;
	}
} 
	
	

	

