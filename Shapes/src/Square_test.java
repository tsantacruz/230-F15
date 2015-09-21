
public class Square_test extends Square{
	
	public static void main(String[] args) {
		Square square = new Square ();
	
		String s = 	"-------------------------------------";
		
		s +=			"Side Length: " + square.getSideLength();
		s +=			"Num sides:   " + square.getNumSides();
		s += 	 	"Area: 		  " + square.getArea();
		s += 	 	"Perimeter: 	  " + square.getPerimeter();
		s +=			"Height:		  " + square.getHeight();
		s +=			"Width:		  " + square.getWidth();
		s +=			"Angle:		  " + square.getInteriorAngle();
		square.setSideLength(5);
		s +=			"New Length:  " + square.getSideLength();
		s +=			"-------------------------------------";
		System.out.println(s);
	}

}





