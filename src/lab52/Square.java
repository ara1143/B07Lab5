package lab 4;

public class Square {
	Point right_top;
	Point left_top;
	Point right_bottom;
	Point left_bottom;
	
	public Square(Point right_top, Point left_top, Point right_bottom, Point left_bottom){
		this.right_top = right_top;
		this.left_top = left_top;
		this.right_bottom = right_bottom;
		this.left_bottom = left_bottom;	
	}

	public double area() {
		return Math.pow(right_top.distance(left_top), 2);
	}

	public double parameter() {
		return (right_top.distance(left_top))*4;
	}
}