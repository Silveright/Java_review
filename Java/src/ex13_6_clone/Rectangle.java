package ex13_6_clone;


public class Rectangle {
	int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	public String toString() {
		return "가로는 " +width +", 세로는 " +height;
	}
	public boolean equals(Object obj) {
		if(obj!= null && obj instanceof Rectangle ) {
			Rectangle r2 = (Rectangle)obj;//다운캐스팅
			return this.width == r2.width
					&& this.height == r2.height;
		} else {
			return false;
		}
	}
}
