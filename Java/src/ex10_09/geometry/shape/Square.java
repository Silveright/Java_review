package ex10_09.geometry.shape;

import ex10_09.geometry.common.Polygon;

public class Square extends Polygon{
	public Square(int x, int y, int sideLength) {
		super(4);//슈퍼클래스의 protected생성자호출
		setPoint(0,x,y);//슈퍼클래스의 protected메서드 호출
		setPoint(1,x + sideLength ,y);
		setPoint(2,x+ sideLength ,y +sideLength);
		setPoint(3,x,y +sideLength);
	}
	public int getX(int index) {
		return x[index];
	}
	public int getY(int index) {
		return y[index]; //슈퍼클래스의 protected필드 사용
	}
}
