//protected ������Ҹ� �����ϴ� Ŭ������ ��
//protected�� ���� ����, �޼���� ���� ��Ű�� ���� Ŭ���� �Ǵ�
//�ش� Ŭ������ ��ӹ��� �ܺ� ��Ű���� Ŭ�������� ������ �����ϴ�

package ex10_09.geometry.common;

public class Polygon {
	public int x[];
	protected int y[]; //�������� y��ǥ
	protected Polygon(int size) {//������
		x = new int[size];
		setY(new int[size]);
	}
	//�������� ��ǥ ����
	protected void setPoint(int index, int x, int y) {
		this.x[index] = x;
		this.getY()[index] = y;
		
	}
	public int[] getY() {
		return y;
	}
	public void setY(int y[]) {
		this.y = y;
	}
}
