package ex17_07_SharedArea_solution;
//���� ���� Ŭ����
public class SharedArea {
	private double result;
	
	SharedArea(){
		
	}
	
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	//���������Ͱ� ���������� ���θ� ǥ���ϴ� �ʵ�-����Ʈ(false)
	//calthread Ŭ�������� cal ������ result �ʵ忡 �����ϰ�, isReady�� true���� �ش�.
	private boolean isReady;
	
	public boolean isReady() {
		return isReady;
	}
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}
}
