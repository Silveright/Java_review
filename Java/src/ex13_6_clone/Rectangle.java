package ex13_6_clone;


public class Rectangle {
	int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	public String toString() {
		return "���δ� " +width +", ���δ� " +height;
	}
	public boolean equals(Object obj) {
		if(obj!= null && obj instanceof Rectangle ) {
			Rectangle r2 = (Rectangle)obj;//�ٿ�ĳ����
			return this.width == r2.width
					&& this.height == r2.height;
		} else {
			return false;
		}
	}
}
