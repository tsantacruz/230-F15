import java.util.ArrayList;


public class ShapeTester {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		// TODO each team should initialize 
		// a shape & add to shapes
//		Shape circle 	= new Circle(/* TODO parameters? */);
		Shape triangle 	= new Triangle(10.5);
//		Shape pentagon 	= new Pentagon(/* TODO parameters? */);
		Shape square	= new Square();
		Shape hexagon = new Hexagon();
		shapes.add(square);
		shapes.add(triangle);
		shapes.add(hexagon);
		
		for (Shape shape : shapes) {
			String s = 	"-------------------------------------";
			s +=			"Side Length: " + shape.getSideLength();
			s +=			"Num sides:   " + shape.getNumSides();
			s += 	 	"Area: 		  " + shape.getArea();
			s += 	 	"Perimeter: 	  " + shape.getPerimeter();
			s +=			"Height:		  " + shape.getHeight();
			s +=			"Width:		  " + shape.getWidth();
			s +=			"Angle:		  " + shape.getInteriorAngle();
			shape.setSideLength(5);
			s +=			"New Length:  " + shape.getSideLength();

		}
		
	}
}