package ex17_07_SharedArea_solution;
//공유 영역 클래스
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
	
	//공유데이터가 쓰여졌는지 여부를 표현하는 필드-디폴트(false)
	//calthread 클래스에서 cal 끝나면 result 필드에 저장하고, isReady에 true값을 준다.
	private boolean isReady;
	
	public boolean isReady() {
		return isReady;
	}
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}
}
