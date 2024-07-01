package lab52;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



	public class SquareJunit {

	    @Test
	    public void testArea() {
	        Point right_top = new Point(1, 1);
	        Point left_top = new Point(0, 1);
	        Point right_bottom = new Point(1, 0);
	        Point left_bottom = new Point(0, 0);

	        Square square = new Square(right_top, left_top, right_bottom, left_bottom);
	        assertEquals(1.0, square.area());
	    }

	    @Test
	    public void testPerimeter() {
	        Point right_top = new Point(1, 1);
	        Point left_top = new Point(0, 1);
	        Point right_bottom = new Point(1, 0);
	        Point left_bottom = new Point(0, 0);

	        Square square = new Square(right_top, left_top, right_bottom, left_bottom);
	        assertEquals(4.0, square.parameter());
	    }

	    @Test
	    public void testArea_NonUnitSquare() {
	        Point right_top = new Point(2, 2);
	        Point left_top = new Point(0, 2);
	        Point right_bottom = new Point(2, 0);
	        Point left_bottom = new Point(0, 0);

	        Square square = new Square(right_top, left_top, right_bottom, left_bottom);
	        assertEquals(4.0, square.area());
	    }

	    @Test
	    public void testPerimeter_NonUnitSquare() {
	        Point right_top = new Point(2, 2);
	        Point left_top = new Point(0, 2);
	        Point right_bottom = new Point(2, 0);
	        Point left_bottom = new Point(0, 0);

	        Square square = new Square(right_top, left_top, right_bottom, left_bottom);
	        assertEquals(8.0, square.parameter());
	    }
	}