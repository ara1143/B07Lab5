package lab4;

public class Circle {
	Point center;
	double radius;

	public Circle(Point A, double r) {
		this.radius = r;
		this.center = A;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double circumference() {
		return 2 * Math.PI * radius;
	}
}