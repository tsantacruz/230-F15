
public class Square_test {
	
	public static void main(String[] args) {
		Square s = new Square();
		String s = 	"-------------------------------------";
		s +=			"Side Length: " + square.getSideLength();
		s +=			"Num sides:   " + square.getNumSides();
		s += 	 	"Area: 		  " + square.getArea();
		s += 	 	"Perimeter: 	  " + square.getPerimeter();
		s +=			"Height:		  " + square.getHeight();
		s +=			"Width:		  " + square.getWidth();
		s +=			"Angle:		  " + square.getInteriorAngle();
		shape.setSideLength(5);
		s +=			"New Length:  " + square.getSideLength();
		s +=			"-------------------------------------";
		System.out.println(s);
	}

}





