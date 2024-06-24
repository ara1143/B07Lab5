package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testConstructorC() {
		
		Point p = new Point(0,0);
		Circle c = new Circle(p, 7);
		assertEquals(c.center, p);
	}

	@Test
	void testConstructorR() {
		
		Point p = new Point(0,0);
		Circle c = new Circle(p, 7);
		assertEquals(c.radius, 7);
	}
	
	@Test
	void testArea() {
		
		Point p = new Point(0,0);
		Circle c = new Circle(p,0);
		assertEquals(c.area(), 0);
	}
	
	@Test
	void testCircumference() {
		
		Point p = new Point(0,0);
		Circle c = new Circle(p,1);
		assertEquals(c.circumference(), 2*Math.PI);
	}
	
}
