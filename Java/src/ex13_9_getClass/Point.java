package ex13_9_getClass;

public class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y =y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}

}
