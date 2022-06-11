package ex13_4;

class Circle2 {
	int radius;
	Circle2(int radius){
		this.radius = radius;
	}
	public String toString() {
		return "radius =" + radius;
	}
	
	public boolean equals(Object obj) {
		if(obj!= null && obj instanceof Circle2 ) {
			Circle2 obj2 = (Circle2)obj;
			return this.radius == obj2.radius;
//			return radius ==((Circle2)obj).radius;
		}
		else {
			return false;
		}
	}
}
	

