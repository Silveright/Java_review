package ex07_object_circle_private_field.copy;

public class Circle {
	//À‰µå (¸â¹öº¯¼ö)
	private double radius;
	
	final double PI = 3.14;
	Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {
	return radius * radius * PI;
	}
	
	
		
	
} 
	
	

	

